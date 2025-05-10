package ListaCesar.aplicacao;

import ListaCesar.model.Esporte;
import java.util.*;

public class Lista02 {
    public static void main(String[] args) {
        Esporte ginasticaArt = new Esporte(
                "Ginastica artística",
                "https://www.olimpiadatododia.com.br/toquio2020/jogos-olimpicos/skate/",
                1896);

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as medalhas ganhadas pelo Brasil no ano de 2020: ");
        System.out.print("  Ouro: ");
        int a = sc.nextInt();
        System.out.print("  Prata: ");
        int b = sc.nextInt();
        System.out.print("  Bronze: ");
        int c = sc.nextInt();
        ginasticaArt.setMedalhas(a,b,c);

        ginasticaArt.compararComEUA();
    }

}
