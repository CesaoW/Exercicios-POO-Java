package ListaCesar.exercicios;

import java.util.*;
import ListaCesar.modelos.Volume;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Volume lata = new Volume();

        System.out.println("Digite o valor do raio da lata (r): ");
        double r = sc.nextDouble();

        System.out.println("Digite o valor da altura da lata (h): ");
        double h = sc.nextDouble();

        lata.setDimen(r,h);

        System.out.printf("Volume da lata: %.2f", lata.calcVolum());

        sc.close();
    }
}