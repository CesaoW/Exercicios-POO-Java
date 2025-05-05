package ListaCesar.exercicios;

import ListaCesar.modelos.Primo;
import java.util.*;

public class Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Primo numero = new Primo();

        System.out.println("Digite um número qualquer: ");
        numero.setPrimo(sc.nextInt());

        if(numero.ehPrimo()){
            System.out.println(numero.getPrimo()+" é primo");
        }else{
            System.out.println(numero.getPrimo()+" não é primo");
        }

        sc.close();
    }
}