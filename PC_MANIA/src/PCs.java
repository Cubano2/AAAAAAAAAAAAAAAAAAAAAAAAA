class PCs {
    String marca;
    HardwareBasico processador;
    HardwareBasico memoria;
    HardwareBasico hd;
    SistemaOperacional so;
    MemoriaUSB usb;
    double preco;

    public PCs(String marca, HardwareBasico processador, HardwareBasico memoria, HardwareBasico hd, SistemaOperacional so, MemoriaUSB usb, double preco) {
        this.marca = marca;
        this.processador = processador;
        this.memoria = memoria;
        this.hd = hd;
        this.so = so;
        this.usb = usb;
        this.preco = preco;
    }

    public void exibirPC() {
        System.out.println("Marca: " + marca);
        System.out.println("Processador: " + processador.nome + " - " + processador.capacidade + "Mhz");
        System.out.println("Memória RAM: " + memoria.capacidade + "GB");
        System.out.println("HD: " + hd.capacidade + "GB");
        System.out.println("Sistema Operacional: " + so.nome + " (" + so.tipo + "-bits)");
        System.out.println("Memória USB: " + usb.nome + " - " + usb.capacidade + "GB");
        System.out.println("Preço: R$ " + preco);
    }
}
