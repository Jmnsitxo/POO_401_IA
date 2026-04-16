package Unidad2.Paradigma00;

class Forma {
    public double calcularArea() {
        return 0;
    }
}

class Circulo extends Forma {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * (radio * radio);
    }
}

class Rectangulo extends Forma {
    double base, altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}

public class MainFormas {
    public static void main(String[] args) {
        Forma[] formas = new Forma[2];
        formas[0] = new Circulo(3.0);
        formas[1] = new Rectangulo(4.0, 5.0);

        for (Forma f : formas) {
            System.out.println("El área es: " + f.calcularArea());
        }
    }
}
