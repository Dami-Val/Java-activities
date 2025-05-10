public class Gerente extends Empleado{
    String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    @Override
    void mostrarInfo() {
        super.mostrarInfo();
    }
}
