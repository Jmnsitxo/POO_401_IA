package Unidad2.excepciones;

public class ManejoCiclos {

    public static void main(String[] args) {

        System.out.println("Conteo Ascendente (while):");

        int contador = 1;

        while (contador <= 5) {
            System.out.println(contador);
            contador++;
        }



        System.out.println("\nConteo Descendente (do-while):");

        int numero = 10;

        do {
            System.out.println(numero);
            numero--;
        } while (numero >= 8);

        System.out.println("\nTabla del 7 (for):");

        for (int i = 1; i <= 10; i++) {
            System.out.println("7 x " + i + " = " + (7 * i));
        }
    }
}
