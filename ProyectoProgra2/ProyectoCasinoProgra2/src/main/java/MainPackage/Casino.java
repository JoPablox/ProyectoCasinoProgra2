package MainPackage;


import java.util.ArrayList;

public class Casino {

    private Double cantDineroCaja; // NO se llego a utilizar
    private ArrayList<Jugador> jugadores;
    private ArrayList<Maquina> maquinas;

    public Casino() {
            
    }

    public Casino(ArrayList<Maquina> maquinas, ArrayList<Jugador> jugadores) {
        this.maquinas = maquinas;
        this.jugadores = jugadores;
    }
    
    
    public void GanaciasTotales() {
        // Total acumulado de ganancias en todas las máquinas
    }

    /**
     * @param idJugador
     */
    public void MostrarHistorialDeJugador(String idJugador) {
        // TODO implement here
    }

    /**
     * @param idJugador
     */
    public void GananciasDeJugador(String idJugador) {
        // TODO implement here
    }

    public void SeleccionarJugador(String idJugador) {
        // TODO implement here
        //return this.jugadores[0];
    }
    
}