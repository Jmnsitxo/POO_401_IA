package Unidad2.Repaso;

interface PuedeVolar {
    void volar();
}

class Avion implements PuedeVolar {
    @Override
    public void volar() {
        System.out.println("El avión enciende sus motores y despega");
    }
}

class Pajaro implements PuedeVolar {
    @Override
    public void volar() {
        System.out.println("El pájaro bate sus alas y vuela");
    }
}
