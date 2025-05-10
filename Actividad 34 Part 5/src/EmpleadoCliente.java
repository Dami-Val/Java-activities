interface EmpleadoEnProyecto {
    default void trabajarEnProyecto(){
        System.out.println("Se pone a trabajar en el Proyecto...");
    };
}
interface Cliente {
    default void realizarCompra(){
        System.out.println("Realizar Compra...");
    };
}

class Persona    {
    String nombre;
    String rol;

    public Persona(String nombre, String rol) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("No debe ser vacio");
        }
        this.nombre = nombre;
        if ("Empleado".equals(rol) || "Vendedor".equals(rol)) {
            this.rol = rol;
        } else {
            throw new IllegalArgumentException("Rol inválido: debe ser 'Empleado' o 'Vendedor'");
        }

    }

}

public class EmpleadoCliente extends Persona implements EmpleadoEnProyecto, Cliente {
    public EmpleadoCliente(String nombre, String rol) {
        super(nombre, rol);
    }
}


