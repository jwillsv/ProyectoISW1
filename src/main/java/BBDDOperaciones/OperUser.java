package BBDDOperaciones;

import BBDD.Conexiones;
import dao.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jason
 */
public class OperUser implements OperacionesUsuario<Usuarios> {

    @Override
    public int insertar(Usuarios dato) {
        Conexiones c = new Conexiones();
        Connection cActiva = c.conectarse();
        if (cActiva != null) {
            try {
                String sql = "insert into usuarios (nombreUsuario, contrasena) values (?,?)";
                PreparedStatement ps = cActiva.prepareStatement(sql);
                ps.setString(1, dato.getNombreUsuario());
                ps.setString(2, dato.getContrasena());
                int rta = ps.executeUpdate();
                return rta;
            
            } catch (SQLException ex) {
                Logger.getLogger(OperUser.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                c.desconectase(cActiva);
            }
        }
        return 0;

    }
    @Override
    public boolean registro(String nombreUsuario, String contrasena)
    {
       Conexiones c = new Conexiones();
       Connection cActiva = c.conectarse();
        if (cActiva != null) {
            try {
                String sql = "select * from usuarios where nombreUsuario = ? and contrasena = ?" ;
                PreparedStatement ps = cActiva.prepareStatement(sql);
                ps.setString(1, nombreUsuario);
                ps.setString(2, contrasena);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) 
                {
                    return true;                                              
                }
                else if(!rs.next())
                {
                    return false;
                }
            } catch (SQLException ex) {
                Logger.getLogger(OperUser.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                c.desconectase(cActiva);
            }
        }
        return false;
    }
}