package ListaCesar.Aula15;

class AutomovelDeLuxo extends AutomovelBasico{
    private static final byte NUMEROMAXIMODEPRESTACOES = 36;
    private boolean direcaoHidraulica;
    private boolean cambioAutomatico;
    private boolean vidrosETravasEletricas;

    AutomovelDeLuxo(String m, String c, byte comb, boolean retro, boolean limpa, boolean radio, boolean dir, boolean camb, boolean vidro) {
        super(m, c, comb, retro, limpa, radio);
        direcaoHidraulica = dir;
        cambioAutomatico = camb;
        vidrosETravasEletricas = vidro;
    }
    AutomovelDeLuxo(String m, String c, byte comb) {
        super(m, c, comb);
        direcaoHidraulica = true;
        cambioAutomatico = true;
        vidrosETravasEletricas = true;
    }
    public float quantoCusta() {
        float preco = super.quantoCusta();
        if(direcaoHidraulica) preco += 5340;
        if(cambioAutomatico) preco += 7500;
        if(vidrosETravasEletricas) preco += 2320;
        return preco;
    }
    public byte quantasPrestacoes() {
        return NUMEROMAXIMODEPRESTACOES;
    }
    public String toString() {
        String resultado = super.toString();

        if(direcaoHidraulica) resultado += "Com direção Hidráulica\n";
        if(cambioAutomatico) resultado += "Com câmbio automático\n";
        if(vidrosETravasEletricas) resultado += "Com vidros e travas elétricas\n";
        return resultado;
    }
}