
package javaapplication11;

public abstract class Personaje {
    protected String nombre;
    protected String poderes;

    public Personaje(String nombre, String poderes) {
        this.nombre = nombre;
        this.poderes = poderes;
    }

    public abstract void presentarse();
}

