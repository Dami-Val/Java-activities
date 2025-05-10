public class Main {
    public static void main(String[] args) {

        Autobus Autobus = new Autobus("Mercedez", 20, "Recorre 12");
        Autobus.mostrarInfo();
        Autobus.recogerPasajeros();
        Metro Metro = new Metro("Cyber Metro", 150, "A 32");
        Metro.mostrarInfo();
        Metro.abrirPuertas();
        Tranvia Tranvia = new Tranvia("Tranvimex", 23, 9.9);
        Tranvia.mostrarInfo();
        Tranvia.sonarCampana();
        Taxi Taxi = new Taxi("Taxi de pepito", 5, "352-FG3-P09");
        Taxi.mostrarInfo();
        Taxi.iniciarViaje();
        BicicletaPublica BicicletaPublica = new BicicletaPublica("Speedey 1", 1, 15422112);
        BicicletaPublica.mostrarInfo();
        BicicletaPublica.liberarBicicleta();

    }
}
