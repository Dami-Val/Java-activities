public class Cuadrado extends FiguraGeometrica {
    double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        if (lado < 0) {
            throw new IllegalArgumentException("Debe ser mayor que 0");
        }
        this.lado = lado;
    }

    void calcularArea(){
        System.out.println("El area es: "+lado+lado);

    }
}
