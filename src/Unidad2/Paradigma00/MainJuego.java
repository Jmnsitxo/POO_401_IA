package Unidad2.Paradigma00;


abstract class Personaje {
    public abstract void atacar();
}

class Guerrero extends Personaje {
    @Override
    public void atacar() {
        System.out.println("El Guerrero ataca con un poderoso golpe de espada.");
    }
}

class Mago extends Personaje {
    @Override
    public void atacar() {
        System.out.println("El Mago lanza un hechizo de fuego.");
    }
}

public class MainJuego {
    public static void main(String[] args) {
        // Personaje p = new Personaje(); // <- Esto daría error de compilación

        Personaje g = new Guerrero();
        Personaje m = new Mago();

        g.atacar();
        m.atacar();
    }
}