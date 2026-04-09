package Unidad2.ejercicios.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnalizadorDeNumeros {

    public static void main(String[] args) {

        // Tarea 1
        int suma = 0;
        for (int i = 0; i < 100; i++) {
            suma += i;
        }
        System.out.println("La suma es: " + suma);

        // Subtarea 1
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        for (Integer d : numeros) {
            System.out.println("Valor: " + d);
        }

        // Tarea 2
        int num = 1;
        if (num < 50) {
            System.out.println("El número es menor que 50");
        } else if (num > 50) {
            System.out.println("El número es mayor que 50");
        } else {
            System.out.println("El número es igual a 50");
        }

        // Tarea 3
        Scanner sc = new Scanner(System.in);
        String pass = "qwerty123";
        boolean esIncorrecta;

        do {
            System.out.println("Ingresa una contraseña:");
            String entrada = sc.nextLine();
            esIncorrecta = !entrada.equals(pass);

            if (esIncorrecta) {
                System.out.println("Contraseña incorrecta, intenta de nuevo.");
            }

        } while (esIncorrecta);

        System.out.println("Contraseña correcta. Acceso concedido.");

        sc.close();
    }
}