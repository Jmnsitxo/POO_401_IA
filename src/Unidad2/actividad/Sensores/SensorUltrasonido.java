package Unidad2.actividad.Sensores;

public class SensorUltrasonido extends SensorIA {

    public SensorUltrasonido() {
        super("Ultrasonido Pro", 10.0);
    }

    @Override
    public void leerDatos() {
        System.out.println("Sensor ultrasónico midiendo distancia...");
    }
}