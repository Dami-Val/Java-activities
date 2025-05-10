public class Main {
    public static void main(String[] args) {
        ClienteProducto juan = new ClienteProducto("Juan");
        juan.mostrarDetalles();
        juan.comprarProducto();
        juan.recibirFactura();

    }
}