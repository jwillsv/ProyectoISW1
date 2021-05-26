/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.plan;

import BBDDOperacionesRegistros.OperacionesReg;
import dao.Registros;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author jason
 */
@ManagedBean
@RequestScoped
public class CountryDatesBean {

    private Date fechaInicial;
    private Date fechaFinal;
    private String eleccionPais;
    private String paisSeleccionado;

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

    public String eleccionDestino() {
        switch (eleccionPais) {
            case "Seleccione un País":
                paisSeleccionado = "";
                break;
            case "Afganistan":
                paisSeleccionado = eleccionPais;
                break;
            case "Andorra":
                paisSeleccionado = eleccionPais;
                break;
            case "Estados Unidos":
                paisSeleccionado = eleccionPais;
                break;
            case "Eslovaquia":
                paisSeleccionado = eleccionPais;
                break;
            case "Estambul":
                paisSeleccionado = eleccionPais;
                break;
            case "España":
                paisSeleccionado = "Espaya";
                break;
            case "Egipto":
                paisSeleccionado = eleccionPais;
                break;
            case "Francia":
                paisSeleccionado = eleccionPais;
                break;
            case "Finlandia":
                paisSeleccionado = eleccionPais;
                break;
            case "Italia":
                paisSeleccionado = eleccionPais;
                break;
            case "India":
                paisSeleccionado = eleccionPais;
                break;
            case "Reino Unido":
                paisSeleccionado = eleccionPais;
                break;
            case "Rep checa":
                paisSeleccionado = eleccionPais;
                break;
            case "Rumania":
                paisSeleccionado = eleccionPais;
                break;
            case "Ruanda":
                paisSeleccionado = eleccionPais;
                break;
            case "Rusia":
                paisSeleccionado = eleccionPais;
                break;
            case "Suiza":
                paisSeleccionado = eleccionPais;
                break;

        }
        return paisSeleccionado;
    }

    public String validarFechas() 
    {
        OperacionesReg r = new OperacionesReg();
        Registros reg = new Registros();
        reg.setPaisSeleccionado(eleccionDestino());
        reg.setFechaInicioR(fechaInicial);
        reg.setFechaFinalR(fechaFinal);
        if (fechaInicial == null || fechaFinal == null) {
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "La información esta en blanco. Termine los campos"));
        } else {
            if (fechaInicial.toString().isEmpty() || fechaFinal.toString().isEmpty()) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "La información esta en blanco. Termine los campos"));
            } else {
                if (fechaInicial.getDate() >= fechaFinal.getDate()) {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "Fechas no concordantes"));
                } else {
                    if(r.loadInfoRegistro(reg) > 0)
                    {
                       FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Info", "Fechas validas"));
                       return "equipajes"; 
                    }
                    else
                    {
                        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Info", "Hay problemas en la unidad de almacenamiento, vuelva más tarde"));
                    }
                }

            }
        }
        return null;

    }

}
