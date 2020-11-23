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
        Maquina maquina1 = new MaquinaLoteria("Tragamonedas 1", (double) 5);
        Maquina maquina2 = new MaquinaLoteria("Tragamonedas 2", (double) 10);
        
        ArrayList<Maquina> maquinas = new ArrayList();
        maquinas.add(maquina1);
        maquinas.add(maquina2);
        
        // Crear jugadores
        Jugador jugador1 = new Jugador("Juan", (double)100);
        Jugador jugador2 = new Jugador("Pedro", (double)200);
        
        ArrayList<Jugador> jugadores = new ArrayList();
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        
        // Crear casino
        Casino casino1 = new Casino(maquinas,jugadores);
        int opcion;
        
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite una opción: \n" + 
                        "1. Seleccionar Jugador \n" + "2. Salir"));
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Debe ingresar un número válido");
            }
                        
            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Hola");
                    
                case 2:
                    JOptionPane.showMessageDialog(null, "Gracias por participar");
            }
        } while (opcion != 2);
    }
    
}

