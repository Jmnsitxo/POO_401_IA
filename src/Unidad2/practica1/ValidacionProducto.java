package Unidad2.practica1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidacionProducto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese la cantidad en stock: ");
            int cantidad = scanner.nextInt();

            System.out.print("Ingrese el precio unitario: ");
            double precio = scanner.nextDouble();

            if (cantidad > 0) {
                if (precio > 0) {
                    System.out.println(" Producto registrado exitosamente: " + nombre);
                } else {
                    System.out.println(" Error: El precio debe ser un valor positivo.");
                }
            } else {
                System.out.println(" Error: La cantidad en stock debe ser mayor a 0.");
            }

        } catch (InputMismatchException e) {
            System.out.println(" Error crítico: Ingresó un tipo de dato inválido (ej. texto en un campo numérico).");
        } finally {
            scanner.close();
        }
    }
}