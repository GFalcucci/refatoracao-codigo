public class Xbox implements IConsole {
    private DadosConsole dadosconsole;

    @Override
    public void ligar() {
        System.out.println("ligando Xbox");
    }

    @Override
    public double calcularPreco() {
        return dadosconsole.getPrecoBase() * 1.18;
    }

    @Override
    public String getNome() {
        return dadosconsole.getNomeConsole();
    }

    public Xbox(DadosConsole dadosconsole) {
        this.dadosconsole = dadosconsole;
    }
}
