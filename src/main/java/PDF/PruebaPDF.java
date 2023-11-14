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
import java.util.List;

public class PruebaPDF {

    public static void main(String[] args) {
        crearTablaDesdeJSON("C:\\Users\\leona\\OneDrive\\Documentos\\NetBeansProjects\\TareaTema2Agenda\\src\\resources\\info.json", new TypeToken<List<ContactoMujer>>(){}.getType());
    }

    public static void crearTablaDesdeJSON(String jsonFilePath, Type listType) {
        try {
             Document doc = new Document();
            PdfWriter.getInstance(doc, new FileOutputStream("tabla.pdf"));
            doc.open();

            // Lee el contenido del archivo JSON
            String jsonContent = leerContenidoJson(jsonFilePath);

            // Convierte el JSON a una lista de objetos ContactoMujer
            Gson gson = new Gson();
            List<ContactoMujer> contactos = gson.fromJson(jsonContent, listType);
            System.out.println(contactos.get(0).getClass().getDeclaredFields().length);
            // Crea la tabla
            PdfPTable tabla = new PdfPTable(contactos.get(0).getClass().getDeclaredFields().length);

            // Agrega los encabezados de la tabla (nombres de los campos del primer objeto)
            for (java.lang.reflect.Field field : contactos.get(0).getClass().getDeclaredFields()) {
                tabla.addCell(field.getName());
            }

            // Agrega los datos de los contactos a la tabla
            for (ContactoMujer contacto : contactos) {
                for (java.lang.reflect.Field field : contacto.getClass().getDeclaredFields()) {
                    field.setAccessible(true);
                    tabla.addCell(String.valueOf(field.get(contacto)));
                }
            }

            doc.add(tabla);
            doc.close();
        } catch (DocumentException | IOException | IllegalAccessException e) {
            e.printStackTrace();
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
        // Manejar la excepción específica (puedes imprimir un mensaje o lanzarla nuevamente)
        System.err.println("Error al leer el archivo JSON: " + e.getMessage());
        throw e;
    }
    return content.toString();
    }
}

