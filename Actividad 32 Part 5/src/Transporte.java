public class Transporte {
    String nombre;
    int capacidad;

    public Transporte(String nombre, int capacidad) {
        if (nombre.isEmpty()) {
            throw new IllegalArgumentException("No debe ser vacio");
        }
        this.nombre = nombre;
        if (capacidad < 0) {
            throw new IllegalArgumentException("No debe ser menor que 0 o negativo");
        }
        this.capacidad = capacidad;
    }

    void mostrarInfo(){
        System.out.println("Nombre: ["+nombre+"], Capacidad: ["+capacidad+"]");
    }
}
