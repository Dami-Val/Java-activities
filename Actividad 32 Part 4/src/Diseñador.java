public class Diseñador extends Empleado{
    String herramienta;

    public Diseñador(String nombre, double salario, String herramienta) {
        super(nombre, salario);
        if (herramienta.isEmpty()) {
            throw new IllegalArgumentException("No debe ser vacio.");
        }
        this.herramienta = herramienta;
    }
    void diseñar(){
        System.out.println("Se puso a diseñar.");
    }

}
