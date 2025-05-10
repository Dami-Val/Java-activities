public class MotoDeCarrera extends Moto{
    double velocidadMaxima;

    public MotoDeCarrera(String color, int cilindrada, double velocidadMaxima) {
        super(color, cilindrada);
        if (velocidadMaxima <= 0) {
            throw new IllegalArgumentException("La velocidad Maxima debe ser mayor que 0");
        }
        this.velocidadMaxima = velocidadMaxima;
    }
    void alcanzarVelocidad(){
        System.out.println("La moto de carrera alcanza una velocidad máxima de ["+velocidadMaxima+"] km/h");
    }
}
