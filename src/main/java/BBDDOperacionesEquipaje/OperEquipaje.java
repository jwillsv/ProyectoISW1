/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BBDDOperacionesEquipaje;

import BBDDOperaciones.*;
import BBDD.Conexiones;
import dao.Equipaje;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OperEquipaje implements OperacionesEquipaje<Equipaje> {

    @Override
    public int insertarInfo(Equipaje dato) {
        Conexiones c = new Conexiones();
        Connection cActiva = c.conectarse();
        if (cActiva != null) {
            try {
                String sql = "insert into equipaje (nombreIntegrante, pesoEquipaje, valorEquipaje) values (?,?,?)";
                PreparedStatement ps = cActiva.prepareStatement(sql);
                ps.setString(1, dato.getNombreIntegrante());
                ps.setDouble(2, dato.getPesoEquipaje());
                ps.setInt(3, dato.getValorEquipaje());
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

    public List<Equipaje> consultar() {
        Conexiones c = new Conexiones();
        Connection cActiva = c.conectarse();
        List<Equipaje> datos = new ArrayList<>();
        if (cActiva != null) {
            try {
                String sql = "select * from equipaje";
                PreparedStatement ps = cActiva.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Equipaje e = new Equipaje();
                    e.setNombreIntegrante(rs.getString("nombreIntegrante"));
                    e.setPesoEquipaje(rs.getDouble("pesoEquipaje"));
                    e.setValorEquipaje(rs.getInt("valorEquipaje"));
                    datos.add(e);

                }

            } catch (SQLException ex) {
                Logger.getLogger(OperEquipaje.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                c.desconectase(cActiva);
            }
        }
        return datos;
    }

}
