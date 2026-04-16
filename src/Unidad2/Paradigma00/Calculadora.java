package Unidad2.Paradigma00;

public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Suma de dos enteros (5 + 10): " + calc.sumar(5, 10));
        System.out.println("Suma de tres enteros (5 + 10 + 15): " + calc.sumar(5, 10, 15));
        System.out.println("Suma de dos decimales (2.5 + 3.2): " + calc.sumar(2.5, 3.2));
    }
}