public class Rectangulo {
    double base ;
    double altura;

    public Rectangulo(double base , double altura){
        this.base  = base ;
        this.altura = altura;

    }

    public void calcularArea(){
        double area = base*altura;
        if (area > 20){
            System.out.println("Error: Usted tiene un area mayor de 20, ingrese numeros más pequeños.");

        } else if (area < 0) {
            System.out.println("Error: Usted tiene un area nrgativa, ingrese numeros positivos.");

        } else {

            System.out.println("Su area es: " + area);

        }
    }


    public void calcularPerimetro(){
        double perimetro =  2 * (base + altura);
        if (perimetro > 20){
            System.out.println("Error: Usted tiene un perimetro mayor de 20, ingrese numeros más pequeños.");

        } else if (perimetro < 0) {
            System.out.println("Error: Usted tiene un perimetro nrgativo, ingrese numeros positivos.");

        } else {
            System.out.println("Su perimetro es: " + perimetro);

        }


    }

}
