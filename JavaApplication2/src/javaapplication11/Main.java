
package javaapplication11;

import Interfaz.IntGrafica;

public class Main {
    public static void main(String[] args) {
        Personaje heroe = new Heroe("Midoriya", "One for All", "Full Cowl");
        Personaje villano = new Villano("Shigaraki", "Decay", "Manos desintegradoras");

        heroe.presentarse();
        villano.presentarse();
        ((HabilidadesEspeciales) heroe).realizarHabilidadEspecial();
        ((EquipamientoEspecial) villano).utilizarEquipamientoEspecial();
        
        IntGrafica interfaz = new IntGrafica();
        interfaz.setVisible(true);
        interfaz.setLocationRelativeTo(null);
    }
}

