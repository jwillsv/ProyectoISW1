package dao;

import java.util.Date;

public class CountryDates 
{
    private Date fechaInicial;
    private Date fechaFinal;
    private Paises paises;

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Paises getPaises() {
        return paises;
    }

    public void setPaises(Paises paises) {
        this.paises = paises;
    }
    
    public String toString()
    {
        return this.fechaInicial + " " +
                this.fechaFinal  + " " +
                this.paises.getPais();
    }
    
}
