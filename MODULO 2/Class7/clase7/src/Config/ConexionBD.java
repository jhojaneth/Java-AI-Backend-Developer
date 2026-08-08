package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static String URL="jdbc:mysql://localhost:3306/gimnasio";
    private static String USUARIO="root";
    private static String CLAVE="enginner";
    private ConexionBD(){
    }
    public static Connection obtenerConexion() throws SQLException {
    return DriverManager.getConnection(URL,USUARIO,CLAVE);
    }
}
