package Unidad2.Paradigma00;

class Producto {
    String nombre;
    double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio);
    }
}

class Electronica extends Producto {
    int garantiaMeses;

    public Electronica(String nombre, double precio, int garantiaMeses) {
        super(nombre, precio);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Electrónica: " + nombre + " | Precio: $" + precio + " | Garantía: " + garantiaMeses + " meses.");
    }
}

class Alimento extends Producto {
    String fechaDeCaducidad;

    public Alimento(String nombre, double precio, String fechaDeCaducidad) {
        super(nombre, precio);
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Alimento: " + nombre + " | Precio: $" + precio + " | Caduca: " + fechaDeCaducidad);
    }
}

public class MainCatalogo {
    public static void main(String[] args) {
        Producto[] catalogo = {
                new Electronica("Laptop", 15000.0, 12),
                new Alimento("Manzana", 15.50, "20-Abril-2026"),
                new Producto("Cuaderno", 45.0)
        };

        for (Producto p : catalogo) {
            p.mostrarDetalles();
        }
    }
}
