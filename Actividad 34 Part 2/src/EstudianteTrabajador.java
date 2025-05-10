    interface Estudiante   {
        default void estudiar(){
            System.out.println("Estudiando...");
        };
    }
    interface Trabajador    {
        default void trabajar(){
            System.out.println("Trabajando...");
        };
    }

    class Persona    {
        String nombre;
        int edad;

        public Persona(String nombre, int edad) {
            if (nombre == null || nombre.isEmpty()) {
                throw new IllegalArgumentException("No debe ser vacio");
            }
            this.nombre = nombre;
            if (edad <= 0) {
                throw new IllegalArgumentException("Debe ser mayor que 0");
            }
            this.edad = edad;
        }


    }


    public class EstudianteTrabajador extends Persona implements Estudiante, Trabajador {
        public EstudianteTrabajador(String nombre, int edad) {
            super(nombre, edad);
        }
    }