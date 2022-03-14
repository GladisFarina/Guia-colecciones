package coleccionEjercicio4;

import java.util.Comparator;

public class ComparatorDuracDescen implements Comparator<Pelicula>{

    @Override
    public int compare(Pelicula p1, Pelicula p2) {
        return p2.getDuracion().compareTo(p1.getDuracion());
    }
    
}
