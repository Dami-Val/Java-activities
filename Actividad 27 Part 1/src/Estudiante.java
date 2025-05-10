
// Clase derivada Estudiante que extiende Persona
class Estudiante extends Persona {
    // Atributo adicional de la clase Estudiante
    private String matricula;

    // Constructor de la clase Estudiante
    public Estudiante(String nombre, int edad, String matricula) {
        // Llamada al constructor de la clase base (Persona)
        super(nombre, edad);
        this.matricula = matricula;
    }

    // Método para mostrar los datos del Estudiante
    public void mostrarDatos() {
        // Llamada al método mostrarDatos() de la clase base
        super.mostrarDatos();
        System.out.println("Matrícula: " + matricula);
    }
}

