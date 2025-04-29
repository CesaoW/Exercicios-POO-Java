package ListaCesar.exercicios;

import java.util.*;
import ListaCesar.modelos.Desconto;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Desconto prod = new Desconto();

        System.out.println("Digite o preço bruto do produto: ");
        double p1 = sc.nextDouble();

        prod.setProduct(p1);

        System.out.printf("Valor do desconto: R$ %.2f%n", prod.getDiscount());
        System.out.printf("Preço do produto com 9%% de desconto: R$ %.2f%n", prod.getPriceWDiscount());
        sc.close();
    }
}