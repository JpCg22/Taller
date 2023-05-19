
package javaapplication11;

public class Heroe extends Personaje implements HabilidadesEspeciales {
    private String habilidadEspecial;

    public Heroe(String nombre, String poderes, String habilidadEspecial) {
        super(nombre, poderes);
        this.habilidadEspecial = habilidadEspecial;
    }

    @Override
    public void presentarse() {
        System.out.println("¡Soy el héroe " + nombre + " y tengo los poderes de " + poderes + "!");
    }

    @Override
    public void realizarHabilidadEspecial() {
        System.out.println("¡Utilizando la habilidad especial: " + habilidadEspecial + "!");
    }
}