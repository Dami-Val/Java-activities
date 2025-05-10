public class Automovil extends Vehiculo  {
    String modelo;

    public Automovil(String marca, String modelo) {
        super(marca);
        if (modelo == null || modelo.isEmpty()) {
            throw new IllegalArgumentException("El modelo del vehículo no puede ser vacío.");
        }
        this.modelo = modelo;
    }

    void encenderMotor(){
        System.out.println("El motor del automóvil está encendido");
    }

}
