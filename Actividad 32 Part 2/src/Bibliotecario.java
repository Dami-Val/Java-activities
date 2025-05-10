public class Bibliotecario extends Persona{
    String turno;

    public Bibliotecario(String nombre, int edad, String turno) {
        super(nombre, edad);
        if (turno.equals("mañana") || turno.equals("tarde") || turno.equals("noche")) {
            this.turno = turno;
        } else {
            throw new IllegalArgumentException("El turno debe ser 'mañana', 'tarde' o 'noche'.");
        }
        this.turno = turno;
    }

    void prestarLibro() {
        System.out.println("Libro prestado al alumno");
    }
}
