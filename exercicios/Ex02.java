package ListaCesar.exercicios;

import java.util.*;
import ListaCesar.modelos.Media;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Media media = new Media();

        System.out.println("Digite o primeiro número real qualquer: ");
        double n1 = sc.nextDouble();

        System.out.println("Digite o segundo número real qualquer: ");
        double n2 = sc.nextDouble();

        System.out.println("Digite o terceiro número real qualquer: ");
        double n3 = sc.nextDouble();

        media.setNumbers(n1,n2,n3);

        System.out.println("A media dos numeros é: "+ media.calcMedia());
        sc.close();
    }

}
