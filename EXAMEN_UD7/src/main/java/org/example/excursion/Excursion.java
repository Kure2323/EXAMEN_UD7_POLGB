package org.example.excursion;

import java.util.*;

public class Excursion {

    static Scanner in = new Scanner(System.in);

    private String nombre_actividad;
    private String localidad;
    private double precio;
    private static HashSet<Estudiante> listaAsistentes = new HashSet<>();
    private static Stack<String> profesores = new Stack<>();

    public Excursion(String nombre_actividad, String localidad, double precio) {
        this.nombre_actividad = nombre_actividad;
        this.localidad = localidad;
        this.precio = precio;
    }


    public void insertarProfesor(String p) {
        profesores.push(p);
    }

    public void inscribirAsistente(Estudiante e) {
        listaAsistentes.add(e);
    }
    public void insertarProfesor() {
        System.out.println("Introduce el nombre del profesor/a para la excurión en " + localidad);
        profesores.push(in.next());
        System.out.println("Profesor añadido correctamente a la excursión " + nombre_actividad);
    }

    public void inscribirAsistente() {

        int tamanyo = listaAsistentes.size();

        System.out.println("Creando estudiante...");
        System.out.println("Inserta los apellidos:");
        in.nextLine();
        String apellidos = in.nextLine();
        System.out.println("Inserta el nombre:");
        String nombre = in.next();
        System.out.println("Inserta el curso:");
        String curso = in.next();
        System.out.println("Inserta su edad:");
        int edad = in.nextInt();
        listaAsistentes.add(new Estudiante(apellidos,nombre,curso,edad));
        if (tamanyo != listaAsistentes.size()) {
            System.out.println("Añadido correctamente el estudiante " + nombre + " " + apellidos + " del curso: " + curso);
        } else {
            System.out.println("Este estudiante ya existe.");
        }


    }

    public double calcularImporteIngreso() {
        return precio * listaAsistentes.size();
    }

    public void verAsistentes() {
        System.out.println("Los Asistentes a la excursion " + nombre_actividad + " son:");
        for (Estudiante e: listaAsistentes) {
            System.out.println(e);
        }
        System.out.println();
    }

    public void eliminarAsistentesPorEdad(int n) {
        System.out.println("Han sido eliminados los siguientes Asistentes");
        Stack<Estudiante> eliminados = new Stack<>();

        for (Estudiante e: listaAsistentes) {
            if (e.getEdad() < n) {
                System.out.println(eliminados.push(e));
            }
        }
        while (!eliminados.isEmpty()) {
            listaAsistentes.remove(eliminados.pop());
        }
        System.out.println();

    }

    public String getNombre_actividad() {
        return nombre_actividad;
    }

    public void setNombre_actividad(String nombre_actividad) {
        this.nombre_actividad = nombre_actividad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
