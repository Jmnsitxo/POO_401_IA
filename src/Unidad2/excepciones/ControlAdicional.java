package Unidad2.excepciones;

public class ControlAdicional {

    public static void main(String[] args) {

        System.out.println("Sección 1: break");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Se encontró el 5, se detiene el ciclo.");
                break;
            }
            System.out.println("Número: " + i);
        }

        System.out.println("\nSección 2: continue");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Número impar: " + i);
        }

        System.out.println("\nSección 3: return");

        int[] numeros = {3, 7, 9, 2, 8, 5};
        int objetivo = 8;

        String resultado = encontrarNumero(numeros, objetivo);
        System.out.println(resultado);
    }

    public static String encontrarNumero(int[] arreglo, int objetivo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == objetivo) {
                return "El número " + objetivo + " fue encontrado en la posición " + i;
            }
        }
        return "El número " + objetivo + " NO fue encontrado en el arreglo";
    }
}
