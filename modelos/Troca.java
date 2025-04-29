package ListaCesar.modelos;

public class Troca {
    private int n1, n2;

    public void setNumbers(int a, int b){
        this.n1 = a;
        this.n2 = b;
    }
    public void swap(){
        int aux = n1;
        n1 = n2;
        n2= aux;
    }
    public int getNum1() {
        return n1;
    }
    public int getNum2() {
        return n2;
    }
}
