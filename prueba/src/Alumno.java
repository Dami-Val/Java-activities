public class Alumno {
    String nombre;
    String matricula;
    double calificacionParcial1;
    double calificacionParcial2;
    double calificacionParcial3;


    //Constructor:

    public Alumno(String nombre, String matricula, double calificacionParcial1, double calificacionParcial2, double calificacionParcial3) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.calificacionParcial1 = calificacionParcial1;
        this.calificacionParcial2 = calificacionParcial2;
        this.calificacionParcial3 = calificacionParcial3;
    }



    // Metodos getter y setter:

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }




    public double getCalificacionParcial1() {
        return calificacionParcial1;
    }
    public void setCalificacionParcial1(double calificacionParcial1) {
        if (calificacionParcial1 <0 || calificacionParcial1 >10) {
            System.out.println(" -  Error: No se aceptan numeros negativos o mayores a 10. Ingrese de nuevo el dato.");
        } else {
            this.calificacionParcial1 = calificacionParcial1;
        }
    }




    public double getCalificacionParcial2() {
        return calificacionParcial2;
    }
    public void setCalificacionParcial2(double calificacionParcial2) {
        if (calificacionParcial2 <0 || calificacionParcial2 >10) {
            System.out.println(" -  Error: No se aceptan numeros negativos o mayores a 10. Ingrese de nuevo el dato.");
        } else {
            this.calificacionParcial2 = calificacionParcial1;
        }
    }




    public double getCalificacionParcial3() {
        return calificacionParcial3;
    }
    public void setCalificacionParcial3(double calificacionParcial3) {
        if (calificacionParcial3 <0 || calificacionParcial3 >10) {
            System.out.println(" -  Error: No se aceptan numeros negativos o mayores a 10. Ingrese de nuevo el dato.");
        } else {
            this.calificacionParcial3 = calificacionParcial1;
        }
    }



    public void calcularPromedioFinal() {
        double media = (calificacionParcial1 + calificacionParcial2 + calificacionParcial3)/3;
        System.out.println("Promedio final: " + media);
    }


    public void mostrarEvaluacion() {
        double media = (calificacionParcial1 + calificacionParcial2 + calificacionParcial3) / 3;

        if (media < 5) {
            System.out.println("Resultado: REPROBADO");
        } else if (media >= 5 && media <= 8) {
            System.out.println("Resultado: MUY BIEN");
        } else if (media > 8 && media < 10) {
            System.out.println("Resultado: Excelente");
        } else {
            System.out.println("Resultado: ¡FELICIDADES! CALIFICACION PERFECTA");
        }
    }

    public void mostrarInformacion(){
        System.out.println("Nombre : " + nombre);
        System.out.println("Matricula: " + matricula);
        System.out.println("Calificacion Parcial 1: " + calificacionParcial1);
        System.out.println("Calificacion Parcial 2: " + calificacionParcial2);
        System.out.println("Calificacion Parcial 3: " + calificacionParcial3);


    }


}