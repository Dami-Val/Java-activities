public class Empleado extends Persona{
    double sueldo;

    public Empleado(String nombre, int edad, double sueldo) {
        super(nombre, edad);
        if (sueldo <= 0) {
            throw new IllegalArgumentException("el sueldo debe ser mayor que 0");
        }
        this.sueldo = sueldo;
    }

    void mostrarSueldo(){
        System.out.println("Sueldo: [" + sueldo + "]");
    }
}
