
package BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexiones {
    private final String URL = "C:/Users/jason/Documents/Ucentral/PROYECTO INGENIERIA DE SOFTWARE"
            + "/ProyectoPlanificador/src/main/webapp/db/planesViajes.db";
    
    public Connection conectarse(){
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conexion = DriverManager.getConnection("jdbc:sqlite:"+URL); 
            return conexion;
            
        } catch (ClassNotFoundException | SQLException ex) {
            ;
        }
        return null;
    }
    public void desconectase(Connection dato){
        if (dato != null){
            try {
                dato.close();
            } catch (SQLException ex) {
                ;
            }
        }
    }
}
