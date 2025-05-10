public class Animal {
    String especie;

    public Animal(String especie) {
        if (!especie.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
            throw new IllegalArgumentException("La especie no debe contener números ni caracteres especiales.");
        }
        this.especie = especie;
    }

    void hacerSonido(){
        System.out.println("Haciendo un sonido...");
    }
}
