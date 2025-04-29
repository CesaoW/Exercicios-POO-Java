package ListaCesar.modelos;

public class Desconto {
    private double product;

    public void setProduct(double p){
        this.product = p;
    }
    public double getDiscount(){
        return(product*9)/100;
    }
    public double getPriceWDiscount(){
        return product-getDiscount();
    }
}
