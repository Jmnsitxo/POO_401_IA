package Unidad2.practica.clase;

class Circulo extends FiguraGeometrica {

    private double radio;

    public Circulo(double radio) {
        super("Círculo");
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public void mostrarNombre() {
        System.out.println("Soy un Círculo");
    }
}
