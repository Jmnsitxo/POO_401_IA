package Unidad2.practica1;

import java.util.Scanner;

public class Trazabilidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String estado = "";

        System.out.println("Sistema");

        while (!estado.equalsIgnoreCase("Entregado")) {
            System.out.print("Actualice el estado del pedido (Procesando / En camino / Error en envio / Entregado): ");
            estado = scanner.nextLine();

            if (estado.equalsIgnoreCase("En camino")) {
                System.out.println("ℹ️ El paquete está en tránsito. Esperando actualización...");
                continue;
            }

            if (estado.equalsIgnoreCase("Error en envio")) {
                System.out.println("🚨 ERROR CRÍTICO: Paquete perdido o dañado. Deteniendo el proceso.");
                break;
            }

            if (estado.equalsIgnoreCase("Entregado")) {
                System.out.println("✅ El pedido ha llegado a su destino.");
                // El ciclo terminará naturalmente en la siguiente evaluación del while
            } else if (!estado.equalsIgnoreCase("En camino")) {
                System.out.println("🔄 Estado registrado: " + estado);
            }
        }

        System.out.println("Fin de la trazabilidad.");
        scanner.close();
    }
}
