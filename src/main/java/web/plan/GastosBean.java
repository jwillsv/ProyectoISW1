
package web.plan;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.List;

@ManagedBean
@RequestScoped
public class GastosBean 
{
    private String eleccionPais;
    private String paisSeleccionado = "Alemania";
    private List<String> imagesSelect;
    private String paisElegido;
    private String mensajeAct1;
    private String mensajeAct2;
    private String mensajeAct3;
    private String mensajeAct4;
    private String mensajeAct5;

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
    

    public String getMensajeAct1() {
        return mensajeAct1;
    }

    public void setMensajeAct1(String mensajeAct1) {
        this.mensajeAct1 = mensajeAct1;
    }

    public String getMensajeAct2() {
        return mensajeAct2;
    }

    public void setMensajeAct2(String mensajeAct2) {
        this.mensajeAct2 = mensajeAct2;
    }

    public String getMensajeAct3() {
        return mensajeAct3;
    }

    public void setMensajeAct3(String mensajeAct3) {
        this.mensajeAct3 = mensajeAct3;
    }

    public String getMensajeAct4() {
        return mensajeAct4;
    }

    public void setMensajeAct4(String mensajeAct4) {
        this.mensajeAct4 = mensajeAct4;
    }

    public String getMensajeAct5() {
        return mensajeAct5;
    }

    public void setMensajeAct5(String mensajeAct5) {
        this.mensajeAct5 = mensajeAct5;
    }
    
    public void seleccion()
    {
        
    }
            
    
    
    
    public List<String> imagenDestino() {
        if (paisSeleccionado.contentEquals("Alemania")) {
            for (int i = 1; i <= 4; i++) {
                imagesSelect.add(paisSeleccionado + "/" + i + ".jpg");
            }
        } else if (paisSeleccionado.contentEquals("Estados Unidos")) {
            for (int i = 1; i <= 4; i++) {
                imagesSelect.add(paisSeleccionado + "/" + i + ".jpg");
            }

        } else if (paisSeleccionado.contentEquals("Francia")) {
            for (int i = 1; i <= 4; i++) {
                imagesSelect.add(paisSeleccionado + "/" + i + ".jpg");
            }
        } else if (paisSeleccionado.contentEquals("España")) {
            for (int i = 1; i <= 4; i++) {
                imagesSelect.add(paisSeleccionado + "/" + i + ".jpg");
            }
        } else if (paisSeleccionado.contentEquals("Rusia")) {
            for (int i = 1; i <= 4; i++) {
                imagesSelect.add(paisSeleccionado + "/" + i + ".jpg");
            }

        }
        return imagesSelect;
    }

    public void mensajes() {
        if (paisSeleccionado.contentEquals("Alemania")) {
            this.mensajeAct1 = "Actividad Surf: $500000";
            this.mensajeAct2 = "Actividad vuelos: $1700000";
            this.mensajeAct3 = "Actividad Realidad Virtual: $500000";
            this.mensajeAct4 = "Actividad : Visitas: $700000";
            this.mensajeAct5 = "Actividad Surf: Paseos: $500000";
        } else if (paisSeleccionado.contentEquals("Estados Unidos")) {
            this.mensajeAct1 = "Actividad Surf: $500000";
            this.mensajeAct2 = "Actividad vuelos: $1700000";
            this.mensajeAct3 = "Actividad Realidad Virtual: $500000";
            this.mensajeAct4 = "Actividad : Visitas: $700000";
            this.mensajeAct5 = "Actividad Surf: Paseos: $500000";

        } else if (paisSeleccionado.contentEquals("Francia")) {
            this.mensajeAct1 = "Actividad Surf: $500000";
            this.mensajeAct2 = "Actividad vuelos: $1700000";
            this.mensajeAct3 = "Actividad Realidad Virtual: $500000";
            this.mensajeAct4 = "Actividad : Visitas: $700000";
            this.mensajeAct5 = "Actividad Surf: Paseos: $500000";

        } else if (paisSeleccionado.contentEquals("España")) {
            this.mensajeAct1 = "Actividad Surf: $500000";
            this.mensajeAct2 = "Actividad vuelos: $1700000";
            this.mensajeAct3 = "Actividad Realidad Virtual: $500000";
            this.mensajeAct4 = "Actividad : Visitas: $700000";
            this.mensajeAct5 = "Actividad Surf: Paseos: $500000";

        } else if (paisSeleccionado.contentEquals("Rusia")) {
            this.mensajeAct1 = "Actividad Surf: $500000";
            this.mensajeAct2 = "Actividad vuelos: $1700000";
            this.mensajeAct3 = "Actividad Realidad Virtual: $500000";
            this.mensajeAct4 = "Actividad : Visitas: $700000";
            this.mensajeAct5 = "Actividad Surf: Paseos: $500000";

        }
    }

    
}
