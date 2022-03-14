/*Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para
esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en
horas). Implemente las clases y métodos necesarios para esta situación, teniendo en
cuenta lo que se pide a continuación:
En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si
quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.

 */
package coleccionEjercicio4;

import java.util.Locale;
import java.util.Scanner;

public class MainEj4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        PeliculaService pelicula = new PeliculaService();
        String opcion;
        do {
            pelicula.ingresarDatosPelicula();
            System.out.println("desea agregar otra pelicula? S/N");
            opcion = entrada.next();
            while (!opcion.equalsIgnoreCase("S") && !opcion.equalsIgnoreCase("N")) {
                System.out.println("ingrese una opcion correcta");
                opcion = entrada.next();
            }
        } while (!opcion.equalsIgnoreCase("n"));
        System.out.println("la lista de peliculas es: ");
        pelicula.mostrarPelis();
        System.out.println("");
        pelicula.ordenarTituloAlfabeticamente();
        System.out.println("");
        pelicula.ordenarDirectorAlfabeticamente();
        System.out.println("");
        pelicula.pelisMayorDuracion();
        System.out.println("");
        pelicula.ordenarDuracionAscend();
        System.out.println("");
        pelicula.ordenarDuracionDesced();
    }

}
