package ListaCesar.exercicios;

import java.util.*;

import ListaCesar.modelos.Troca;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Troca num = new Troca();

        System.out.println("Digite um valor A: ");
        int a = sc.nextInt();

        System.out.println("Digite um valor B: ");
        int b = sc.nextInt();

        num.setNumbers(a,b);
        num.swap();

        System.out.println("Números após a troca de valores: \n A = "+num.getNum1()+"\n B = "+num.getNum2());
    }
}
