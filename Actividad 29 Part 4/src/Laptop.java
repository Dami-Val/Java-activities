public class Laptop extends Computadora{
    double pantallaTamaño;

    public Laptop(String marca, double pantallaTamaño) {
        super(marca);
        this.pantallaTamaño = pantallaTamaño;
    }

    void mostrarDetalles(){
        System.out.println("Tamaño de pantalla: ["+ pantallaTamaño +"] pulgadas");
    }
}
