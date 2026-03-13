package Unidad1.orquestador;

class AgenteInteligente {
    void tomarDecision() {
        System.out.println("El agente toma una decision");
    }
}

class Explorador extends AgenteInteligente {
    void tomarDecision() {
        System.out.println("Explorador explora el entorno");
    }
}

class Recolector extends AgenteInteligente {
    void tomarDecision() {
        System.out.println("Recolector recoge recursos");
    }
}

class Defensor extends AgenteInteligente {
    void tomarDecision() {
        System.out.println("Defensor protege la base");
    }
}





