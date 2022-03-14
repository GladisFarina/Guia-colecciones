package coleccionEjerc3;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class AlumnoService {

    ArrayList<Alumno> arrayList;
    private Scanner entrada;

    public AlumnoService() {
        this.arrayList = new ArrayList<>();
        this.entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    }

    public void ingresarDatos() {
        String nombre;
        int nota1, nota2, nota3;
        System.out.println("ingrese el nombre");
        nombre = entrada.next();
        System.out.println("ingrese la primer nota:");
        nota1 = entrada.nextInt();
        System.out.println("ingrese la segunda nota:");
        nota2 = entrada.nextInt();
        System.out.println("ingrese la tercer nota:");
        nota3 = entrada.nextInt();
        crearAlumno(nombre, nota1, nota2, nota3);
    }

    public void crearAlumno(String nombre, int nota1, int nota2, int nota3) {
        Alumno alumno = new Alumno();
        ArrayList notas = new ArrayList<>();
        alumno.setNombre(nombre);
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
        alumno.setNotas(notas);
        agregarAlumno(alumno);
    }

    public void agregarAlumno(Alumno alumno) {
        arrayList.add(alumno);
    }

    public void mostrarArrayList() {
        System.out.println("");
        System.out.println("la lista de alumnos y sus notas es: ");
        for (Alumno alumno : arrayList) {
            System.out.println(alumno);
        }
    }

    public Alumno buscarAlumno(String nombre) {
        Alumno alumnoBuscado = null;
        boolean encontrado = false;
        for (Alumno alumno : arrayList) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                alumnoBuscado = alumno;
                encontrado = true;
                if (encontrado) {
                    System.out.println("el promedio final es: ");
                    System.out.println(obtenerNotaFinal(alumno));

                } else {

                    System.out.println("el alumno ingresado no esta en la lista");
                }
            }
        }
        return alumnoBuscado;
    }

    public double obtenerNotaFinal(Alumno alumno) {
        int acumulador = 0;
        for (Integer nota : alumno.getNotas()) {
            acumulador += nota;
        }
        return (double) acumulador / 3;
    }
}
