package web.plan;

import BBDDOperaciones.OperUser;
import dao.Usuarios;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class LoginManageBean {

    private String nombreUsuario;
    private String contrasena;
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

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    

    public LoginManageBean() {

    }

    public String ingresar() {
        OperUser usuario = new OperUser();
        Usuarios user = new Usuarios();
        user.setNombreUsuario(nombreUsuario);
        user.setContrasena(contrasena);
        this.mensaje = "Listo Bienvenido";
        boolean validacion = usuario.registro(nombreUsuario, contrasena);
        if (nombreUsuario.isEmpty() || contrasena.isEmpty()) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "Los datos no estan llenados o faltan datos por llenar"));

        } else {
            if (!nombreUsuario.matches("[A-Za-z]+|[a-z]+")) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "El nombre no se ha digitado correctamente "
                        + "(Solo cadenas que no aceptan números o letras con tilde o con carácteres especiales (Ejemplo @,#,$.%.& etc.))"));
            } else {
                if (validacion == true) {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Usuario Creado con exito"));
                    return "ConsultarViajes";
                } else {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "Se presentó inconveniente en el almacenamiento, intente mas tarde "));
                }
            }
        }
        return "login";
    }
}
