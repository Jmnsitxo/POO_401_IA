package Unidad2.ejercicios.base;

import java.util.Scanner;

public class calculadoraPromedio {
    public static void main(String[] args) {

        double nota1 = 0;
        double nota2 = 0;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingresa nota 1:");
            nota1 = sc.nextDouble();

            System.out.println("Ingresa nota 2:");
            nota2 = sc.nextDouble();

            double promedio = (nota1 + nota2) / 2;
            System.out.println("El promedio es: " + promedio);

        } catch (Exception e) {
            System.out.println("Error: debes ingresar valores numéricos.");
        }

        sc.close();
    }
}
