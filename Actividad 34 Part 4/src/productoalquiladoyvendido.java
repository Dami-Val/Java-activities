interface Vender  {
    default void vender(){
        System.out.println("vendido...");
    };
}
interface Alquilar  {
    default void alquilar(){
        System.out.println("alquilado...");
    };
}

class Producto {
    int precio;

    public Producto(int precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("Debe ser mayor que 0");
        }
        this.precio = precio;
    }

}

class ProductoAlquiladoYVendido extends Producto implements Alquilar, Vender {
    public ProductoAlquiladoYVendido(int precio) {
        super(precio);
    }
}







