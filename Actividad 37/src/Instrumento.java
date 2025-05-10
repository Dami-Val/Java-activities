public class Instrumento {
    String nombre;
    int volumen;
    double costoMantenimientoBase;

    public Instrumento(String nombre, int volumen, double costoMantenimientoBase) {
        this.nombre = nombre;
        if (volumen < 1 || volumen > 10) {
            throw new IllegalArgumentException("El volumen admitido es de 1-10");
        }
        this.volumen = volumen;
        this.costoMantenimientoBase = costoMantenimientoBase;
    }
    void tocar(){
        System.out.println("Tocando un instrumento genérico.");
    }
    void calcularCostoMantenimiento(){
        System.out.println("Costo de mantenimiento base: " + costoMantenimientoBase);
    }
}
