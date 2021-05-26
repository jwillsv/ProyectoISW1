/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import BBDD.Conexiones;
import BBDDOperaciones.OperUser;
import BBDDOperacionesEquipaje.OperEquipaje;
import dao.Equipaje;
import dao.Usuarios;
import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jason
 */
public class UsuariosTest {
    
    public UsuariosTest() {
    }

    
    @Test
    public void conexiones()
    {
       Conexiones c = new Conexiones();
       Connection cActiva = c.conectarse();
       assertNotNull(cActiva);           
    }
    @Test
    public void UsuarioInsertar()
    {
       OperUser u = new OperUser();
       Usuarios user = new Usuarios();
       user.setNombreUsuario("carlos");
       user.setContrasena("1234");
       int test = u.insertar(user);
       assertNotEquals(0, test);
            
    }
    @Test
    public void UsuarioRegistro()
    {
       OperUser u = new OperUser();
       Usuarios user = new Usuarios();
       boolean test = u.registro("Jason","1234");
       assertTrue(test);
    } 
    
}
