package ListaCesar.modelos;

public class Primo {
    private int primo;

    public void setPrimo(int num) {
        this.primo = num;
    }
    public int getPrimo() {
        return primo;
    }

    public boolean ehPrimo(){
        if(primo<2){
            return false;
        }
        for(int i=2; i<=Math.sqrt(primo);i++){
            if(primo%i == 0){
                return false;
            }
        }

        return true;
    }
}
