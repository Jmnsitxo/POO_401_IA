package Unidad2.actividad.Sensores;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<SensorIA> percepcionHUD = new ArrayList<>();

        percepcionHUD.add(new SensorVision());
        percepcionHUD.add(new SensorUltrasonido());

        for (SensorIA f : percepcionHUD) {
            f.leerDatos();
        }
    }
}
