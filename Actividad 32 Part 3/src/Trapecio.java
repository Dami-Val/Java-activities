public class Trapecio extends FiguraGeometrica {
    double baseMayor;
    double baseMenor;
    double  altura;

    public Trapecio(String color, double baseMayor, double baseMenor, double altura) {
        super(color);

        if (baseMayor < 0) {
            throw new IllegalArgumentException("Debe ser mayor que 0");
        }
        if (baseMayor < baseMenor) {
            throw new IllegalArgumentException("baseMayor Debe ser mayor que baseMenor");
        }
        this.baseMayor = baseMayor;


        if (baseMenor > baseMayor) {
            throw new IllegalArgumentException("baseMenor Debe ser menor que baseMayor");
        }
        if (baseMenor < 0) {
            throw new IllegalArgumentException("Debe ser mayor que 0");
        }
        this.baseMenor = baseMenor;


        if (altura < 0) {
            throw new IllegalArgumentException("Debe ser mayor que 0");
        }
        this.altura = altura;

    }

    void calcularArea(){
        System.out.println("El area es: "+(baseMayor + baseMenor) * altura / 2);

    }
}
