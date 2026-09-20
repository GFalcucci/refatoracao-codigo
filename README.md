# Refatoração

## Este projeto apresenta a refatoração de um sistema de venda de consoles, aplicando princípios de Orientação a Objetos para melhorar a organização, a manutenção e a flexibilidade do código.

Refatorações realizadas
Encapsulamento: atributos de Console tornados privados, com acesso apenas por getters, evitando estados inválidos (como preço negativo).
Construtores: criação de construtores que exigem todos os dados necessários, garantindo que os objetos sempre nasçam em um estado válido.
OCP: criação da interface IConsole e da classe Xbox, permitindo adicionar novos tipos de console sem alterar a classe Loja.
Composição sobre Herança: extração dos dados comuns (nome e preço base) para a classe DadosConsole, usada por composição em Nintendo, Playstation e Xbox, em vez de repetir os mesmos atributos em cada classe.
Herança usada de forma apropriada: PlaystationPortatil reaproveita o comportamento de Playstation por herança, sobrescrevendo apenas o que realmente muda (mensagem de ligar() e percentual de calcularPreco()), sem violar o Princípio de Substituição de Liskov.
Polimorfismo: Loja passou a depender apenas da abstração IConsole, eliminando o if/else e o instanceof que antes verificavam o tipo de cada console.
Resultado

## A refatoração reduziu o acoplamento entre Loja e os tipos concretos de console, eliminou a repetição de código entre as classes e facilitou a inclusão de novos consoles no sistema.
