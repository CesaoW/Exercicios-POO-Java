package ListaCesar.exercicios;

import java.util.*;
//import ListaCesar.modelos.;

public class Ex15 {
    public static class Numeros{
        private int num1, num2;

        public void setNum1(int num1) {
            this.num1 = num1;
        }

        public void setNum2(int num2) {
            this.num2 = num2;
        }

        public int getNum1() {
            return num1;
        }

        public int getNum2() {
            return num2;
        }

        public String verfiMaiorNum(){
            if(num1==num2){
                return "NUMEROS IGUAIS" ;
            }else if(num1>num2){
                return "O número "+ num2+" é menor; O número "+num1+ " é maior ";
            }else{
                return "O número "+ num1+" é menor; O número "+num2+ " é maior \"";
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Numeros numeros = new Numeros();

        System.out.println("DIGITE O PRIMEIRO NÚMERO: ");
        numeros.setNum1(sc.nextInt());

        System.out.println("DIGITE O PRIMEIRO NÚMERO: ");
        numeros.setNum2(sc.nextInt());

        System.out.println(numeros.verfiMaiorNum());
        sc.close();
    }
}