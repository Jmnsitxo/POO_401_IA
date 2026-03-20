package Unidad2.actividad;

class SensorVision extends SensorIA {

    public SensorVision(String modelo, double consumoEnergia) {
        super(modelo, consumoEnergia);
    }

    @Override
    public void leerDatos() {
        System.out.println("Capturando frame Ejecutando segmentación semántica de objetos.");
    }
}