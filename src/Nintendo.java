public class Nintendo implements IConsole {
    private DadosConsole dadosconsole;

    @Override
    public void ligar() {
        System.out.println("ligando nintendo");
    }

    @Override
    public double calcularPreco() {
            return dadosconsole.getPrecoBase() * 1.10;
    }

    @Override
    public String getNome() {
        return dadosconsole.getNomeConsole();
    }

    public Nintendo(DadosConsole dadosconsole) {
        this.dadosconsole = dadosconsole;
    }
}
