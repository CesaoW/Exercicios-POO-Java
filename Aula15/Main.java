package ListaCesar.Aula15;

public class Main {
    public static void main(String[] args) {
        Automovel a1 = new Automovel("Uno", "Vermelho", Automovel.MOVIDOADIESEL);
        AutomovelBasico a2 = new AutomovelBasico("Gol", "Prata", Automovel.MOVIDOAALCOOL);
        AutomovelDeLuxo a3 = new AutomovelDeLuxo("Civic", "Preto", Automovel.MOVIDOAGASOLINA);

        System.out.println("=====Automóvel Simples=====");
        System.out.println(a1.toString());
        System.out.println("Preço: R$" + a1.quantoCusta());
        System.out.println("Prestações: " + a1.quantasPrestacoes() + "x\n");

        System.out.println("=====Automóvel Básico=====");
        System.out.println(a2.toString());
        System.out.println("Preço: R$" + a2.quantoCusta());
        System.out.println("Prestações: " + a2.quantasPrestacoes() + "x\n");

        System.out.println("=====Automóvel de Luxo=====");
        System.out.println(a3.toString());
        System.out.println("Preço: R$" + a3.quantoCusta());
        System.out.println("Prestações: " + a3.quantasPrestacoes() + "x\n");
    }
}