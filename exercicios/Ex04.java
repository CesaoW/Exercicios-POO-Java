package ListaCesar.exercicios;

import java.util.*;
import ListaCesar.modelos.Temperatura;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Temperatura temp = new Temperatura();

        System.out.println("Digite a temperatura em graus Celsius: ");
        double t1 = sc.nextDouble();

        temp.setTemp(t1);
        double far = temp.calcFar();

        System.out.printf("Temperatura em Fahrenheit: %.2f",far);
        sc.close();
    }
}
