public class Libro {
    String titulo;
    String autor;
    int anioPublicacion;

    public Libro (String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public void Resumen(){
        System.out.printf("Título: [" + titulo + "], Autor: [" + autor + "], Año de publicación: [" + anioPublicacion + "]");
    }
}

