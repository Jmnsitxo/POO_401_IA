package Unidad1.FiltroImagen;

class FiltroImagen {
    public void aplicar() {
        System.out.println("Aplicando filtro a la imagen");
    }
}

class DetectorDeBordes extends FiltroImagen {
    public void aplicar() {
        System.out.println("Aplicando detector de bordes");
    }
}

class ReductorDeRuido extends FiltroImagen {
    public void aplicar() {
        System.out.println("Aplicando reductor de ruido");
    }
}

