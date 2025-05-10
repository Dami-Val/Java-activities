public class Moto extends Vehiculo{
    int cilindrada;

    public Moto(String color, int cilindrada) {
        super(color);
        if (cilindrada <= 0) {
            throw new IllegalArgumentException("La cilindrada debe ser positiva");
        }
        this.cilindrada = cilindrada;
    }
    void arrancar(){
        System.out.println("La moto está arrancando");
    }
}
