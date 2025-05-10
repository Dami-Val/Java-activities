public class MotoDeCarrera extends Moto{
    double velocidadMaxima;

    public MotoDeCarrera(String color, int cilindrada, double velocidadMaxima) {
        super(color, cilindrada);
        this.velocidadMaxima = velocidadMaxima;
    }
    void alcanzarVelocidad(){
        System.out.println("La moto de carrera alcanza una velocidad máxima de ["+velocidadMaxima+"] km/h");
    }
}
