class PC {
    String marca;
    HardwareBasico[] hardwares; // Array para os hardwares
    SistemaOperacional so;
    MemoriaUSB usb;
    double preco;

    // Construtor atualizado
    public PC(String marca, HardwareBasico[] hardwares, SistemaOperacional so, double preco) {
        this.marca = marca;
        this.hardwares = hardwares;
        this.so = so;
        this.preco = preco;
    }

    // Adicionar Musb
    public void addMusb(MemoriaUSB usb) {
        this.usb = usb;
    }

    public void exibirPC() {
        System.out.println("Marca: " + marca);
        System.out.println("Componentes de hardware:");
        for (HardwareBasico hardware : hardwares) {
            System.out.println(hardware.nome + " - " + hardware.capacidade + "Mhz/GB");
        }
        System.out.println("Sistema Operacional: " + so.nome + " (" + so.tipo + "-bits)");
        if (usb != null) {
            System.out.println("Memória USB: " + usb.nome + " - " + usb.capacidade + "GB");
        }
        System.out.println("Preço: R$ " + preco);
    }
}
