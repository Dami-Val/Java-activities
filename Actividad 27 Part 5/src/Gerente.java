public class Gerente extends Empleado {
    String departamento = "Recursos Humanos";

    @Override
    void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Departamento: " + departamento);
    }
}
