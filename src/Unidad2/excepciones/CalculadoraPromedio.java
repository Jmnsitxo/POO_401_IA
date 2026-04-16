package Unidad2.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraPromedio {
    public static void main(String[] args) {
        double nota1, nota2;

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese la primera nota: ");
            nota1 = scanner.nextDouble();

            System.out.print("Ingrese la segunda nota: ");
            nota2 = scanner.nextDouble();

            double promedio = (nota1 + nota2) / 2;

            System.out.println("resultados");
            System.out.println("El promedio de las notas [" + nota1 + ", " + nota2 + "] es: " + promedio);

        }
        catch (InputMismatchException e) {
            System.out.println("Se esperaba un valor numérico. Por favor, no ingrese letras ni caracteres especiales.");
        }
        finally {
            System.out.println("Liberando recursos y cerrando sistema...");
            scanner.close();
        }
    }
}
