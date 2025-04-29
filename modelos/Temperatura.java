package ListaCesar.modelos;

public class Temperatura {
    private double temp;

    public void setTemp(double C) {
        this.temp = C;
    }
    public double calcFar(){
        return (9*temp +160)/5;
    }
}
