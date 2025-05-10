public class Profesor extends Persona implements Estudiante, Trabajador {
    public Profesor(String nombre, int edad) {
        super(nombre, edad);
    }
    void enseñar(){
        System.out.println("Enseñando...");
    }
}
