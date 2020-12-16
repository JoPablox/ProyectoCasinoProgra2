package MainPackage;


import java.util.*;

/**
 * 
 */
public class Jugador {

    
    /**
     * Atributos del Jugador
     */
    private Double cantDineroDisp;
    private int id;
    private String nombre;
    private ArrayList<Jugada> jugadas;
    
    /**
     * Default constructor
     */
    public Jugador() {
    }
    
    // Constructor parametrizado
    public Jugador(int id, String nombre, Double cantDinero ) {
        this.id = id;
        this.nombre = nombre;
        this.cantDineroDisp = cantDinero;
    }

    public Double getCantDineroDisp() {
        return cantDineroDisp;
    }

    public void setCantDineroDisp(Double cantDineroDisp) {
        this.cantDineroDisp = cantDineroDisp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarJugada(Jugada e){
        this.jugadas.add(e);
    }
}