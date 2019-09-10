
package empresayempleado;

//el public class main va siempre, y el static void es el PROGRAM

public class Main {

    public static void main(String[] args) {
        Empresa nikeArg = new Empresa();
        Empleado Juanma = new Empleado();
        nikeArg.empleados.add(Juanma);
     
        Juanma.setNombre("Juanma");
        Juanma.setApellido("Gerez");
        
        System.out.println(nikeArg.empleados.contains(Juanma));
        
        nikeArg.empleados.forEach((trabajador) -> {
            System.out.println(trabajador.nombre + " " + trabajador.apellido);
        });
        System.out.println(nikeArg.empleados);
               
    }
    
    
}
