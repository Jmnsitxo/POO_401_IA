package Unidad2.actividad;

abstract class SensorIA {
    protected String modelo;
    protected double consumoEnergia;

    public SensorIA(String modelo, double consumoEnergia) {
        this.modelo = modelo;
        this.consumoEnergia = consumoEnergia;
    }

    // Método abstracto
    public abstract void leerDatos();
}
