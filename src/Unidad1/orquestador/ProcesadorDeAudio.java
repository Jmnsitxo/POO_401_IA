package Unidad1.orquestador;

import java.util.*;

abstract class ProcesadorDeAudio {
    abstract void filtrar();
}

class ReductorDeEco extends ProcesadorDeAudio {
    void filtrar() {
        System.out.println("Reduciendo eco");
    }
}

class Ecualizador extends ProcesadorDeAudio {
    void filtrar() {
        System.out.println("Ecualizando audio");
    }
}

class Normalizador extends ProcesadorDeAudio {
    void filtrar() {
        System.out.println("Normalizando audio");
    }
}

