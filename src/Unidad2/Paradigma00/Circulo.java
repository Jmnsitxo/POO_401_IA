package Unidad2.Paradigma00;

public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * this.radio;
    }

    public static void main(String[] args) {
        Circulo miCirculo = new Circulo(5.0);

        double area = miCirculo.calcularArea();
        double circunferencia = miCirculo.calcularCircunferencia();

        System.out.println("Radio del círculo: 5.0");
        System.out.println("Área devuelta: " + area);
        System.out.println("Circunferencia devuelta: " + circunferencia);
    }
}
