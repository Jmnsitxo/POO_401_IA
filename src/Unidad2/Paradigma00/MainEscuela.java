package Unidad2.Paradigma00;

import java.util.ArrayList;
import java.util.List;

class Estudiante {
    String nombre;
    int id;

    public Estudiante(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }
}

class Clase {
    String nombreDeClase;
    List<Estudiante> estudiantes;

    public Clase(String nombreDeClase) {
        this.nombreDeClase = nombreDeClase;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public void mostrarEstudiantes() {
        System.out.println("Estudiantes inscritos en " + nombreDeClase + ":");
        for (Estudiante e : estudiantes) {
            System.out.println("- " + e.nombre + " (ID: " + e.id + ")");
        }
    }
}

public class MainEscuela {
    public static void main(String[] args) {
        Clase poo = new Clase("Programación Orientada a Objetos");

        poo.agregarEstudiante(new Estudiante("Ana", 1));
        poo.agregarEstudiante(new Estudiante("Luis", 2));
        poo.agregarEstudiante(new Estudiante("Carlos", 3));

        poo.mostrarEstudiantes();
    }
}
