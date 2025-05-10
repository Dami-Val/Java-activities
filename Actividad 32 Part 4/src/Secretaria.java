public class Secretaria extends Empleado{
    String nivel;

    public Secretaria(String nombre, double salario, String nivel) {
        super(nombre, salario);
        if (nivel.isEmpty()) {
            throw new IllegalArgumentException("No debe ser vacio.");
        }
        this.nivel = nivel;
    }
    void agendarReunion(){
        System.out.println("Se puso a agendar una reunion.");
    }
}
