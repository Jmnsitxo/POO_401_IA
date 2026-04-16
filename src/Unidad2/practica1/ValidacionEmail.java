package Unidad2.practica1;

import java.util.Scanner;

public class ValidacionEmail {

    public static boolean validarEmail(String email) {
        if (email.contains("@")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correoUsuario;
        boolean esValido;

        System.out.println("Suscripcion");

        do {
            System.out.print("Por favor, ingrese un correo electrónico válido: ");
            correoUsuario = scanner.nextLine();

            esValido = validarEmail(correoUsuario);

            if (!esValido) {
                System.out.println(" Correo inválido. Asegúrese de incluir un '@'.\n");
            }

        } while (!esValido);

        System.out.println(" ¡Suscripción exitosa! Las notificaciones serán enviadas a: " + correoUsuario);
        scanner.close();
    }
}
