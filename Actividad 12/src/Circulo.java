public class Circulo {
    double radio  ;
    double π = 3.1416;

    public Circulo(double radio){
        this.radio  = radio;

    }

    public void calcularArea() {
        double area = π * (radio * radio);
        System.out.println("Su area es:" +
                " " + area);

    }


    public void calcularCircunferencia() {
        double circunferencia =  2 * π * radio;
        System.out.println("Su Circunferencia" +
                " es: " + circunferencia);

    }

}
