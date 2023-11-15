package PDF;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mycompany.tareatecnicas.Models.ContactoMujer;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.reflect.Field;

public class PruebaPDF {

    public static void main(String[] args) {
        crearTablaDesdeJSON(
                "src\\resources\\info.json",
                new TypeToken<List<ContactoMujer>>() {
                }.getType());
    }

    private static List<Field> obtenerTodosLosCampos(Class<?> type) {
        List<Field> fields = new ArrayList<>();
        for (Class<?> c = type; c != null; c = c.getSuperclass()) {
            fields.addAll(Arrays.asList(c.getDeclaredFields()));
        }
        return fields;
    }

    public static void crearTablaDesdeJSON(String jsonFilePath, Type listType) {
        Document doc = new Document();
        PdfWriter writer = null;
        try {
            writer = PdfWriter.getInstance(doc, new FileOutputStream("tabla.pdf"));
            doc.open();

            // Lee el contenido del archivo JSON
            String jsonContent = leerContenidoJson(jsonFilePath);

            // Convierte el JSON a una lista de objetos ContactoMujer
            Gson gson = new Gson();
            List<ContactoMujer> contactos = gson.fromJson(jsonContent, listType);

            // Crea la tabla
            List<Field> campos = obtenerTodosLosCampos(contactos.get(0).getClass());
            PdfPTable tabla = new PdfPTable(campos.size());

            // Agrega los encabezados de la tabla (nombres de los campos del primer objeto)
            for (Field field : campos) {
                tabla.addCell(field.getName());
            }

            // Agrega los datos de los contactos a la tabla
            for (ContactoMujer contacto : contactos) {
                for (Field field : campos) {
                    try {
                        field.setAccessible(true); // Hacer el campo accesible
                        Object value = field.get(contacto); // Obtener el valor del campo
                        tabla.addCell(String.valueOf(value)); // Añadir el valor a la tabla
                    } catch (IllegalAccessException e) {
                        System.err.println("Error al acceder al campo " + field.getName() + ": " + e.getMessage());
                    }
                }
            }

            doc.add(tabla);
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        } finally {
            if (doc != null) {
                doc.close();
            }
            if (writer != null) {
                writer.close();
            }
        }
    }

    private static String leerContenidoJson(String jsonFilePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (FileReader reader = new FileReader(jsonFilePath)) {
            int character;
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }
        } catch (IOException e) {
            // Manejar la excepción específica (puedes imprimir un mensaje o lanzarla
            // nuevamente)
            System.err.println("Error al leer el archivo JSON: " + e.getMessage());
            throw e;
        }
        return content.toString();
    }
}
