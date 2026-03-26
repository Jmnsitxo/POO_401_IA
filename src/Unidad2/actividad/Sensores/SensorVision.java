package Unidad2.actividad.Sensores;

public class SensorVision extends SensorIA {

    public SensorVision() {
        super("Vision AI", 15.5);
    }

    @Override
    public void leerDatos() {
        System.out.println("Sensor de visión detectando objetos...");
    }
}
