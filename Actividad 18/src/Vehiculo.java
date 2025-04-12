import java.util.ArrayList;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int yeard;
    private String placa;

    private static ArrayList<String> placasRegistradas = new ArrayList<>();

    public Vehiculo(String marca, String modelo, int yeard, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.yeard = yeard;
        this.placa = placa;

        placasRegistradas.add(placa);

    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getYeard() {
        return yeard;
    }
    public String getPlaca() {
        return placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setYeard(int yeard) {
        this.yeard = yeard;
    }

    public void setPlaca(String placa) {
        if (placasRegistradas.contains(placa)){
            System.out.println("La placa ya existe");
        }
        this.placa = placa;
        placasRegistradas.add(placa);
    }

    public void mostrarDetalles(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año: " + getYeard());
        System.out.println("Placa: " + getPlaca());
    }
}
