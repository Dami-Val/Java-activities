public class LaptopGaming extends Laptop {
    String tarjetaGrafica;

    public LaptopGaming(String marca, double pantallaTamaño, String tarjetaGrafica) {
        super(marca, pantallaTamaño);
        if (tarjetaGrafica == null || tarjetaGrafica.isEmpty()) {
            throw new IllegalArgumentException("El nombre de la tarjeta Grafica no puede ser vacio.");
        }
        this.tarjetaGrafica = tarjetaGrafica;
    }

    void mostrarRendimiento(){
        System.out.println("Rendimiento de la tarjeta gráfica: [" + tarjetaGrafica + "]");
    }

}
