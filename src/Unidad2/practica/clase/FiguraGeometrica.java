package Unidad2.practica.clase;

abstract class FiguraGeometrica {

    protected String nombre;

    public FiguraGeometrica(String nombre){
        this.nombre = nombre; // corrección
    }

    abstract double calcularArea();

    public void mostrarNombre() {
        System.out.println("Figura: " + nombre);
    }
}