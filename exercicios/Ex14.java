package ListaCesar.exercicios;

import java.util.*;
import ListaCesar.modelos.IPVA;

public class Ex14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IPVA ipva = new IPVA();

        System.out.println("DIGITE O MÊS ATUAL: ");
        int mesAtual = sc.nextInt();

        System.out.print("DIGITE A PLACA DO VEÍCULO – 4 DÍGITOS: ");
        ipva.setPlaca(sc.next());

        if (ipva.verificaVencimento(mesAtual)) {
            System.out.println("O IPVA vence neste mês.");
        } else {
            System.out.println("O IPVA NÃO vence neste mês.");
        }
        sc.close();
    }
}