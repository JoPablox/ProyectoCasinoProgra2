/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author mauricio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Crear arrayList maquinas
        Maquina maquina1 = new MaquinaAdivina(1,"Advina 01", 5);
        Maquina maquina2 = new MaquinaAdivina(2,"Ruleta 02", 10);
        
        ArrayList<Maquina> maquinas = new ArrayList();
        maquinas.add(maquina1);
        maquinas.add(maquina2);
        
        // Crear jugadores
        Jugador jugador1 = new Jugador(1,"Juan", (double)100);
        Jugador jugador2 = new Jugador(2,"Pedro", (double)200);
        
        ArrayList<Jugador> jugadores = new ArrayList();
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        
        // Crear casino
        Casino casino1 = new Casino(maquinas,jugadores);
        
        int opcion;
        int idJugador;
        int idMaquina;
        Jugador j;
        
        // Vamos al menu
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al Casino La Fortuna \n Digite una opción: \n" + 
                        "1. Seleccionar Jugador \n" + "2. Registro Jugada \n" +  "3. Salir"));
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Debe ingresar un número válido");
            }
                        
            switch (opcion) {
                case 1:
                    //JOptionPane.showMessageDialog(null, "Hola");
                    //Pedir id del jugador y seleccionar máquina
                    idJugador = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su id de jugador:"));
                    j = jugadores.get(idJugador-1);
                    idMaquina = Integer.parseInt(JOptionPane.showInputDialog("¿En cuál máquina desea jugar? \n" + 
                            "Introduce 1 para Adivina ó 2 para Ruleta"));
                    // Proceder a la partida
                    maquinas.get(idMaquina-1).Jugar(j);
                    break;
                case 2:
                   idMaquina = Integer.parseInt(JOptionPane.showInputDialog("¿De cual maquina quiere ver el registro de jugadas? \n" + 
                            "Introduce 1 para Adivina ó 2 para Ruleta")); 
                    maquinas.get(idMaquina-1).imprimirRegistroJugadas();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Hasta pronto. Gracias por participar");
                    break;
            }
        } while (opcion != 3);
    }
    
}

