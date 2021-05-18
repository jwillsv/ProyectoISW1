package dao;

public class Equipaje 
{
    private Long id;
    private String nombreIntegrante;
    private Double pesoEquipaje;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreIntegrante() {
        return nombreIntegrante;
    }

    public void setNombreIntegrante(String nombreIntegrante) {
        this.nombreIntegrante = nombreIntegrante;
    }

    public Double getPesoEquipaje() {
        return pesoEquipaje;
    }

    public void setPesoEquipaje(Double pesoEquipaje) {
        this.pesoEquipaje = pesoEquipaje;
    }

   
    
    @Override
    public String toString()
    {
        return this.nombreIntegrante +" "+
               this.pesoEquipaje;
    }

    
}
