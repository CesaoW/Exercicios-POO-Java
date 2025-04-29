package ListaCesar.modelos;

public class EhPrimo {
    private int primo;

    public void setPrimo(int num) {
        this.primo = num;
    }

    public boolean checkNum(){
        if(primo<=1){
            return false;
        }
        if(primo == 2){
            return true;
        }
        return false;
    }
}
