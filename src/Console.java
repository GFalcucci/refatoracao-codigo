class Console {
    private String nome;
    private String tipo;   // "nintendo", "playstation" ou "portatil"
    private double preco;

    public Console(String nome, String tipo, double preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }


    public String getTipo() {
        return tipo;
    }


    public double getPreco() {
        return preco;
    }

}
