package Unidad2;

public class Bifurcaciones {

    public static void main(String[] args) {

        int notaExamen = 75;

        if (notaExamen >= 60) {
            System.out.println("Felicidades has aprobado");

            if (notaExamen >= 90) {
                System.out.println("Excelente desempeño");
            }

        } else {
            System.out.println("Lo sentimos, no has aprobado.");
        }

        char calificacion;

        if (notaExamen >= 90) {
            calificacion = 'A';
        } else if (notaExamen >= 80) {
            calificacion = 'B';
        } else if (notaExamen >= 70) {
            calificacion = 'C';
        } else if (notaExamen >= 60) {
            calificacion = 'D';
        } else {
            calificacion = 'F';
        }

        System.out.println("Tu calificación es: " + calificacion);
    }
}
