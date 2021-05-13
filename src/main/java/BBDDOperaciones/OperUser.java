package BBDDOperaciones;

import BBDD.Conexiones;
import BBDDOperaciones.OperacionesUsuario;

import dao.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
    public Usuarios registro(String nombre, String contrasena)
    {
       Conexiones c = new Conexiones();
       Connection cActiva = c.conectarse();
       List<Usuarios> datos = new ArrayList<>();
        if (cActiva != null) {
            try {
                String sql = "select * from planesViajes where nombreUsuario = ? and contrasena = ?" ;
                PreparedStatement ps = cActiva.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Usuarios user = new Usuarios();
                    ps.setString(1, nombre);
                    ps.setString(2, contrasena);
                    user.setNombreUsuario(rs.getString("nombreEmpleado"));
                    user.setContrasena(rs.getString("edadEmpleado"));                  
                    datos.add(user);                                       
                }
            } catch (SQLException ex) {
                Logger.getLogger(OperUser.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                c.desconectase(cActiva);
            }
        }
        return null;
    }
}