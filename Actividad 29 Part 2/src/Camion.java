public class Camion extends Automovil{
    double capacidadCarga;

    public Camion(String marca, String modelo, double capacidadCarga) {
        super(marca, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    void cargar(){
        System.out.println("El camión está cargando");

    }
}
