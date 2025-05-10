public class Vehiculo {
    String marca;

    public Vehiculo(String marca) {
        if (marca == null || marca.isEmpty()) {
            throw new IllegalArgumentException("La marca del vehículo no puede ser vacía.");
        }
        this.marca = marca;
    }

    void mover(){
        System.out.println("El vehículo está en movimiento");

    }
}
