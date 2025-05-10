public class Circulo extends Figura {
    double radio;
    float PI = 3.1416F;


    public Circulo(String color, double radio) {
        super(color);
        if (radio < 0.5 || radio > 100) {
            throw new IllegalArgumentException("El radio debe estar entre 0.5 y 100.");
        }
        this.radio = radio;
    }

    void calcularArea(){
        System.out.println("El radio es: "+ PI *(radio * radio));
    }
}