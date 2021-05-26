/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BBDDOperacionesRegistros;

import BBDD.Conexiones;
import BBDDOperaciones.OperUser;
import dao.Registros;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OperacionesReg implements OperReg<Registros> 
{
    @Override
    public int loadInfoRegistro(Registros dato) {
        Conexiones c = new Conexiones();
        Connection cActiva = c.conectarse();
        if (cActiva != null) {
            try {
                String sql = "insert into registros (paisSeleccionado, fechaInicio, fechaFinal) values (?,?,?)";
                PreparedStatement ps = cActiva.prepareStatement(sql);
                ps.setString(1, dato.getPaisSeleccionado());
                ps.setString(2, dato.getFechaInicioR().toString());
                ps.setString(3, dato.getFechaFinalR().toString());
                int rta = ps.executeUpdate();
                return rta;
            
            } catch (SQLException ex) {
                Logger.getLogger(OperReg.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                c.desconectase(cActiva);
            }
        }
        return 0;

    }
    
}
