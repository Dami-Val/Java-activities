public class Figura {
    String color;


    public Figura(String color) {
        if (color == null || color.isEmpty() || color.matches(".*\\d.*")) {
            throw new IllegalArgumentException("El color no puede estar vacío ni contener números.");
        }
        if (!Character.isUpperCase(color.charAt(0))) {
            throw new IllegalArgumentException("El color debe comenzar con mayúscula.");
        }
        this.color = color;
    }

    void mostrarColor(){
        System.out.println("El color es: " + color);
    }
}