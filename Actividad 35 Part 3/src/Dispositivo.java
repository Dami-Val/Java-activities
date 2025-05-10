public class Dispositivo {
    String marca;
    String modelo;

    public Dispositivo(String marca, String modelo) {
        if (marca == null || marca.isEmpty()) {
            throw new IllegalArgumentException("No debe ser nulo ni vacio");
        }
        this.marca = marca;
        if (modelo == null || modelo.isEmpty()) {
            throw new IllegalArgumentException("No debe ser nulo ni vacio");
        }
        this.modelo = modelo;

    }
    void encender(){
        System.out.println("Encendiendo...");
    }

}

interface Movil {
    default void realizarLlamada(){
        System.out.println("Realizando Llamada...");
    }
}

interface Computadora  {
    default void ejecutarPrograma(){
        System.out.println("Ejecutando Programa...");
    }
}

