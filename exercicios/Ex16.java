package ListaCesar.exercicios;

import java.util.*;
import ListaCesar.modelos.Emprestimo;

public class Ex16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Emprestimo emprestimo = new Emprestimo();
        System.out.println("Digite o valor do salario bruto: ");
        emprestimo.setSalario(sc.nextDouble());

        System.out.println("Qual o valor da prestação a ser paga?");
        emprestimo.setPrestacao(sc.nextDouble());

        System.out.println(emprestimo.verifiEmprestimo());
        System.out.println("Salario Líquido: "+emprestimo.calcSalarioLiq());
        System.out.println("30% de S. L. : "+emprestimo.calcPrestacao());

        sc.close();
    }
}