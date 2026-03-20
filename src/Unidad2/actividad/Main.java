package Unidad2.actividad;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Hub de sensores
        List<SensorIA> percepcionHub = new ArrayList<>();

        // Instancias de sensores
        percepcionHub.add(new SensorLidar("Lidar-X", 15.5));
        percepcionHub.add(new SensorVision("Cam-IA", 10.2));
        percepcionHub.add(new SensorUltrasonido("UltraSonic-Pro", 5.8));

        // 🔥 Polimorfismo en acción
        System.out.println("=== INICIANDO LECTURA DE SENSORES ===");

        for (SensorIA sensor : percepcionHub) {
            sensor.leerDatos();
        }
    }
}
