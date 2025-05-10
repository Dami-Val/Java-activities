class Estudiante extends Persona {
    private String matricula;

    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad);
        if( matricula == null || matricula.length()<6 || !matricula.matches("[a-zA-Z][a-zA-Z0-9]+")){
            throw new IllegalArgumentException("La matrícula debe iniciar con una letra y contener al menos 6 caracteres alfanuméricos.");
        }
        this.matricula = matricula;
    }



    public void mostrarEstudiante() {
        super.mostrarDatos();
        System.out.println("Matrícula: " + matricula);
    }
}

