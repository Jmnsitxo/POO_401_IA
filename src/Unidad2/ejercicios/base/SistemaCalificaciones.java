
package Unidad2.ejercicios.base;

public class SistemaCalificaciones {

    public static void main(String[] args) {
        int notaExamen = 70;

        if (notaExamen >= 60) {
            System.out.println("Felicidades, has aprobado el examen.");

            if (notaExamen >= 90) {
                System.out.println("Excelente desempeño");
            }

        } else {
            System.out.println("Lo sentimos, no has aprobado");
        }

        char calificacionLiteral;

        switch (notaExamen) {
            case 100:
            case 90:
                calificacionLiteral = 'A';
                break;
            case 80:
                calificacionLiteral = 'B';
                break;
            case 70:
                calificacionLiteral = 'C';
                break;
            case 60:
                calificacionLiteral = 'D';
                break;
            default:
                calificacionLiteral = 'F';
                break;
        }

        System.out.println("Calificación literal: " + calificacionLiteral);
    }
}