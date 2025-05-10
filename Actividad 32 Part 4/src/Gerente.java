public class Gerente extends Empleado{
    String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        if (departamento.isEmpty()) {
            throw new IllegalArgumentException("No debe ser vacio.");
        }
        this.departamento = departamento;
    }
    void dirigir(){
        System.out.println("Se puso a dirigir.");
    }
}
