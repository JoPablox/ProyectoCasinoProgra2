package MainPackage;



import java.util.*;
import javax.swing.JOptionPane;
import java.util.Random;
/**
 * 
 */
public class MaquinaLoteria extends Maquina {

    /**
     * Default constructor
     */
    public MaquinaLoteria() {
    }
    
    public MaquinaLoteria(String id, double costo) {
        super.Maquina(id, costo);
    }

    public void Jugar(Jugador jugador) {
        // 1. Cobrarle al jugador
        if (jugador.getCantDineroDisp() > this.getCostoJugada()) {
            Jugada jugada = new Jugada();
            jugador.setCantDineroDisp(jugador.getCantDineroDisp() - this.getCostoJugada());
                // 2. Juega:
                // JoptionPane preguntar
                int numIngresado = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número del 0 al 9"));
                // genera numero random
                // compara con el numero random
                // si gana le suma apuesta x 2, gano = true
                // si pierde gano = false
                Random rand = new Random();
                int numGenerado = rand.nextInt(10);
                if (numIngresado == numGenerado) {
                    jugador.setCantDineroDisp(jugador.getCantDineroDisp() + 2 * this.getCostoJugada());
                    JOptionPane.showMessageDialog(null, "Ha GANADO con el número " + numIngresado + "contra el numero aleatorio" + numGenerado);
                    jugada.setResultado(true);
                    jugada.setIdJugador(jugador.getId());
                    this.agregarJugada(jugada);
                } else {
                    JOptionPane.showMessageDialog(null, "Ha PERDIDO con el número " + numIngresado + "contra el numero aleatorio" + numGenerado);
                    jugada.setResultado(false);
                    jugada.setIdJugador(jugador.getId());
                    this.agregarJugada(jugada);
                }

        } else {
            JOptionPane.showMessageDialog(null, "Fondos insuficientes");
        }
        

    }
    
}