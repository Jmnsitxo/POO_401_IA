package Unidad2.excepciones;

import java.util.Scanner;

public class AnalizadorDeNumeros {

    public static void main(String[] args) {


        int suma = 0;

        for (int i = 1; i <= 100; i++) {
            suma = suma + i;
        }

        System.out.println("Suma del 1 al 100: " + suma);


        // ===============================
        // TAREA 2: Primer número > 50 (while)
        // ===============================
        int num = 1;

        while (true) {
            if (num > 50) {
                System.out.println("El primer número mayor a 50 es: " + num);
                break; // salir del ciclo
            }
            num++;
        }


        // ===============================
        // TAREA 3: Validar contraseña (do-while)
        // ===============================
        Scanner scanner = new Scanner(System.in);
        String contraseñaCorrecta = "1234";
        String contraseñaIngresada;
        boolean esCorrecta;

        do {
            System.out.print("Ingresa la contraseña: ");
            contraseñaIngresada = scanner.nextLine();

            if (contraseñaIngresada.equals(contraseñaCorrecta)) {
                esCorrecta = true;
                System.out.println("Contraseña correcta.");
            } else {
                esCorrecta = false;
                System.out.println("Contraseña incorrecta, intenta de nuevo.");
            }

        } while (!esCorrecta);

        scanner.close();
    }
}
