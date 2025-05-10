    public class Jirafa extends Animal {
    double altura;

    public Jirafa(String nombre, int edad, double altura) {
        super(nombre, edad);
        if (altura < 0) {
            throw new IllegalArgumentException("La altura debe ser positivo");
        }
        this.altura = altura;
    }

    void comerHojas(){
        System.out.println("La jirafa come hojas altas");
    }
}
