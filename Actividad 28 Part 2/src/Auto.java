public class Auto extends Vehiculo  {
    String placa;

    public Auto(String modelo, String placa) {
        super(modelo);
        if (placa == null || placa.length() != 7 || !placa.matches(".*[A-Za-z].*") || !placa.matches(".*\\d.*")) {
            throw new IllegalArgumentException("La placa debe tener 7 caracteres y contener al menos 1 letra y 1 número.");
        }
        this.placa = placa;
    }

    void tocarBocina(){
        System.out.println("Beep Beep!");

    }

}
