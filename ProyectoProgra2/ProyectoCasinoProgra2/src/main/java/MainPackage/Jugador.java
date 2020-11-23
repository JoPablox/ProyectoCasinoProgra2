package MainPackage;


import java.util.*;

/**
 * 
 */
public class Jugador {

    /**
     * Default constructor
     */
    public Jugador() {
    }
    // Constructor parametrizado
    public Jugador(String id, Double cantDinero ) {
        this.id = id;
        this.cantDineroDisp = cantDinero;
    }
    

    /**
     * 
     */
    private Double cantDineroDisp;

    /**
     * 
     */
    private String id;



    /**
     * @param nombre 
     * @param id
     */
    public void Jugador(String nombre, String id) {
        // TODO implement here
    }



    public Double getCantDineroDisp() {
        return cantDineroDisp;
    }

    public void setCantDineroDisp(Double cantDineroDisp) {
        this.cantDineroDisp = cantDineroDisp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}