public class Ingeniero extends Empleado{
    String especialidad;

    public Ingeniero(String nombre, double salario, String especialidad) {
        super(nombre, salario);
        if (especialidad.isEmpty()) {
            throw new IllegalArgumentException("No debe ser vacio.");
        }
        this.especialidad = especialidad;
    }
    void programar(){
        System.out.println("Se puso a programar.");
    }
}
