package Unidad2.practica1;

public class ReporteInventario {
    public static void main(String[] args) {
        int[] cantidades = {60, 15, 8, 0, 45, 100, 2, 0, 12, 50};

        System.out.println("reporte");

        for (int i = 0; i < cantidades.length; i++) {
            int cantidad = cantidades[i];
            String categoriaRango;

            if (cantidad > 50) {
                categoriaRango = "ALTO";
            } else if (cantidad >= 10 && cantidad <= 50) {
                categoriaRango = "MEDIO";
            } else if (cantidad >= 1 && cantidad <= 9) {
                categoriaRango = "BAJO";
            } else {
                categoriaRango = "CERO";
            }

            // 2. Usamos switch para asignar el estado final según la categoría
            switch (categoriaRango) {
                case "ALTO":
                    System.out.println("Producto " + (i + 1) + " (Cant: " + cantidad + ") -> En stock");
                    break;
                case "MEDIO":
                    System.out.println("Producto " + (i + 1) + " (Cant: " + cantidad + ") -> Bajo stock");
                    break;
                case "BAJO":
                    System.out.println("Producto " + (i + 1) + " (Cant: " + cantidad + ") -> Urgente");
                    break;
                case "CERO":
                    System.out.println("Producto " + (i + 1) + " (Cant: " + cantidad + ") -> Descontinuado");
                    break;
            }
        }
    }
}
