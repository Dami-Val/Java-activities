public class Main {
    public static void main(String[] args) {
        Gerente Gerente = new Gerente("Juan", 30000, "RH");
        Gerente.mostrarDatos();
        Gerente.dirigir();
        Ingeniero Ingeniero = new Ingeniero("Damian", 147000, "DataBases");
        Ingeniero.mostrarDatos();
        Ingeniero.programar();
        Secretaria Secretaria = new Secretaria("Bety", 1000, "Pasante");
        Secretaria.mostrarDatos();
        Secretaria.agendarReunion();
        Vendedor Vendedor = new Vendedor("Pedrito", 9000, "Metropolis");
        Vendedor.mostrarDatos();
        Vendedor.vender();
        Diseñador Diseñador = new Diseñador("Sirgay", 12000, "Phothoshop");
        Diseñador.mostrarDatos();
        Diseñador.diseñar();


    }
}
