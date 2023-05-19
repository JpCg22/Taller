
package javaapplication11;

public class Villano extends Personaje implements EquipamientoEspecial {
    private String equipamientoEspecial;

    public Villano(String nombre, String poderes, String equipamientoEspecial) {
        super(nombre, poderes);
        this.equipamientoEspecial = equipamientoEspecial;
    }

    @Override
    public void presentarse() {
        System.out.println("¡Soy el villano " + nombre + " y tengo los poderes de " + poderes + "!");
    }

    @Override
    public void utilizarEquipamientoEspecial() {
        System.out.println("¡Utilizando el equipamiento especial: " + equipamientoEspecial + "!");
    }
}


// Interfaz EquipamientoEspecial
