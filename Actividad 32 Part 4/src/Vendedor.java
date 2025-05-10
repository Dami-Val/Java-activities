public class Vendedor extends Empleado{
    String zona;

    public Vendedor(String nombre, double salario, String zona) {
        super(nombre, salario);
        if (zona.isEmpty()) {
            throw new IllegalArgumentException("No debe ser vacio.");
        }
        this.zona = zona;
    }
    void vender(){
        System.out.println("Se puso a vender.");
    }
}
