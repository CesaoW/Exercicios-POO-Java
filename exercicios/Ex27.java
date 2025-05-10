package ListaCesar.exercicios;
import java.util.*;

public class Ex27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        boolean superior = true;
        boolean inferior = true;
        boolean diagonal = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite o valor da posição [%d, %d]: ", i + 1, j + 1);
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nMatriz inserida:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i > j && matriz[i][j] != 0) {
                    superior = false;
                }
                if (i < j && matriz[i][j] != 0) {
                    inferior = false;
                }
                if (i != j && matriz[i][j] != 0) {
                    diagonal = false;
                }
            }
        }
        if (diagonal) {
            System.out.println("Matriz diagonal.");
        } else if (superior) {
            System.out.println("Matriz triangular superior.");
        } else if (inferior) {
            System.out.println("Matriz triangular inferior.");
        } else {
            System.out.println("Matriz não se encaixa em nenhuma das classificações.");
        }
        scanner.close();
    }
}
