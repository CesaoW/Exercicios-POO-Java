package ListaCesar.modelos;

public class LitrosViagem {
    private double tempo, velocidade;

    //setters
    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    //getters
    public double getTempo() {
        return tempo;
    }
    public double getVelocidade() {
        return velocidade;
    }

    public double getDistancia(){
        return velocidade*tempo;
    }

    public double calcLitros(){
        return getDistancia()/12;
    }
}
