package Unidad1.MotorIA;

public class Main {

        public static void main(String[] args) {

            MotorIA miModelo = new AnalizadorSentimientos();

            System.out.println("Sistema de IA Iniciado...");

            miModelo.analizar("Hoy es un día muy bueno y estoy feliz");
            miModelo.analizar("El servicio fue terrible");
        }
    }
