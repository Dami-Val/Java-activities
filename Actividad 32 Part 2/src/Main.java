public class Main {
    public static void main(String[] args) {

        Alumno Damian = new Alumno("Damian", 19, "Ingieniería de Software");
        Damian.saludar();
        Damian.estudiar();

        Profesor Juan = new Profesor("Juan", 39, "Sistemas Operativos");
        Juan.saludar();
        Juan.darClase();

        Coordinador Francisco = new Coordinador("Francisco", 25, "Ingieniería de Software");
        Francisco.saludar();
        Francisco.coordinar();

        Secretario Pepe = new Secretario("Pepe", 56, "Comunicación e idiomas");
        Pepe.saludar();
        Pepe.atender();

        Bibliotecario neymar = new Bibliotecario("neymar", 67, "tarde");
        neymar.saludar();
        neymar.prestarLibro();
    }
}
