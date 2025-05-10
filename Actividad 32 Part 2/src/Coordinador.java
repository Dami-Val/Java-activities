public class Coordinador extends Persona{
    String departamento;

    public Coordinador(String nombre, int edad, String departamento) {
        super(nombre, edad);
        if (departamento.isEmpty()) {
            throw new IllegalArgumentException("El departamento no debe ser vacio");
        }
        this.departamento = departamento;
    }

    void coordinar(){
        System.out.println("El coordinador organiza actividades");
    }
}
