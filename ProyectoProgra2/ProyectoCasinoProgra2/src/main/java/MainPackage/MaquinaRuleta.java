package MainPackage;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * 
 */
public class MaquinaRuleta extends Maquina {

    /**
     * Default constructor
     */
    public MaquinaRuleta() {
    }
    
    public MaquinaRuleta(int id, String nombre, double costo) {
        super.Maquina(id, nombre, costo);
    }
    @Override
    public void Jugar(Jugador jugador) {
        if (jugador.getCantDineroDisp() > this.getCostoJugada()) {
            // 1. Cobrarle al jugador
            jugador.setCantDineroDisp(jugador.getCantDineroDisp() - this.getCostoJugada());
            Jugada jugada = new Jugada();
            jugada.setIdJugador(jugador.getId());
            // 2. Juega:
            // JoptionPane preguntar
            // int numIngresado = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número del 0 al 9"));
            // genera numero random
            // compara con el numero random
            // si gana le suma apuesta x 2, gano = true
            // si pierde gano = false
            Random rand = new Random();
            int numGenerado1 = rand.nextInt(3)+1;
            int numGenerado2 = rand.nextInt(3)+1;
            int numGenerado3 = rand.nextInt(3)+1;
            
            if (numGenerado1 == numGenerado2 && numGenerado2 == numGenerado3) {
                // Jugador gana y se le paga
                jugador.setCantDineroDisp(jugador.getCantDineroDisp() + 2 * this.getCostoJugada());
                JOptionPane.showMessageDialog(null, "Ha GANADO porque salieron 3 números iguales:" + numGenerado1 + numGenerado2 + numGenerado3);
                jugada.setResultado(true);
            } else {
                JOptionPane.showMessageDialog(null, "Ha PERDIDO porque salieron números diferentes:" + numGenerado1 + numGenerado2 + numGenerado3);
                jugada.setResultado(false);
            }
            this.agregarJugada(jugada);

        } else {
            JOptionPane.showMessageDialog(null, "Fondos insuficientes");
        }
        

    }

}