public class Empleado extends Persona{
    double sueldo;

    public Empleado(String nombre, int edad, double sueldo) {
        super(nombre, edad);
        this.sueldo = sueldo;
    }

    void mostrarSueldo(){
        System.out.println("Sueldo: [" + sueldo + "]");
    }
}
