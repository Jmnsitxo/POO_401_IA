package Unidad2.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraEdad {
    public static void main(String[] args) {
        int anioActual = 2026;

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Por favor, ingresa tu año de nacimiento: ");

            int anioNacimiento = scanner.nextInt();

            int edad = anioActual - anioNacimiento;

            if (edad < 0) {
                System.out.println("Tu edad no puede ser negativa.");
            } else {
                System.out.println("Tu edad calculada es: " + edad + " años.");
            }

        }
        catch (InputMismatchException e) {
            System.out.println("Debes ingresar un número entero. No se permiten letras ni símbolos.");
        }
        finally {
            System.out.println("Cerrando recursos del sistema...");
            scanner.close();
        }
    }
}
