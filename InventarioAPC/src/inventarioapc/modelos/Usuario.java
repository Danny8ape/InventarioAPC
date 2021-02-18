package inventarioapc.modelos;

/**
 *
 * @author Nicolas Soler & Danny Ochoa
 */
public class Usuario extends Persona{
    
    private int documento;
    private String usuario;
    private String contraseña;

    public Usuario() {
        super();
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
}
