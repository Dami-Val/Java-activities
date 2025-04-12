public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;


    // Constructor
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }


    // Métodos get y set para cada atributo
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }


    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }


    // Método para verificar el año de publicación
    public void verificarAnio() {
        if (anioPublicacion < 2000) {
            System.out.println("El libro fue publicado antes del año 2000.");
        } else {
            System.out.println("El libro fue publicado después del año 2000.");
        }
    }
}