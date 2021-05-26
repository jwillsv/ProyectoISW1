
package dao;

import java.util.Date;

public class Registros 
{
    private Long id;
    private Date fechaInicioR;
    private Date fechaFinalR;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaInicioR() {
        return fechaInicioR;
    }

    public void setFechaInicioR(Date fechaInicioR) {
        this.fechaInicioR = fechaInicioR;
    }

    public Date getFechaFinalR() {
        return fechaFinalR;
    }

    public void setFechaFinalR(Date fechaFinalR) {
        this.fechaFinalR = fechaFinalR;
    }
    
    @Override
     public String toString()
    {
        return this.id + " " +
               this.fechaInicioR + " " +
               this.fechaFinalR;
               
               
    }
    
}
