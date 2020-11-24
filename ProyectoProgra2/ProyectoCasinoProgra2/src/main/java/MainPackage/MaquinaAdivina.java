package MainPackage;



import java.util.*;
import javax.swing.JOptionPane;
import java.util.Random;
/**
 * 
 */
public class MaquinaAdivina extends Maquina {

    /**
     * Default constructor
     */
    public MaquinaAdivina() {
    }
    
    public MaquinaAdivina(int id, String nombre, double costo) {
        super.Maquina(id, nombre, costo);
    }
    
    public Double getCostoJugada() {
        return super.getCostoJugada();
    }

    public void Jugar(Jugador jugador) {
        if (jugador.getCantDineroDisp() >= this.getCostoJugada()) {
            // 1. Cobrarle al jugador
            jugador.setCantDineroDisp(jugador.getCantDineroDisp() - this.getCostoJugada());
            Jugada jugada = new Jugada();
            jugada.setIdJugador(jugador.getId());
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
                // Jugador gana y se le paga
                jugador.setCantDineroDisp(jugador.getCantDineroDisp() + 2 * this.getCostoJugada());
                JOptionPane.showMessageDialog(null, "Ha GANADO porque su número es igual " + numIngresado + "al número " + numGenerado);
                jugada.setResultado(true);
            } else {
                JOptionPane.showMessageDialog(null, "Ha PERDIDO porque su número " + numIngresado + " es diferente del número " + numGenerado);
                jugada.setResultado(false);
            }
            this.agregarJugada(jugada);

        } else {
            JOptionPane.showMessageDialog(null, "Fondos insuficientes");
        }
        

    }
    
}