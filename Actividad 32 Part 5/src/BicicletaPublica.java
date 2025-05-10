public class BicicletaPublica extends Transporte {
    int idEstacion ;

    public BicicletaPublica(String nombre, int capacidad, int idEstacion) {
        super(nombre, capacidad);
        if (idEstacion < 0) {
            throw new IllegalArgumentException("No debe ser menor que 0 o negativo");
        }
        this.idEstacion = idEstacion;
    }

    void liberarBicicleta(){
        System.out.println("Se ha librado la bicicleta");
    }

}
