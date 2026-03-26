package Unidad2.interfaces;

interface MiSerializable {
    void a();
}

class Archivo implements MiSerializable {

    private String nombre;

    public Archivo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void a() {
        System.out.println("Serializando archivo: " + nombre);
    }
}

class Usuario implements MiSerializable {

    private String username;

    public Usuario(String username) {
        this.username = username;
    }

    @Override
    public void a() {
        System.out.println("Serializando usuario: " + username);
    }
}

