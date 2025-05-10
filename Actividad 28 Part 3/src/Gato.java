public class Gato extends Animal {
    String color;

    public Gato(String especie, String color) {
        super(especie);
        if (color.length() <= 3 || color.matches(".*\\d.*")) {
            throw new IllegalArgumentException("El color debe tener más de 3 letras y no contener dígitos.");
        }
        this.color = color;
    }

    void ronrronear(){
        System.out.println("*Procede a ronrronea*");
    }
}
