package coleccionEjercicio4;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class PeliculaService {

    ArrayList<Pelicula> arrayList;

    public PeliculaService() {
        this.arrayList = new ArrayList<>();
    }

    public void ingresarDatosPelicula() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String titulo, director;
        Double duracion;
        System.out.println("ingresar el titulo de la pelicula");
        titulo = entrada.next();
        System.out.println("ingrese el director");
        director = entrada.next();
        System.out.println("ingrese la duracion");
        duracion = entrada.nextDouble();
        crearPelicula(titulo, director, duracion);
    }

    public void crearPelicula(String titulo, String director, Double duracion) {
        Pelicula pelicula = new Pelicula();

        pelicula.setTitulo(titulo);
        pelicula.setDirector(director);
        pelicula.setDuracion(duracion);
        agregarPelicula(pelicula);

    }

    public void agregarPelicula(Pelicula pelicula) {
        arrayList.add(pelicula);
    }

    public void mostrarPelis() {
        for (Pelicula peliculas : arrayList) {
            System.out.println(peliculas);
        }
    }

    public void ordenarTituloAlfabeticamente() {
        System.out.println("las peliculas ordenadas alfabeticamente por titulo son: ");
        Collections.sort(arrayList, new ComparatorTitulo());
        mostrarPelis();

    }

    public void ordenarDirectorAlfabeticamente() {
        System.out.println("las pelicula ordenadas alfabeticamente por director son: ");
        Collections.sort(arrayList, new ComparatorDirector());
        mostrarPelis();
    }
    public void pelisMayorDuracion(){
        System.out.println("la peliculas con duracion mayor de 1 hora son: ");
        for (Pelicula pelicula : arrayList) {
            if(pelicula.getDuracion()>1)
            System.out.println(pelicula.toString());
        }
    }
        public void ordenarDuracionAscend(){
            System.out.println("las peliculas ordenadas por duracion ascendente son: ");
            Collections.sort(arrayList, new ComparatorDuracAsc());
            mostrarPelis();
        }
        public void ordenarDuracionDesced(){
            System.out.println("las peliculas ordenadas por duracion descendente son: ");
            Collections.sort(arrayList, new ComparatorDuracDescen());
            mostrarPelis();
        }
}


