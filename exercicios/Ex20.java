package ListaCesar.exercicios;

import ListaCesar.modelos.Intervalo;

import java.util.*;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Intervalo intervalo = new Intervalo();

        System.out.print("Informe o valor do extremo esquerdo do intervalo (a): ");
        intervalo.setA(sc.nextInt());

        do {
            System.out.print("Informe o valor do extremo direito do intervalo (b > a): ");
            intervalo.setB(sc.nextInt());
        } while (intervalo.getB() <= intervalo.getA() );

        System.out.printf("Média dos ímpares: %.2f%n",intervalo.calcMedia());
        System.out.println("Produtório dos pares: " + intervalo.calcProdu());

        sc.close();
    }
}