package web.plan;



import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.List;

@ManagedBean
@RequestScoped
public class ImagenBean {


     
    private String eleccionPais;
    private String paisSeleccionado = "Rusia" ;
    private List<String> imagesSelect;
    private String paisElegido;
    private String mensajeAct;
    private Integer montoEmergencia;
    private int i;

    public String getEleccionPais() {
        return eleccionPais;
    }

    public void setEleccionPais(String eleccionPais) {
        this.eleccionPais = eleccionPais;
    }

    public String getPaisSeleccionado() {
        return paisSeleccionado;
    }

    public void setPaisSeleccionado(String paisSeleccionado) {
        this.paisSeleccionado = paisSeleccionado;
    }
    

    public List<String> getImagesSelect() {
        return imagesSelect;
    }

    public void setImagesSelect(List<String> imagesSelect) {
        this.imagesSelect = imagesSelect;
    }

    public String getPaisElegido() {
        return paisElegido;
    }

    public void setPaisElegido(String paisElegido) {
        this.paisElegido = paisElegido;
    }

    public String getMensajeAct() {
        return mensajeAct;
    }

    public void setMensajeAct(String mensajeAct) {
        this.mensajeAct = mensajeAct;
    }

    public Integer getMontoEmergencia() {
        return montoEmergencia;
    }

    public void setMontoEmergencia(Integer montoEmergencia) {
        this.montoEmergencia = montoEmergencia;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String mensajes() {
        if (paisSeleccionado.contentEquals("Alemania")) {
            this.mensajeAct = "Actividad Surf: $500000\n"
                    + "Actividad Paseos: $320000\n     "
                    + "Actividad Caminatas: $4300000\n"
                    + "Actividad: Festivales: 500000\n"
                    + "Actividad: Sitios turisticos $900000";
        } else if (paisSeleccionado.contentEquals("Estados Unidos")) {
            this.mensajeAct = "Actividad Parqus: $800000\n"
                    + "Actividad Playas: $400000\n     "
                    + "Actividad Fiestas: $500000\n"
                    + "Actividad: Carnavales 500000\n"
                    + "Actividad: Sitios turisticos $900000";
        } else if (paisSeleccionado.contentEquals("Francia")) {
            this.mensajeAct = "Actividad Visitas: $800000\n"
                    + "Actividad Fiestas: $900000\n     "
                    + "Actividad Almuerzos Restaurantes: $700000\n"
                    + "Actividad: Carnavales $8500000\n"
                    + "Actividad: Parques $900000";
        } else if (paisSeleccionado.contentEquals("España")) {
            this.mensajeAct = "Actividad Bailes Danzas: $800000\n"
                    + "Actividad Almuerzos: $400000\n     "
                    + "Actividad Paseos: $600000\n"
                    + "Actividad: Carnavales $8500000\n"
                    + "Actividad: Parques $900000";
        } else if (paisSeleccionado.contentEquals("Rusia")) {
             this.mensajeAct = "Actividad Bailes Danzas: $800000\n"
                    + "Actividad Almuerzos: $400000\n     "
                    + "Actividad Paseos: $600000\n"
                    + "Actividad: Carnavales $8500000\n"
                    + "Actividad: Parques $900000";
        }
        return mensajeAct;
    }


}
