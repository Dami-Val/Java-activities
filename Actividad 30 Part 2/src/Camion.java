public class Camion extends Automovil{
    double capacidadCarga;

    public Camion(String marca, String modelo, double capacidadCarga) {
        super(marca, modelo);
        if (capacidadCarga <= 0) {
            throw new IllegalArgumentException("La cantidad de carga debe ser positiva");
        }
        this.capacidadCarga = capacidadCarga;
    }

    void cargar(){
        System.out.println("El camión está cargando");

    }
}
