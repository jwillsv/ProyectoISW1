package dao;

public class CountryDates 
{
    private Long id;
    private String fechaInicial;
    private String fechaFinal;;
    private String paisSeleccionado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(String fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    

    public String getPaisSeleccionado() {
        return paisSeleccionado;
    }

    public void setPaisSeleccionado(String paisSeleccionado) {
        this.paisSeleccionado = paisSeleccionado;
    }
    
   
    @Override
    public String toString()
    {
        return this.fechaInicial + " " +
                this.fechaFinal + " " +
                this.paisSeleccionado;
 
    }
    
}
