public class Empleado {
    String nombre;
    double sueldo;

    public Empleado(String nombre, double sueldo) {
        if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{3,}")) {
            throw new IllegalArgumentException("El nombre debe tener mínimo 3 letras y solo contener letras.");
        }
        this.nombre = nombre;
        if (sueldo < 7000 || sueldo >= 100000) {
            throw new IllegalArgumentException("El sueldo debe ser mayor o igual a $7000 y menor a $100000.");
        }
        this.sueldo = sueldo;
    }

    void mostrarInfo(){
        System.out.println("Empleado: " + nombre + "\nSueldo: " + sueldo);

    }
}