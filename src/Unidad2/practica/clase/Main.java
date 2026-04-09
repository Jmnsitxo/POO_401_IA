package Unidad2.practica.clase;

public class Main {
    public static void main(String[] args) {

        FiguraGeometrica triangulo = new Triangulo(10, 5);
        FiguraGeometrica circulo = new Circulo(7);

        triangulo.mostrarNombre();
        System.out.println("Área: " + triangulo.calcularArea());

        System.out.println();

        circulo.mostrarNombre();
        System.out.println("Área: " + circulo.calcularArea());
    }
}