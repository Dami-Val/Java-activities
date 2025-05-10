public class Producto {
    String nombre;

    public Producto(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("No debe ser nulo ni vacio");
        }
        this.nombre = nombre;
    }
    void mostrarDetalles(){
        System.out.println("nombre : ["+nombre+"]");
    }
}
 interface Cliente {
    default void comprarProducto(){
        System.out.println("Comprando producto...");
    }
 }