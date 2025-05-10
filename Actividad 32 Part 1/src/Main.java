public class Main {
    public static void main(String[] args) {


        Leon mufasa = new Leon("Mufasa", 23, true);
        mufasa.hacerSonido();
        mufasa.rugir();

        Elefante dumbo = new Elefante("Dumbo", 21, 120);
        dumbo.hacerSonido();
        dumbo.usarTrompa();

        Jirafa Martin = new Jirafa("Martin", 12, 4.30);
        Martin.hacerSonido();
        Martin.comerHojas();

        Cebra juan = new Cebra("Juan", 12, 345);
        juan.hacerSonido();
        juan.correr();

        Mono jorge = new Mono("Jorge", 5, "chimpance");
        jorge.hacerSonido();
        jorge.trepar();

    }
}
