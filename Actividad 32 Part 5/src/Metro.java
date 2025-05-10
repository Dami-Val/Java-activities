public class Metro extends Transporte {
    String linea ;

    public Metro(String nombre, int capacidad, String linea) {
        super(nombre, capacidad);
        if (linea.isEmpty()) {
            throw new IllegalArgumentException("No debe ser vacio");
        }
        this.linea = linea;
    }

    void abrirPuertas(){
        System.out.println("Se ha puesto a abrir sus puertas");
    }

}
