public class Main {
    public static void main(String[] args) {
        Circulo Circulo = new Circulo("Azul", 3.542);
        Circulo.mostrarColor();
        Circulo.calcularArea();

        Rectangulo Rectangulo = new Rectangulo("Rojo", 32.4, 67.5);
        Rectangulo.mostrarColor();
        Rectangulo.calcularArea();

        Cuadrado Cuadrado = new Cuadrado("Verde", 142);
        Cuadrado.mostrarColor();
        Cuadrado.calcularArea();

        Triangulo Triangulo = new Triangulo("Amarillo", 54.2, 33.4);
        Triangulo.mostrarColor();
        Triangulo.calcularArea();

        Trapecio Trapecio = new Trapecio("Purpura", 3476, 342, 400);
        Trapecio.mostrarColor();
        Trapecio.calcularArea();




    }
}