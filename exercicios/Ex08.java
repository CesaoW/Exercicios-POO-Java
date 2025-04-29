package ListaCesar.exercicios;

import java.util.*;
import ListaCesar.modelos.Salario;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("DIGITE O VALOR DA HORA-AULA: ");
        double horaaula = sc.nextDouble();
        System.out.println("DIGITE O NÚMERO DE AULAS DADAS NO MÊS:");
        double aula = sc.nextDouble();
        System.out.println("DIGITE O PERCENTUAL DE DESCONTO DO INSS: ");
        double perc = sc.nextDouble();

        Salario salario = new Salario(horaaula, aula, perc);

        System.out.printf("Salario Liquido R$ %.2f%n", salario.calcSalary());
        sc.close();
    }
}