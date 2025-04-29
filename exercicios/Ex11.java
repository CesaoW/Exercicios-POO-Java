package ListaCesar.exercicios;

import java.util.Scanner;
import ListaCesar.modelos.Quilowatt;

import static java.text.ChoiceFormat.nextDouble;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Quilowatt residendcia = new Quilowatt();
        System.out.println("DIGITE O VALOR DO SALÁRIO MÍNIMO (R$):");
        residendcia.setSalario(sc.nextDouble());

        System.out.println("DIGITE A QUANTIDADE DE QUILOWATTS GASTA (kW):");
        residendcia.setKw(sc.nextDouble());

        System.out.printf("VALOR DE CADA QUILOWATT (R$): R$ %.4f%n",residendcia.getValorWatts());
        System.out.printf("VALOR A SER PAGO SEM O DESCONTO (R$):R$ %.2f%n",residendcia.valorBruto());
        System.out.printf("VALOR A SER PAGO COM O DESCONTO (R$):R$ %.2f%n",residendcia.valorDesconto());

        sc.close();
    }
}
