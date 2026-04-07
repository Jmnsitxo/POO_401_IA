package Unidad2.Repaso;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("1984", "George Orwell", 328);
        Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupéry", 96);

        libro1.mostrarInfo();
        libro2.mostrarInfo();

        CuentaBancaria cuenta = new CuentaBancaria(1000);
        cuenta.depositar(500);
        cuenta.retirar(200);
        cuenta.retirar(2000); // prueba de saldo insuficiente
        System.out.println("Saldo actual: " + cuenta.getSaldo());

        Animal perro = new Perro();
        Animal gato = new Gato();

        perro.hacerSonido();
        gato.hacerSonido();

        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Perro());
        animales.add(new Gato());

        for (Animal a : animales) {
            a.hacerSonido();
        }

        ArrayList<PuedeVolar> voladores = new ArrayList<>();
        voladores.add(new Avion());
        voladores.add(new Pajaro());

        for (PuedeVolar v : voladores) {
            v.volar();
        }
    }
}
