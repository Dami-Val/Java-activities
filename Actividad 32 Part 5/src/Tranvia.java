public class Tranvia extends Transporte {
    double longitud ;

    public Tranvia(String nombre, int capacidad, double longitud) {
        super(nombre, capacidad);
        if (longitud < 0) {
            throw new IllegalArgumentException("No debe ser menor que 0 o negativo");
        }
        this.longitud = longitud;
    }

    void sonarCampana(){
        System.out.println("Se ha puesto a sonar la campana");
    }

}
