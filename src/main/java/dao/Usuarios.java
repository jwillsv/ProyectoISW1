package dao;

public class Usuarios 
{
    private Long id;
    private String nombreUsuario;
    private String contrasena;
    private String verifyContrasena;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
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
    @Override
    public String toString()
    {
       return this.nombreUsuario +" "+
               this.contrasena +" "+
               this.verifyContrasena;
    }
    
}
