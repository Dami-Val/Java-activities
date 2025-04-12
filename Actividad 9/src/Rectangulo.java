public class Rectangulo {
    double base ;
    double altura;

    public Rectangulo(double base , double altura){
        this.base  = base ;
        this.altura = altura;

    }

    public void calcularArea(){
        System.out.println("Su area es: " + base*altura);

    }
    public void calcularPerimetro(){
        System.out.println("Su perimetro es: " + 2 * (base + altura));

    }

}
