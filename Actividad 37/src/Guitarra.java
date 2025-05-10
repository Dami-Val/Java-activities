public class Guitarra extends Instrumento{

    public Guitarra(String nombre, int volumen, double costoMantenimientoBase) {
        super(nombre, volumen, costoMantenimientoBase);
    }

    @Override
    void tocar() {
        System.out.println("La guitarra suena con energía.");
    }

    @Override
    void calcularCostoMantenimiento() {
        System.out.println("Costo de mantenimiento base: " + costoMantenimientoBase * 1.1);
    }
}
