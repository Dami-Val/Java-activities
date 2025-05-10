public class FiguraGeometrica {
    String color;

    public FiguraGeometrica(String color) {
        if (color == null || color.isEmpty()) {
            throw new IllegalArgumentException("No debe ser nulo o vacio");
        }
        this.color = color;
    }

    void mostrarColor(){
        System.out.println( "Color de la figura: ["+color+"]");
    }
}
