public class Laptop extends Computadora{
    double pantallaTamaño;

    public Laptop(String marca, double pantallaTamaño) {
        super(marca);
        if (pantallaTamaño <= 0) {
            throw new IllegalArgumentException("La pantalla debe tener un tamaño mayor que 0");
        }
        this.pantallaTamaño = pantallaTamaño;
    }

    void mostrarDetalles(){
        System.out.println("Tamaño de pantalla: ["+ pantallaTamaño +"] pulgadas");
    }
}

