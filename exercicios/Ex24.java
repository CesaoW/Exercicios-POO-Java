package ListaCesar.exercicios;
import java.util.*;

public class Ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                pares.add(numeros[i]);
            } else {
                impares.add(numeros[i]);
            }
        }
        System.out.println("Vetor com os valores pares:");
        for (int num : pares) {
            System.out.print(num + " ");
        }
        System.out.println("\nVetor com os valores impares:");
        for (int num : impares) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}

