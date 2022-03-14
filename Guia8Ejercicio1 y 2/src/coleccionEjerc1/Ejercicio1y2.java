
/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList
 */
package coleccionEjerc1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1y2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        ArrayList<String> razas = new ArrayList<>();
        String raza, opcion, perroing;

        do {

            System.out.println("ingrese una raza de perro: ");
            raza = entrada.next();
            razas.add(raza);
            System.out.print("desea agregar otra raza a la lista? SI/ NO : ");
            opcion = entrada.next();
            
        } while (!opcion.equalsIgnoreCase("no"));
        System.out.println("los perros ingresados son: ");
        for (String perros : razas) {
            System.out.println(perros);
        }

        ///ejercicio 2///
        /* Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
se mostrará la lista ordenada*/
        
        System.out.println("ingrese raza que quiere eliminar de la lista: ");
        perroing = entrada.next();
        Iterator<String> razabuscada = razas.iterator();
        Boolean encontrado = false;
        while (razabuscada.hasNext()) {

            if (razabuscada.next().equals(perroing)) {

                razabuscada.remove();
                encontrado = true;
            }
        }

        if (encontrado) {

            System.out.println("se ha eliminado " + perroing);
            for (String perros : razas) {
                System.out.println(perros);
            }

        } else {
            System.out.println("la raza buscada no se encontro en la lista");
            for (String perros : razas) {
                System.out.println(perros);
                
            }
            
        }
        
            
        }
        
   
    }




