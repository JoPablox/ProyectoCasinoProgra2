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
    private String idJugador;

    /**
     * 
     */
    private String idMaquina;

    /**
     * 
     */
    private boolean resultado;

    /**
     * 
     */
    private Double dineroGanado;

    public String getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(String idJugador) {
        this.idJugador = idJugador;
    }

    public String getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(String idMaquina) {
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

    
}