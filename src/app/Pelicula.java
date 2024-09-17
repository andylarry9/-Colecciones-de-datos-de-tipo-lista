
package app;


public class Pelicula implements Comparable<Pelicula> {
    private String titulo;
    private String actorPrincipal;
    private String director;
    private String genero;
    private int añoProduccion;

    public Pelicula(String titulo, String actorPrincipal, String director, String genero, int añoProduccion) {
        this.titulo = titulo;
        this.actorPrincipal = actorPrincipal;
        this.director = director;
        this.genero = genero;
        this.añoProduccion = añoProduccion;
    }

    // Getters y setters

    public String getTitulo() {
        return titulo;
    }

    // Implementación de compareTo para ordenar alfabéticamente por título
    @Override
    public int compareTo(Pelicula otraPelicula) {
        return this.titulo.compareTo(otraPelicula.titulo);
    }

    // Método para mostrar la información de la película
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Actor Principal: " + actorPrincipal);
        System.out.println("Director: " + director);
        System.out.println("Género: " + genero);
        System.out.println("Año de Producción: " + añoProduccion);
        System.out.println("-------------------------------------");
    }
}
