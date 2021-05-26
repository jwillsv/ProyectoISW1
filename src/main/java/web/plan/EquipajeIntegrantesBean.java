package web.plan;

import BBDDOperacionesEquipaje.OperEquipaje;
import dao.Equipaje;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class EquipajeIntegrantesBean {

    private List<Equipaje> listaEquipaje;
    private String nombreIntegrante;
    private Double pesoEquipaje;
    private Integer valorEquipaje;
    private String mensaje;

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

    public Integer getValorEquipaje() {
        return valorEquipaje;
    }

    public void setValorEquipaje(Integer valorEquipaje) {
        this.valorEquipaje = valorEquipaje;
    }

    public EquipajeIntegrantesBean() 
    {       
        OperEquipaje equipaje = new OperEquipaje();
        this.listaEquipaje = equipaje.consultar();
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public List<Equipaje> getListaEquipaje() {
        return listaEquipaje;
    }

    public void setListaEquipaje(List<Equipaje> listaEquipaje) {
        this.listaEquipaje = listaEquipaje;
    }

    public String insertarInfo() {
        OperEquipaje equipaje = new OperEquipaje();
        Equipaje equi = new Equipaje();
        equi.setNombreIntegrante(nombreIntegrante);
        equi.setPesoEquipaje(pesoEquipaje);
        if (pesoEquipaje > 23) {
            equi.setValorEquipaje(valorEquipaje + 120000);
        } else {
            equi.setValorEquipaje(valorEquipaje);
        }
        if (nombreIntegrante.isEmpty() || pesoEquipaje == null || valorEquipaje == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "Las casillas están vacias, complete todos los campos"));
        } else {
            if (!nombreIntegrante.matches("[A-Za-z]+|[a-z]+$")) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "Para el integrante, no es un nombre, escribalo de nuevo"));
            } else {
                if (pesoEquipaje.toString().matches("^[[0-9]+] | ^[[0-9]+.[0-9]+]$") || pesoEquipaje < 0) {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "El peso no un valor de tipo flotante o es negativo"
                            + "Ejemplos aceptados 7.0, 1231.222 , 99.00, digitelo de nuevo"));
                } else {
                    if (valorEquipaje.toString().matches("^[[0-9]+]$") || valorEquipaje < 0) {
                        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "El valor del equipaje no un valor entero o es negativo"
                                + "Ejemplos aceptados 99999, 120000, 123, digitelo de nuevo"));

                    } else {
                        if (equipaje.insertarInfo(equi) > 0) {
                            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Información Equipaje creada con exito exito"));
                            return "siguiente";
                        } else {
                            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "Se presentó inconveniente en el almacenamiento, intente mas tarde "));
                        }
                    }
                }
            }
        }
        return null;
    }
}
