package ListaCesar.modelos;

public class Emprestimo {
    private double salario, prestacao;

    public void setPrestacao(double prestacao) {
        this.prestacao = prestacao;
    }

    public double getPrestacao() {
        return prestacao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getValorBruto(){
        return salario;
    }

    public double calcSalarioLiq(){
        double bruto =  getValorBruto();
        return bruto - (bruto*(9.0/100));
    }
    public double calcPrestacao(){
        return calcSalarioLiq()*30.0/100;
    }

    public String verifiEmprestimo(){
        if(getPrestacao()<=calcPrestacao()){
            return "O empréstimo pode ser concedido";
        }else{
            return "O empréstimo não pode ser concedido";
        }
    }
}
