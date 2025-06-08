package ListaCesar.model;

public class Esporte {
    private String esporte;
    private String link;
    private int anoInclusao, medalhaOuro, medalhaPrata, medalhaBronze;

    public Esporte(String esporte, String link,int anoInclude) {
        this.esporte = esporte;
        this.link = link;
        this.anoInclusao = anoInclude;
    }

    public void setMedalhas(int medalhaOuro,int medalhaPrata, int medalhaBronze) {
        this.medalhaOuro = medalhaOuro;
        this.medalhaPrata = medalhaPrata;
        this.medalhaBronze = medalhaBronze;
    }

    public void compararComEUA(){
        int ouroEUA   = 2;
        int prataEUA  = 2;
        int bronzeEUA = 2;

        int difOuro   = ouroEUA - medalhaOuro;
        int difPrata  = prataEUA - medalhaPrata;
        int difBronze = bronzeEUA - medalhaBronze;

        System.out.println("Diferença de medalhas em relação aos EUA: ");
        System.out.println("Ouro: "+difOuro);
        System.out.println("Prata: "+difPrata);
        System.out.println("Bronze: "+difBronze);
    }


}
