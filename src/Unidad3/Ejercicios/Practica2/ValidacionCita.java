package Unidad3.Ejercicios.Practica2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidacionCita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese la hora de la cita (0-23): ");
            int hora = sc.nextInt();

            sc.nextLine();
            System.out.print("Ingrese el día de la semana: ");
            String dia = sc.nextLine().toLowerCase();

            if (hora >= 9 && hora <= 17) {
                if (!dia.equals("sabado") && !dia.equals("domingo")) {
                    System.out.println("Cita agendada con éxito");
                } else {
                    System.out.println("Error: No se atiende fines de semana");
                }
            } else {
                System.out.println("Error: Hora fuera de horario laboral (9-17)");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número válido para la hora");
        }

        sc.close();
    }
}