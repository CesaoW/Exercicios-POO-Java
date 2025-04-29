package ListaCesar.modelos;

public class Salario {
    private double horaula, aula, perc;

    public Salario(double h1, double a1, double p1){
        this.horaula = h1;
        this.aula = a1;
        this.perc = p1;
    }
    public double getDiscount(){
        return perc/100;
    }
    public double getValorBruto(){
        return horaula*aula;
    }

    public double calcSalary(){
        double bruto =  getValorBruto();
        return bruto - (bruto*getDiscount());
    }
}
