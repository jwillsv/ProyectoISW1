/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BBDDOperacionesRegistros;

import dao.Registros;

/**
 *
 * @author jason
 */
public interface OperReg<R> 
{
    public int loadInfoRegistro(Registros R);
    
}
