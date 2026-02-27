package Unidad1.MotorIA;

abstract class MotorIA {

    private String nombreModelo;
    private double precision;

    public MotorIA(String nombre, double precision) {
        this.nombreModelo = nombre;
        setPrecision(precision);
    }

    public String getNombre() {
        return nombreModelo;
    }

    public double getPrecision() {
        return precision;
    }

    public void setPrecision(double precision) {
        if (precision >= 0.0 && precision <= 1.0) {
            this.precision = precision;
        } else {
            System.out.println("Error: La precisión debe estar entre 0.0 y 1.0");
        }
    }

    public abstract void analizar(String texto);
}


    class AnalizadorSentimientos extends MotorIA {

        public AnalizadorSentimientos() {
            super("Sentiment-BERT-Lite", 0.89);
        }

        @Override
        public void analizar(String texto) {
            System.out.println("\n--- Ejecutando Modelo: " + getNombre() + " ---");
            System.out.println("Precisión del modelo: " + getPrecision());

            System.out.println("[INFO] Tokenizando texto...");
            System.out.println("[INFO] Extrayendo embeddings semánticos...");

            if (texto.toLowerCase().contains("feliz") ||
                    texto.toLowerCase().contains("bueno")) {

                System.out.println("RESULTADO: Sentimiento Positivo (Score: "
                        + String.format("%.2f", Math.random()) + ")");
            } else {
                System.out.println("RESULTADO: Sentimiento Negativo o Neutro.");
            }
        }
    }


