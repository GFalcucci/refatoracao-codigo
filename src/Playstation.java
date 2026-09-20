public class Playstation implements IConsole {
    protected DadosConsole dadosconsole;

    public Playstation(DadosConsole dadosconsole) {
        this.dadosconsole = dadosconsole;
    }
    @Override
    public void ligar() {
        System.out.println("Ligando Playstation");
    }

    @Override
    public double calcularPreco() {
        return dadosconsole.getPrecoBase() * 1.20;
    }

    @Override
    public String getNome() {
        return dadosconsole.getNomeConsole();
    }


}
