public class DadosConsole {
    double precoBase;
    String nomeConsole;

    public double getPrecoBase() {
        return precoBase;
    }

    public String getNomeConsole() {
        return nomeConsole;
    }

    public DadosConsole(String nome, double precoBase) {
        this.nomeConsole = nome;
        this.precoBase = precoBase;
    }

}