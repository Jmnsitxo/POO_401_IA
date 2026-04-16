package Unidad2.Paradigma00;

interface Encendible {
    void encender();
    void apagar();
}

class TV implements Encendible {
    @Override
    public void encender() {
        System.out.println("La TV se está encendiendo. Mostrando logo...");
    }

    @Override
    public void apagar() {
        System.out.println("La TV se ha apagado. Pantalla en negro.");
    }
}

class Bombilla implements Encendible {
    @Override
    public void encender() {
        System.out.println("La bombilla ilumina la habitación.");
    }

    @Override
    public void apagar() {
        System.out.println("La bombilla se apagó. Todo a oscuras.");
    }
}

public class MainDispositivos {
    public static void main(String[] args) {
        Encendible[] dispositivos = { new TV(), new Bombilla() };

        for (Encendible disp : dispositivos) {
            disp.encender();
            disp.apagar();
            System.out.println("---");
        }
    }
}
