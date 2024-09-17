
package app;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Filmoteca {
    private List<Pelicula> peliculas;

    public Filmoteca() {
        peliculas = new ArrayList<>();
    }

    // Método para añadir una película a la filmoteca
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    // Método para eliminar una película por su título
    public void eliminarPelicula(String titulo) {
        peliculas.removeIf(pelicula -> pelicula.getTitulo().equalsIgnoreCase(titulo));
    }

    // Método para mostrar todas las películas ordenadas alfabéticamente
    public void mostrarPeliculasOrdenadas() {
        Collections.sort(peliculas);
        for (Pelicula pelicula : peliculas) {
            pelicula.mostrarInformacion();
        }
    }
}
