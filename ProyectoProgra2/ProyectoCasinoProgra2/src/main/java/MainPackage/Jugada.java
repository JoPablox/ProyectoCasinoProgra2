package MainPackage;


public class Jugada {

    /**
     * Default constructor
     */
    public Jugada() {
    }

    /**
     * 
     */
    private int idJugador;

    /**
     * 
     */
    private int idMaquina;

    /**
     * 
     */
    private boolean resultado;

    /**
     * 
     */
    private Double dineroGanado;


    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public int getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(int idMaquina) {
        this.idMaquina = idMaquina;
    }

    public boolean isResultado() {
        return resultado;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }



    public Double getDineroGanado() {
        return dineroGanado;
    }

    public void setDineroGanado(Double dineroGanado) {
        this.dineroGanado = dineroGanado;
    }

  /**  public void ImprimirJugada () {
        +  + DineroGanado :getDineroGanado()
    }*/

    public String getJugada() {return "idJugador: " + this.getIdJugador() + " idMaquina: " + this.getIdMaquina() + " resultado: " + this.isResultado() +  " dineroGanado: " + this.getDineroGanado(); }
 
     @Override
    public String toString() { 
        String registro = "";
        registro += ("idJugador: "+this.getIdJugador()+"\n");
        registro += ("Maquina: "+this.idMaquina+"\n");
        if (this.resultado==true){
            registro += ("Resultado: Ganador"+"\n");
        }
        else{
            registro += ("Resultado: Perdedor"+"\n");
        }
        registro += ("DineroGanado: " +this.getDineroGanado()+"\n");
        registro+="********************************\n";
        System.out.print(registro);
        return registro;
    }
}