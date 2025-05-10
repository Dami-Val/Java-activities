public class Piano extends Instrumento{
    public Piano(String nombre, int volumen, double costoMantenimientoBase) {
        super(nombre, volumen, costoMantenimientoBase);
    }

    @Override
    void tocar() {
        System.out.println("El piano interpreta una melodía clásica.");
    }

    @Override
    void calcularCostoMantenimiento() {
        System.out.println("Costo de mantenimiento base = " + costoMantenimientoBase * 1.2);
    }
}
