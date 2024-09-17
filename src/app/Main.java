
package app;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Filmoteca filmoteca = new Filmoteca();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("==== Menú ====");
            System.out.println("1. Agregar Película");
            System.out.println("2. Eliminar Película");
            System.out.println("3. Mostrar Películas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Actor Principal: ");
                    String actor = scanner.nextLine();
                    System.out.print("Director: ");
                    String director = scanner.nextLine();
                    System.out.print("Género: ");
                    String genero = scanner.nextLine();
                    System.out.print("Año de Producción: ");
                    int año = scanner.nextInt();
                    scanner.nextLine(); // Consumir la nueva línea
                    Pelicula pelicula = new Pelicula(titulo, actor, director, genero, año);
                    filmoteca.agregarPelicula(pelicula);
                    break;
                case 2:
                    System.out.print("Título de la película a eliminar: ");
                    String tituloEliminar = scanner.nextLine();
                    filmoteca.eliminarPelicula(tituloEliminar);
                    break;
                case 3:
                    System.out.println("Listado de Películas:");
                    filmoteca.mostrarPeliculasOrdenadas();
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }
}

