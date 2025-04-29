package ListaCesar.exercicios;

import java.util.*;
import ListaCesar.modelos.HorasMin;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HorasMin time = new HorasMin();

        System.out.println("Digite o valor das Horas:");
        int h = sc.nextInt();
        System.out.println("Digite o valor dos Minutos:");
        int m = sc.nextInt();

        time.setTime(h,m);

        System.out.println("Total de minutos que se passara desde o início do dia: "+time.calcTotalMin());
        sc.close();
    }

}