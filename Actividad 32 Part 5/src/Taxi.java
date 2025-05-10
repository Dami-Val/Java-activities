public class Taxi extends Transporte {
    String numeroLicencia ;

    public Taxi(String nombre, int capacidad, String numeroLicencia) {
        super(nombre, capacidad);
        if (numeroLicencia.isEmpty()) {
            throw new IllegalArgumentException("No debe ser vacio");
        }
        this.numeroLicencia = numeroLicencia;
    }

    void iniciarViaje(){
        System.out.println("Se ha puesto a iniciar el viaje");
    }

}
