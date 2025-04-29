package ListaCesar.modelos;

public class Quilowatt {
    private double salario, kWatt;

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setKw(double kw) {
        this.kWatt = kw;
    }

    public double getValorWatts(){
        return salario/700;
    }
    public double valorBruto(){
        return getValorWatts()*kWatt;
    }
    public double valorDesconto(){
        return valorBruto() - (valorBruto()*0.1);
    }

}
