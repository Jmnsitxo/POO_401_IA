package Unidad3.Ejercicios.Practica2;

import java.util.Scanner;

public class HistorialPaciente {

    public static boolean validarIDPaciente(int id) {
        if (id >= 10000 && id <= 99999) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;

        do {
            System.out.print("Ingrese el ID del paciente (5 dígitos): ");
            id = sc.nextInt();

            if (!validarIDPaciente(id)) {
                System.out.println("ID inválido, intente nuevamente.");
            }

        } while (!validarIDPaciente(id));

        System.out.println("ID válido. Acceso permitido.");

        sc.close();
    }
}
