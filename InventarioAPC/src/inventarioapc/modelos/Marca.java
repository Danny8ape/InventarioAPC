package inventarioapc.modelos;

/**
 *
 * @author Nicolas Soler & Danny Ochoa
 */
public class Marca {
    
    private int codigoMarca;
    private String nombre;
    private String tipo;


    public Marca() {
        
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCodigoMarca() {
        return codigoMarca;
    }

    public void setCodigoMarca(int codigoMarca) {
        this.codigoMarca = codigoMarca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
        
}
