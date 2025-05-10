public class Empleado {
    String nombre;
    double salario;

    public Empleado(String nombre, double salario) {
        if (nombre.isEmpty()) {
            throw new IllegalArgumentException("No debe ser vacio.");
        }
        this.nombre = nombre;
        if (salario < 0) {
            throw new IllegalArgumentException("No debe ser menor que 0.");
        }
        this.salario = salario;
    }
    void mostrarDatos(){
        System.out.println("Nombre: ["+nombre+"], Salario: ["+salario+"]");
    }
}
