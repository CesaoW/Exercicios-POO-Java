
package ListaCesar.exercicios;

import java.util.*;
import ListaCesar.modelos.Rendimento;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rendimento rendi = new Rendimento();

        System.out.println("DIGITE O VALOR DO DEPÓSITO:");
        rendi.setDeposito(sc.nextDouble());

        System.out.println("DIGITE O VALOR DA TAXA DE JUROS:");
        rendi.setTaxa(sc.nextDouble());

        System.out.println("Valor do rendimento: "+rendi.getValorRendi());
        System.out.println("Valor total depois do rendimento: "+rendi.calcRendimento());
        sc.close();
    }
}