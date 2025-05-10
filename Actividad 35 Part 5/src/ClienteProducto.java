public class ClienteProducto extends  Producto implements Cliente  {
    public ClienteProducto(String nombre) {
        super(nombre);
    }
    void recibirFactura(){
        System.out.println("Recibiendo Factura");
    }
}
