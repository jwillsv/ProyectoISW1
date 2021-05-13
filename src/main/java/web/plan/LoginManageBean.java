package web.plan;

import BBDDOperaciones.OperUser;
import dao.Usuarios;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;


@ManagedBean
@RequestScoped
public class LoginManageBean {

    private EntityManager buscar;
    private String nombreUsuario;
    private String contrasena;
    private List<Usuarios> user;

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

    public List<Usuarios> getUser() {
        return user;
    }

    public void setUser(List<Usuarios> user) {
        this.user = user;
    }
    
    
    
    public LoginManageBean() {

    }
    

    public String ingresar() {
        OperUser usuario = new OperUser();
        Usuarios entrar = new Usuarios(); 
        entrar.setNombreUsuario(nombreUsuario);
        entrar.setContrasena(contrasena);
        this.user = usuario.registro(nombreUsuario, contrasena);  
        if (nombreUsuario.isEmpty() || contrasena.isEmpty()) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "Los datos no estan llenados o faltan datos por llenar"));

        } 
        else 
        {
            if(!nombreUsuario.matches("[A-Za-z]+|[a-z]+"))
            {
               FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "El nombre no se ha digitado correctamente "
                        + "(Solo cadenas que no aceptan números o letras con tilde o con carácteres especiales (Ejemplo @,#,$.%.& etc.))")); 
            }
            else
            {                  
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Info", "Bienvenido " + nombreUsuario));
                return "consultaViajes";
            }
        }
        return "consultaViajes";
    }
}
