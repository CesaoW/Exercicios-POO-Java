package ListaCesar.exercicios;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] alturas = new double[10];
        double soma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite uma altura: ");
            alturas[i] = scanner.nextDouble();
            soma += alturas[i];
        }

        double media = soma / 10;
        System.out.printf("\nAltura média %.2f\n", media);
        System.out.println("\nAlturas maiores do que a média:");
        for (int i = 0; i < 10; i++) {
            if (alturas[i] > media) {
                System.out.printf("%.2f\n", alturas[i]);
            }
        }
        scanner.close();
    }
}
