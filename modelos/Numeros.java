package ListaCesar.modelos;

public class Numeros {
    private int num;

    public void setNum(int n1){
        this.num = n1;
    }
    public int getNum(){
        return num;
    }
    public int calcAnte(){
        return num-1;
    }
    public int calcSucce(){
        return num+1;
    }
}
