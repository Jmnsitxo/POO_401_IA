package Unidad2.excepciones;

import java.util.Scanner;

public class ProcesadorDeListas {

    public static void main(String[] args) {
        String[] frutas = {"manzana", "banana", "pera", "uva"};

        System.out.println("Lista de frutas:");

        for (int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i]);
        }


        int i = 0;
        boolean encontrado = false;

        while (i < frutas.length && !encontrado) {
            if (frutas[i].toLowerCase().startsWith("p")) {
                System.out.println("\nFruta que empieza con 'P': " + frutas[i]);
                System.out.println("Posición: " + i);
                encontrado = true;
            }
            i++;
        }


        Scanner scanner = new Scanner(System.in);
        String frutaIngresada;
        boolean esValida;

        do {
            System.out.print("\nIngresa una fruta de la lista: ");
            frutaIngresada = scanner.nextLine().toLowerCase();

            esValida = false;

            for (int j = 0; j < frutas.length; j++) {
                if (frutas[j].equals(frutaIngresada)) {
                    esValida = true;
                    break;
                }
            }

            if (!esValida) {
                System.out.println("Fruta no válida, intenta de nuevo.");
            }

        } while (!esValida);

        System.out.println("Fruta válida ingresada: " + frutaIngresada);

        scanner.close();
    }
}
