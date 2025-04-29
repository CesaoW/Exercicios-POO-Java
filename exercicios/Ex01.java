package ListaCesar.exercicios;

import java.util.*;
import ListaCesar.modelos.Numeros;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Numeros num = new Numeros();

        System.out.println("Digite um Número inteiro qualquer: ");
        int n = sc.nextInt();

        num.setNum(n);

        System.out.println("Antecessor: "+ num.calcAnte());
        System.out.println("Sucessor: "+ num.calcSucce());
        sc.close();
    }
}
