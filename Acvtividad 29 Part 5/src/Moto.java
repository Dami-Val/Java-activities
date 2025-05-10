public class Moto extends Vehiculo{
    int cilindrada;

    public Moto(String color, int cilindrada) {
        super(color);
        this.cilindrada = cilindrada;
    }
    void arrancar(){
        System.out.println("La moto está arrancando");
    }
}
