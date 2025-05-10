package ListaCesar.modelos;

public class Intervalo {
    private int a, b;

    public void setA(int num1) {
        this.a = num1;
    }

    public int getA() {
        return a;
    }

    public void setB(int num2) {
        this.b = num2;
    }

    public int getB() {
        return b;
    }

    public double calcMedia() {
        int soma = 0;
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                soma += i;
                count++;
            }
        }
        return count > 0 ? (double) soma / count : 0;
    }

    public double calcProdu() {
        long produt = 1;
        boolean achoupar = false;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                produt *= i;
                achoupar = true;
            }
        }
        return achoupar ? produt: 0;
    }
}