package web.plan;

import BBDDOperacionesEquipaje.OperEquipaje;
import dao.Equipaje;
import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class EquipajeIntegrantesBean {

    private String nombreIntegrante;
    private Double pesoEquipaje;
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

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String insertarInfo() {
        OperEquipaje equipaje = new OperEquipaje();
        Equipaje equi = new Equipaje();
        equi.setNombreIntegrante(nombreIntegrante);
        equi.setPesoEquipaje(pesoEquipaje);
        if (nombreIntegrante.isEmpty() || pesoEquipaje.isNaN()) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "Las casillas están vacias, complete todos los campos"));
        } else {
            if (!nombreIntegrante.matches("[A-Za-z]+|[a-z]+")) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "Para el integrante, no es un nombre, escribalo de nuevo"));
            } else {
                if (pesoEquipaje % 1 == 0) {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "El peso no un valor de tipo flotante, digitelo de nuevo"));
                } else {
                    if (equipaje.insertarInfo(equi) > 0) {
                        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Usuario Creado con exito"));
                        return "gastos";
                    } else {
                        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "Se presentó inconveniente en el almacenamiento, intente mas tarde "));
                    }
                }
            }
        }
        return null;
    }
}
