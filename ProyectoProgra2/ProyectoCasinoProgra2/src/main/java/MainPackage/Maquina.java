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
    private Jugada[][] matrizJugadas;


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
        this.matrizJugadas = new Jugada[5][5];
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
    
    public void actualizarMatriz(int id){
        Jugada[][] matrizAct = this.matrizJugadas;
        matrizAct[id][0]=this.jugadas.get(id);
        
    }
    
    public void imprimirRegistroJugadas(){
        if(this.getJugadas().size()==0){
            JOptionPane.showMessageDialog(null, "Esta Maquina Aun NO Registra Ninguna Jugada");
            return;
        }
        String registro = "";
        System.out.println("Registro de jugadas de esta maquina");
        for(int i=0;i<this.getJugadas().size();i++){
        registro+="********************************\n";
        registro += "Jugada numero "+(i+1)+":\n";
          registro += this.getJugadas().get(i).toString();
          System.out.println(this.getJugadas().get(i).toString());
        }
       JOptionPane.showMessageDialog(null, registro);     
}
}