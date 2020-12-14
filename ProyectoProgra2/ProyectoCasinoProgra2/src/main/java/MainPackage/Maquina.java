package MainPackage;


import java.util.*;
import javax.swing.JOptionPane;

/**
 * 
 */
public abstract class Maquina {

    /**
     * Default constructor
     */
    public Maquina() {
    }

    /**
     * Atributos y ArrayList
     */
    private int id;
    private String nombre;
    private Double costoJugada;
    private ArrayList<Jugada> jugadas;


    /**
     * @param id 
     * @param costojugada
     */
    public void Maquina(int id, String nombre, Double costoJugada) {
        // TODO implement here
        this.id = id;
        this.nombre = nombre;
        this.costoJugada = costoJugada;
        this.jugadas = new ArrayList();
    }

    /**
     * @param jugador
     */
    public abstract void Jugar(Jugador jugador);

    /**public void RegistroJugadas(){
        for Arraylist()
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
    
    public void imprimirRegistroJugadas(){
        String registro = "";
        System.out.println("Registro de jugadas de esta maquina");
        this.getJugadas().forEach((n) -> {
          registro = "Hola" +"\n" + n.toString();
          System.out.println(n.toString());
        });
       JOptionPane.showMessageDialog(null, registro);
       
}
}