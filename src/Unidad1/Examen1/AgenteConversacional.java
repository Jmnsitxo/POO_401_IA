package Unidad1.Examen1;

import java.util.ArrayList;
import java.util.List;

//abstracción
abstract class AgenteConversacional {
    // Encapsulamiento
    private String nombre;

    // Constructor
    public AgenteConversacional(String nombre) {
        this.nombre = nombre;
    }

    // (getters/setters)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto
    public abstract void responder(String mensaje);
}

//herencia
class AgenteSoporte extends AgenteConversacional {

    public AgenteSoporte(String nombre) {
        super(nombre);
    }

    // Polimorfismo
    @Override
    public void responder(String mensaje) {
        System.out.println(getNombre() + " (Soporte): Gracias por contactarnos. Estamos revisando su mensaje: '" + mensaje + "'");
    }
}

// herencia
class AgenteVentas extends AgenteConversacional {

    public AgenteVentas(String nombre) {
        super(nombre);
    }

    // Polimorfismo
    @Override
    public void responder(String mensaje) {
        System.out.println(getNombre() + " (Ventas): Hola Le puedo ayudar con la información de nuestros productos. Usted dijo: '" + mensaje + "'");
    }
}
