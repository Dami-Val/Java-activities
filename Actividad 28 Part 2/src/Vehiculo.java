
public class Vehiculo {
    String modelo;

    public Vehiculo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()){
            throw new IllegalArgumentException("El modelo no puede estar vacío ni contener solo espacios.");
        }
        this.modelo = modelo;
    }

    void encender(){
        System.out.println("El vehiculo ha encendido");
    }

}
