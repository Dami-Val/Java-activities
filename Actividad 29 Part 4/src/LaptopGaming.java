public class LaptopGaming extends Laptop {
    String tarjetaGrafica;

    public LaptopGaming(String marca, double pantallaTamaño, String tarjetaGrafica) {
        super(marca, pantallaTamaño);
        this.tarjetaGrafica = tarjetaGrafica;
    }

    void mostrarRendimiento(){
        System.out.println("Rendimiento de la tarjeta gráfica: [" + tarjetaGrafica + "]");
    }

}
