package ListaCesar.modelos;

public class IPVA {
    private String placa;
    private int[] mesPorFinal = {10,1,2,3,4,5,6,7,8,9};

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public int[] getMesPorFinal() {
        return mesPorFinal;
    }
    public boolean verificaVencimento(int mesAtual) {
        if (placa == null || placa.length() != 4) {
            System.out.println("Placa inválida! Deve ter 4 dígitos.");
            return false;
        }

        char ultimoChar = placa.charAt(placa.length() - 1);

        int finalPlaca = Character.getNumericValue(ultimoChar);
        int mesVencimento = mesPorFinal[finalPlaca];

        return mesAtual == mesVencimento;
    }



}
