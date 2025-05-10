public class Vehiculo {
    String color;

    public Vehiculo(String color) {
        if (color == null || color.isEmpty()) {
            throw new IllegalArgumentException("El color no puede ser vacio.");
        }
        this.color = color;
    }
    void detalles(){
        System.out.println("Este es un vehículo de color ["+color+"]");
    }

}


