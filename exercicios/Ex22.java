package ListaCesar.exercicios;

import java.util.*;
//import ListaCesar.modelos.;

public class Ex22{
    public static class Serie{
        private int termo;

        public void setTermo(int termo) {
            this.termo = termo;
        }
        public int getTermo() {
            return termo;
        }

        public double calcSerie(){
            double h = 0;
            if(termo <= 0){
                return -1;
            }else{
                for(int i = 1; i <= termo; i++){
                    int sinal = (i%2==0)? -1: 1;
                    h += sinal * 1.0/(2*i-1);
                }
            }
            return h;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Serie serie = new Serie();

        System.out.println("Digite a quantidade de termos: ");
        serie.setTermo(sc.nextInt());

        System.out.printf("Resultado: %.6f\n", serie.calcSerie());

        sc.close();
    }
}