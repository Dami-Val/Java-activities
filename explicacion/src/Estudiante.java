public class Estudiante {
    String nombre;
    String matricula;
    double calf1;
    double calf2;
    double calf3;
    // Atributos de operaciones
    double media;
    String status;

    public Estudiante(String nombre, String matricula,
                      double calf1, double calf2, double calf3) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.calf1 = calf1;
        this.calf2 = calf2;
        this.calf3 = calf3;
    }

    public void calcularPromedio() {
        media = (calf1 + calf2 + calf3) / 3;

        if (media == 10) {
            status = "Hey felicidades! Por tu excelencia" +
                    " academica\nten una beca de $1,000,000." +
                    "\nJa ja, bueno fuera. Pero sigue así :).";
            System.out.printf(status);
        } else if (media >= 8 && media <= 9.9) {
            status = "Excelente.";
            System.out.printf(status);
        } else if (media >= 6 && media <= 7.9) {
            status = "Intenta mejorar el siguiente semestre.";
            System.out.printf(status);
        } else {
            status = "Necesito ponerme a estudiar mas.";
            System.out.println(status);
        }
    }

    public void mostrarDatos() {
        System.out.printf("El estudiante " + nombre + " matricula numero " + matricula + ",\n obtuvo un promedio de: " + media);
        System.out.printf(" Su mensaje para este  semestre es el siguiente:\n %s", status);
    }


}
