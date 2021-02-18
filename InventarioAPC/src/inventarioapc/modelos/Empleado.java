package inventarioapc.modelos;

/**
 *
 * @author Nicolas Soler & Danny Ochoa
 */
public class Empleado extends Persona{
    
    private int documento;
    private int salario;
    
    public Empleado(){
        super();
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public long getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
    
}
