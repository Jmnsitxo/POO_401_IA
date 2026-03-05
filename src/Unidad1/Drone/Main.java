package Unidad1.Drone;

public class Main {
    public static void main(String[] args) {

        Drone drone1 = new Drone("D1");
        Drone drone2 = new Drone("D2");
        Drone drone3 = new Drone("D3");

        drone1.nivelBateria = 50;

        System.out.println("Drone1 bateria: " + drone1.nivelBateria);
        System.out.println("Drone2 bateria: " + drone2.nivelBateria);
        System.out.println("Drone3 bateria: " + drone3.nivelBateria);
    }
}
