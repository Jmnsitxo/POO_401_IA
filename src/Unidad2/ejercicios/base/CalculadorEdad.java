package Unidad2.ejercicios.base;
import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculadorEdad {
    public static void main(String[] args) {

        int anioActual = 2026;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingresa tu año de nacimiento:");
            int anioNacimiento = sc.nextInt();

            int edad = anioActual - anioNacimiento;

            System.out.println("Tu edad es: " + edad);

        } catch (InputMismatchException e) {
            System.out.println("Error: debes ingresar un número válido.");
            System.out.println("Mensaje: " + e.getMessage());
            System.out.println("Causa: " + e.getCause());
            System.out.println("Detalle: " + e.getLocalizedMessage());
        }

        sc.close();
    }
}