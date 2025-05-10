public class Empleado {
    String nombre;
    double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    void mostrarInfo(){
        System.out.println("Nombre: "+nombre+"\nSueldo: "+sueldo);
    }
}
