public class Gerente extends Empleado {
    String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        if (!departamento.equalsIgnoreCase("TI") &&
                !departamento.equalsIgnoreCase("Ventas") &&
                !departamento.equalsIgnoreCase("Recursos Humanos")) {
            throw new IllegalArgumentException("El departamento debe ser TI, Ventas o Recursos Humanos.");
        }
        this.departamento = departamento;
    }

    void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Departamento: " + departamento);
    }
}


