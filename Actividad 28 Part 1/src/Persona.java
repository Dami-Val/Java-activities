public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        if(nombre == null || nombre.length() < 3 || !nombre.matches("[a-zA-Z\\s]+")){
            throw new IllegalArgumentException("El nombre debe tener al menos 3 caracteres y no contener números.");
        }
        this.nombre = nombre;

        if(edad < 6 || edad > 100){
            throw new IllegalArgumentException("La edad debe estar entre 6 y 100 años.");
        }
        this.edad = edad;
    }



    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
