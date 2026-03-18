package Unidad1.Examen1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Crear una lista de agentes
        List<AgenteConversacional> agentes = new ArrayList<>();

        agentes.add(new AgenteSoporte("Carlos"));
        agentes.add(new AgenteVentas("Ana"));

        String mensaje = "Necesito ayuda con mi pedido.";

        // Polimorfismo
        for (AgenteConversacional agente : agentes) {
            agente.responder(mensaje);
        }
    }
}
