/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import BBDDOperacionesEquipaje.OperEquipaje;
import dao.Equipaje;
import java.util.List;
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
public class EquipajeTest {
    
    public EquipajeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void EquipajeInsertar()
    {
       OperEquipaje u = new OperEquipaje();
       Equipaje e = new Equipaje();
       e.setNombreIntegrante("Alejandro");
       e.setPesoEquipaje(13.45);
       e.setValorEquipaje(50000);
       int test = u.insertarInfo(e);
       assertNotEquals(0, test);
             
    }
    @Test
    public void consultarEquipaje()
    {
       OperEquipaje u = new OperEquipaje();
       Equipaje e = new Equipaje();
       List<Equipaje> test =  u.consultar();
       assertNotNull(test);
        
    }
}
