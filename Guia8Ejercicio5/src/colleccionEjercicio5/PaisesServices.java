package colleccionEjercicio5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class PaisesServices {

    private HashSet<Paises> paises;
    private Scanner entrada;

    public PaisesServices() {
        this.paises = new HashSet<>();
        this.entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    }

    public void ingresarPais() {
        System.out.println("ingrese un pais:");
        String nombrePais = entrada.next();
        crearPais(nombrePais);
    }

    public void crearPais(String pais) {
        Paises paisIng = new Paises();
        paisIng.setNombrePais(pais);
        agregarPais(paisIng);
    }

    public void agregarPais(Paises pais) {
        paises.add(pais);
    }

    public void MostrarConjunto() {
        for (Paises paise : paises) {
            System.out.println(paise);

        }
    }

    public void ingresarPaisAEliminar() {
        System.out.println("ingrese el pais que quiere eliminar:");
        String paisIng = entrada.next();
        Iterator<Paises> paisAeliminar = paises.iterator();
        boolean encontrado = false;
        while (paisAeliminar.hasNext()) {
            if (paisAeliminar.next().equals(paisIng)) {
                paisAeliminar.remove();
                encontrado= true;

            }

        }
        
        if (encontrado) {
            System.out.println("el pais ha sido eliminado del conjunto");
            for (Paises paise : paises) {
                System.out.println(paise);
            }
        } else {
            System.out.println("el pais ingrasado no se encontro en el conjunto");
        }

    }

}


