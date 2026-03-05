package Unidad1.AgenteIA;

public class Main {
    public static void main(String[] args) {

        DronExplorador dron = new DronExplorador();
        RobotTerrestre robot = new RobotTerrestre();

        dron.moverse();
        robot.moverse();

        System.out.println("Energia del dron: " + dron.energia);
        System.out.println("Energia del robot: " + robot.energia);
    }
}
