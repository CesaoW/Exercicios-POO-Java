package ListaCesar.modelos;

public class Media {
    private double n1, n2, n3;

    public void setNumbers(double a, double b, double c){
        this.n1 = a;
        this.n2 = b;
        this.n3 = c;
    }
    public double calcMedia(){
        return (n1+n2+n3)/3;
    }
}
