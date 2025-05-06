package ListaCesar.exercicios;
import java.util.*;

public class Ex28 {
    public static void main(String[] args) {
        int[][] producao = {
                {2300, 3400, 1340},
                {5000, 1500, 1600}
        };
        double[] lucro = {30.0, 15.0, 65.0};
        double[] totalLucro = new double[2];
        for (int i = 0; i < 2; i++) {
            totalLucro[i] = 0;
            for (int j = 0; j < 3; j++) {
                totalLucro[i] += producao[i][j] * lucro[j];
            }
        }
        System.out.printf("Lucro da Indústria 1: %.0f\n", totalLucro[0]);
        System.out.printf("Lucro da Indústria 2: %.0f\n", totalLucro[1]);
        if (totalLucro[0] > totalLucro[1]) {
            System.out.println("O investimento na Indústria 1 é o melhor");
        } else {
            System.out.println("O investimento na Indústria 2 é o melhor");
        }
    }
}
