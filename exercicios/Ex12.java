package ListaCesar.exercicios;

import java.util.*;
//import ListaCesar.modelos.;



public class Ex12 {

    public static class Numero{
        private int num;

        public void setNum(int num) {
            this.num = num;
        }

        public int getNum() {
            return num;
        }

        public String verifNum(){
            if(num>20){
                return"NÚMERO DIGITADO: "+getNum();
            }else{
                return "";
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Numero numero = new Numero();

        System.out.println("Digite um numero inteiro:");
        numero.setNum(sc.nextInt());

        System.out.println(numero.verifNum());
        sc.close();
    }
}