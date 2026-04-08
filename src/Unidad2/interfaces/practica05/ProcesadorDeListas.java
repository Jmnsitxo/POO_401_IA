package Unidad2.interfaces.practica05;

public class ProcesadorDeListas {
    public static void main(String[] args) {

        String[] frutas = {"Manzana", "Peras", "Uvas", "Piñas"};

        System.out.println("Recorrido con FOR:");
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Fruta " + (i + 1) + ": " + frutas[i]);
        }

        int contador = 0;
        boolean bandera = true;

        System.out.println("\nRecorrido con WHILE:");

        while (contador < frutas.length && bandera) {
            System.out.println("Fruta " + (contador + 1) + ": " + frutas[contador]);
            contador++;

            if (contador == frutas.length) {
                bandera = false;
            }
        }
    }
}