public class Autobus extends Transporte {
    String rutas ;

    public Autobus(String nombre, int capacidad, String rutas) {
        super(nombre, capacidad);
        if (rutas.isEmpty()) {
            throw new IllegalArgumentException("No debe ser vacio");
        }
        this.rutas = rutas;
    }

    void recogerPasajeros(){
        System.out.println("Se ha puesto a recoger pasajeros");
    }

}
