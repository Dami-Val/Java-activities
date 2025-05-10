public class Gerente extends Empleado {
    String depapartamento;

    public Gerente(String nombre, int edad, double sueldo, String depapartamento) {
        super(nombre, edad, sueldo);
        if (depapartamento == null || depapartamento.isEmpty()) {
            throw new IllegalArgumentException("El depapartamento no puede ser vacio.");
        }
        this.depapartamento = depapartamento;
    }
    void mostrarDepartamento(){
        System.out.println("Departamento: [" + depapartamento + "]");
    }
}
