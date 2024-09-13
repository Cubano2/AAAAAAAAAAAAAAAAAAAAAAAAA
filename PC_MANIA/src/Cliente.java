class Cliente {
    String nome;
    PC[] pcsComprados;
    int quantidadeCompras;
    double totalCompra = 0;

    // Construtor para iniciar o array
    public Cliente(String nome) {
        this.nome = nome;
        this.pcsComprados = new PC[5]; // Considerando que o cliente vai comprar no máximo 5 PCs
        this.quantidadeCompras = 0;
    }

    public void comprarPC(PC pc) {
        if (quantidadeCompras < pcsComprados.length) {
            pcsComprados[quantidadeCompras] = pc;
            quantidadeCompras++;
            totalCompra += pc.preco;
        } else {
            System.out.println("Limite de PCs comprados atingido!");
        }
    }

    public void exibirCompra() {
        System.out.println("\nCliente: " + nome);
        System.out.println("PCs comprados:");
        for (int i = 0; i < quantidadeCompras; i++) {
            pcsComprados[i].exibirPC();
            System.out.println();
        }
        System.out.println("Total da compra: R$ " + totalCompra);
    }
}
