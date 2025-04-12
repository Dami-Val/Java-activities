public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    private double peso;

    public Mascota(String nombre, String especie, int edad, double peso) {
        setNombre(nombre);
        setEspecie(especie);
        setEdad(edad);
        setPeso(peso);

    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public void setEdad(int edad) {
        if (edad>=0){
            this.edad = edad;
        } else {
            System.out.printf("La edad no puede ser menor que 0");
        }

    }
    public void setPeso(double peso) {
        if (peso>=0){
            this.peso = peso;
        } else {
            System.out.printf("El peso no puede ser menor que 0");
        }
    }


    public String getNombre() {
        return nombre;
    }
    public String getEspecie() {
        return especie;
    }
    public int getEdad() {
        return edad;
    }
    public double getPeso() {
        return peso;
    }

    public void clasificarPeso() {
        if (peso < 3) {
            System.out.println("Su mascota tiene desnutrición");
        } else if (peso >= 3 && peso <= 15) {
            System.out.println("Su mascota tiene el peso correcto");
        } else {
            System.out.println("Su mascota tiene obesidad");
        }
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
    }
}

