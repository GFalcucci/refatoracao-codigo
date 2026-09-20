public class PlaystationPortatil extends Playstation {

    public PlaystationPortatil(DadosConsole dadosconsole) {
        super(dadosconsole);
    }

    @Override
    public void ligar() {
        System.out.println("Ligando Playstation Portatil");
    }
    @Override
    public double calcularPreco() {
        return dadosconsole.getPrecoBase() * 1.15;
    }
    @Override
    public String getNome() {
        return "playstation portatil";
    }
}
