import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Nintendo nintendo = new Nintendo(new DadosConsole("Nintendo Switch", 2000.0));
        Playstation playstation = new Playstation(new DadosConsole("Playstation 5", 3000.0));
        PlaystationPortatil portatil = new PlaystationPortatil(new DadosConsole("Playstation Portátil", 2500.0));
        Xbox xbox = new Xbox(new DadosConsole("Xbox", 2800.0));

        Loja loja = new Loja();
        loja.venderConsole(nintendo);
        loja.venderConsole(playstation);
        loja.venderConsole(portatil);


        List<IConsole> consoles = new ArrayList<>();
        consoles.add(nintendo);
        consoles.add(playstation);

        loja.venderVarios(consoles);
        System.out.println("Faturamento total: R$ " + loja.calcularFaturamentoTotal(consoles));

        consoles.add(portatil);
        consoles.add(xbox);

        loja.venderVarios(consoles);
        System.out.println("Faturamento total: R$ " + loja.calcularFaturamentoTotal(consoles));
    }
}



// DESAFIO FINAL: o que precisou mudar em Loja para o Xbox passar a
// funcionar? O que isso demonstra sobre o Princípio Aberto/Fechado (OCP)?
// Nao precisei alterar nada, foi apenas adcionar a classe Xbox, isso demonstra que o principio aberto e fechado é muito util, pois evita ter que fazer grandes alteraçoes ao adcionar algo novo.