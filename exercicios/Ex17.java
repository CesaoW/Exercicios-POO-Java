package ListaCesar.exercicios;

import java.util.*;


public class Ex17 {
	
	public static class Numeros{
		private double a, b, real;
		
		public void setA(double a) {
			this.a = a; 
		}
	
		public void setB(double b) {
			this.b = b; 
		}
		
		public void setReal(double real) {
			this.real = real; 
		}
		
		public double getNumA() {
			return a;
		}
		
		public double getNumB() {
			return b;
		}
		public double getNumReal() {
			return real;
		}
		
		public boolean verifIntervalo() {
			return real>a && real<b;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Numeros numeros = new Numeros();
		
		System.out.println("DIGITE O MENOR VALOR DO INTERVALO (A): ");
		numeros.setA(sc.nextDouble());
		
		System.out.println("DIGITE O MAIOR VALOR DO INTERVALO (B): ");
		numeros.setB(sc.nextDouble());
		
		System.out.println("DIGITE UM NUMERO REAL: ");
		numeros.setReal(sc.nextDouble());
		
		if(numeros.verifIntervalo()){
			System.out.println("O número "+numeros.real+" pertence ao intervalo ["+numeros.a+" ; "+numeros.b+"]");
		}else{
			System.out.println("O número "+numeros.real+" não pertence ao intervalo ["+numeros.a+" ; "+numeros.b+"]");
		}
		
		sc.close();
	}

}
