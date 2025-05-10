public class Bateria extends Instrumento{
    public Bateria(String nombre, int volumen, double costoMantenimientoBase) {
        super(nombre, volumen, costoMantenimientoBase);
    }

    @Override
    void tocar() {
        System.out.println("La batería marca el ritmo con fuerza.");
    }

    @Override
    void calcularCostoMantenimiento() {
        System.out.println("Costo de mantenimiento base = " + costoMantenimientoBase * 1.15);
    }
}
