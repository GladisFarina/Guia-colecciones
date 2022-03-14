package coleccionEjercicio4;

import java.util.Comparator;

public class ComparatorDuracAsc implements Comparator<Pelicula>{

    @Override
    public int compare(Pelicula p1, Pelicula p2) {
        return p1.getDuracion().compareTo(p2.getDuracion());
    }
    
}
