package empresayempleado;


public class Empleado {
    
    String nombre;
    String apellido;
    String fechaNacimiento;
    String fechaContrato;
    
    //Aca no va VOID. VOID se pone cuando es un SET y no necesitas un return;
    public String getNombre(){
        return nombre;
    }
    
    //Como aca se esta SETeando, se pone VOID ya que no precisamos RETURN;
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido (String apellido){
        this.apellido = apellido;
    }
    
    public String getFechaNacimiento(){
        return fechaNacimiento;
    }
    
    public void setFechaNacimiento (String fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String getFechaContrato(){
        return fechaContrato;
    }
    
    public void setFechaContrato (String fechaContrato){
        this.fechaContrato = fechaContrato;
    }
    
}
