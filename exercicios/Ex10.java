package ListaCesar.exercicios;

import java.util.*;
import ListaCesar.modelos.LitrosViagem;

public class Ex10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LitrosViagem viagem = new LitrosViagem();

        System.out.println("DIGITE O VALOR DO TEMPO GASTO NA VIAGEM: ");
        viagem.setTempo(sc.nextDouble());

        System.out.println("DIGITE O VALOR DA VELOCIDADE MÉDIA:");
        viagem.setVelocidade(sc.nextDouble());

        System.out.println("QUANTIDADE DE LITROS DE COMBUSTÍVEL GASTA NA VIAGEM: "+viagem.calcLitros());

        sc.close();
    }
}