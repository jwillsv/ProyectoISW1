/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.plan;

import BBDDOperaciones.OperUser;
import dao.Usuarios;
import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class NuevoUsuarioBean {

    private String nombreUsuario;
    private String contrasena;
    private String verifyContrasena;
    private String mensaje;

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getVerifyContrasena() {
        return verifyContrasena;
    }

    public void setVerifyContrasena(String verifyContrasena) {
        this.verifyContrasena = verifyContrasena;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String validar() {
        OperUser usuario = new OperUser();
        Usuarios nuevo = new Usuarios();
        nuevo.setNombreUsuario(nombreUsuario);
        nuevo.setContrasena(contrasena);
        System.out.println("Usuario Viaje " + usuario);
        this.mensaje = "Usuario Verificado";
        if (nombreUsuario.isEmpty() || contrasena.isEmpty() || verifyContrasena.isEmpty()) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "Los datos estan vacios o faltan por llenar"));
        } else {
            if (!nombreUsuario.matches("[A-Za-z]+|[a-z]+")) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "El nombre no se ha digitado correctamente "
                        + "(Solo cadenas que no aceptan números o letras con tilde o con carácteres especiales (Ejemplo @,#,$.%.& etc.))"));
            } else {
                if (!contrasena.equals(verifyContrasena)) {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "La contraseña no coincide con la verificación"));
                } else {
                    if (usuario.insertar(nuevo) > 0) {
                        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Usuario Creado con exito"));
                        return "login";
                    } else {
                        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "Se presentó inconveniente en el almacenamiento, intente mas tarde "));
                    }
                }
            }
        }
        return null;
    }
    public String salir()
    {
       return "login"; 
    }

}
