import java.util.ArrayList;

class Cliente {
    String nome;
    ArrayList<PCs> pcsComprados = new ArrayList<>();
    double totalCompra = 0;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void comprarPC(PCs pc) {
        pcsComprados.add(pc);
        totalCompra += pc.preco;
    }

    public void exibirCompra() {
        System.out.println("\nCliente: " + nome);
        System.out.println("PCs comprados:");
        for (PCs pc : pcsComprados) {
            pc.exibirPC();
            System.out.println();
        }
        System.out.println("Total da compra: R$ " + totalCompra);
    }
}

