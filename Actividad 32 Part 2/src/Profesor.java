public class Profesor extends Persona{
    String materia;

    public Profesor(String nombre, int edad, String materia) {
        super(nombre, edad);
        if (materia.isEmpty()) {
            throw new IllegalArgumentException("La materia no debe ser vacia");
        }
        this.materia = materia;
    }

    void  darClase(){
        System.out.println("El profesor está dando clase");
    }
}
