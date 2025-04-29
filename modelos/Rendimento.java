package ListaCesar.modelos;

public class Rendimento {
    private double deposito, taxa;

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getDeposito() {
        return deposito;
    }

    public double getTaxa() {
        return taxa;
    }

    public double getValorRendi() {
        return (taxa*deposito)/100;
    }

    public double calcRendimento(){

        return deposito+getValorRendi();
    }
}
