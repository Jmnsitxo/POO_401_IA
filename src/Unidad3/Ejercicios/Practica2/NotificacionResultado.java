package Unidad3.Ejercicios.Practica2;

import java.util.Scanner;

public class NotificacionResultado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String estado = "";

        while (!estado.equalsIgnoreCase("Listo para revisión")) {
            System.out.print("Ingrese el estado del resultado: ");
            estado = sc.nextLine();

            if (estado.equalsIgnoreCase("En proceso")) {
                System.out.println("El resultado sigue en proceso...");
                ;
            } else if (estado.equalsIgnoreCase("Error en muestra")) {
                System.out.println("Proceso detenido por error en la muestra.");
                break;
            } else if (estado.equalsIgnoreCase("Listo para revisión")) {
                System.out.println("Resultado listo.");
            } else {
                System.out.println("Estado desconocido.");
            }
        }

        sc.close();
    }
}
