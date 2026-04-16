package Unidad2.Paradigma00;


class Vehiculo {
    int velocidad;
    int numLlantas;

    public void acelerar() {
        velocidad += 5;
        System.out.println("El vehículo acelera a " + velocidad + " km/h");
    }
}

class Bicicleta extends Vehiculo {
    public Bicicleta() {
        this.numLlantas = 2;
        this.velocidad = 0;
    }
    // Hereda acelerar() tal cual
}

class Automovil extends Vehiculo {
    public Automovil() {
        this.numLlantas = 4;
        this.velocidad = 0;
    }

    @Override
    public void acelerar() {
        velocidad += 20; // Aumenta más rápido
        System.out.println("El automóvil ruge y acelera a " + velocidad + " km/h");
    }
}

class MainVehiculos {
    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta();
        Automovil auto = new Automovil();

        System.out.println("Acelerando bicicleta:");
        bici.acelerar();

        System.out.println("\nAcelerando automóvil:");
        auto.acelerar();
    }
}