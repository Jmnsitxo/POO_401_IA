package Unidad2.practica1;

import java.util.Scanner;

public class Autenticacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean autenticado = false;

        System.out.println("--- PORTAL DE ACCESO ---");

        for (int intento = 1; intento <= 3; intento++) {
            System.out.println("\nIntento " + intento + " de 3");
            System.out.print("Usuario: ");
            String usuario = scanner.nextLine();

            System.out.print("Contraseña: ");
            String contrasena = scanner.nextLine();

            if (usuario.equals("admin")) {
                if (contrasena.equals("pass123")) {
                    System.out.println("✅ Autenticación exitosa. Bienvenido al sistema.");
                    autenticado = true;
                    break;
                } else {
                    System.out.println(" Contraseña incorrecta.");
                }
            } else {
                System.out.println(" Usuario no encontrado.");
            }
        }

        if (!autenticado) {
            System.out.println("\n Demasiados intentos. Acceso denegado. Contacte a soporte.");
        }

        scanner.close();
    }
}
