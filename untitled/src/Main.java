interface Madre {
    default void cuidar(){
        System.out.println("Está cuidando");
    }
}

interface Padre {
    default void trabar(){
        System.out.println("Está chambiando");
    }
}

class Hijo implements Madre, Padre{
}



public class Main {
    public static void main(String[] args) {
        Hijo pepito = new Hijo();
        pepito.cuidar();
        pepito.trabar();    
    }
}