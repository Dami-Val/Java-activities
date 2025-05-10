public class Gerente extends Empleado {
    String depapartamento;

    public Gerente(String nombre, int edad, double sueldo, String depapartamento) {
        super(nombre, edad, sueldo);
        this.depapartamento = depapartamento;
    }
    void mostrarDepartamento(){
        System.out.println("Departamento: [" + depapartamento + "]");
    }
}
