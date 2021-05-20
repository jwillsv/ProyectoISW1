/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BBDDOperaciones;

import dao.Usuarios;
import java.util.List;

/**
 *
 * @author jason
 * @param 
 */
public interface OperacionesUsuario<U> 
{
    public int insertar(U dato);
    public boolean registro(String nombre, String pass);
}
