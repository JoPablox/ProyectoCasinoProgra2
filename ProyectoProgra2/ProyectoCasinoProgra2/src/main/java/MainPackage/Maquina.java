package MainPackage;


import java.util.*;

/**
 * 
 */
public class Maquina {

    /**
     * Default constructor
     */
    public Maquina() {
    }

    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private Double costoJugada;

    /**
     * 
     */
    private ArrayList<Jugada> jugadas;


    /**
     * @param id 
     * @param costojugada
     */
    public void Maquina(String id, Double costoJugada) {
        // TODO implement here
    }

    /**
     * @param jugador
     */
    public void Jugar(Jugador jugador) {
        // TODO implement here
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getCostoJugada() {
        return costoJugada;
    }

    public void setCostoJugada(Double costoJugada) {
        this.costoJugada = costoJugada;
    }

    public ArrayList<Jugada> getJugadas() {
        return jugadas;
    }

    public void setJugadas(ArrayList<Jugada> jugadas) {
        this.jugadas = jugadas;
    }
    
    public void agregarJugada(Jugada j) {
        this.jugadas.add(j);
    }
}