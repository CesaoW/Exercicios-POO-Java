package ListaCesar.exercicios;

import java.util.*;


public class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double altura, maior = 0, menor = 0, somaMulheres = 0, somaTotal = 0;
        int sexo, contMulheres = 0;
        for (int i = 1; i <= 6; i++) {
            System.out.print("Digite a altura da " + i + "ª pessoa: ");
            altura = scanner.nextDouble();
            System.out.print("Digite o sexo (1 = masculino, 2 = feminino): ");
            sexo = scanner.nextInt();
            if (i == 1) {
                maior = altura;
                menor = altura;
            } else {
                if (altura > maior) {
                    maior = altura;
                }
                if (altura < menor) {
                    menor = altura;
                }
            }
            if (sexo == 2) {
                somaMulheres += altura;
                contMulheres++;
            }
            somaTotal += altura;
        }
        double mediaMulheres = (contMulheres > 0) ? somaMulheres / contMulheres : 0;
        double mediaTurma = somaTotal / 6;

        
        System.out.println("MAIOR ALTURA DA TURMA: " + maior);
        System.out.println("MENOR ALTURA DA TURMA: " + menor);
        System.out.println("MÉDIA DE ALTURA DAS MULHERES: " + mediaMulheres);
        System.out.println("MÉDIA DE ALTURA DA TURMA: " + mediaTurma);
        scanner.close();
    }
}