/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author waner
 */
public class BD {
    private static Connection connection;
    private static String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10660697";
    private static String user = "sql10660697";
    private static String password = "PbiCiNRhJ3";

    private BD() {
    }
    
    public static Connection getConexion(){
        if (connection == null) {
            try {
                Class.forName(driver);
                connection = (Connection) DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        return connection;
    }
}
