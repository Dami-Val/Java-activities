public class Computadora {
    String marca;

    public Computadora(String marca) {
        if (marca == null || marca.isEmpty()) {
            throw new IllegalArgumentException("La marca no puede ser vacia.");
        }
        this.marca = marca;
    }

    void encender(){
        System.out.println("La computadora está encendida");
    }
}
