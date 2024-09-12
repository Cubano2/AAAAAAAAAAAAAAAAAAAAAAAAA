import java.util.Scanner;

public class PCMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matricula = 9834;

        // Promoções
        PCs promo1 = new PCs("Positivo", new HardwareBasico("Pentium", 2200), new HardwareBasico("Memória RAM", 8),
                new HardwareBasico("HD", 500), new SistemaOperacional("Linux Ubuntu", 32),
                new MemoriaUSB("Pen-drive", 16), matricula);

        PCs promo2 = new PCs("Acer", new HardwareBasico("Core i5", 3370), new HardwareBasico("Memória RAM", 16),
                new HardwareBasico("HD", 1000), new SistemaOperacional("Windows 8", 64),
                new MemoriaUSB("Pen-drive", 32), matricula + 1234);

        PCs promo3 = new PCs("Vaio", new HardwareBasico("Core i7", 4500), new HardwareBasico("Memória RAM", 32),
                new HardwareBasico("HD", 2000), new SistemaOperacional("Windows 10", 64),
                new MemoriaUSB("HD Externo", 1000), matricula + 5678);

        // Criar cliente
        System.out.print("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();
        Cliente cliente = new Cliente(nomeCliente);

        // Sistema de compras
        while (true) {
            System.out.println("\nEscolha uma promoção:");
            System.out.println("1 - Promoção 1 (Positivo)");
            System.out.println("2 - Promoção 2 (Acer)");
            System.out.println("3 - Promoção 3 (Vaio)");
            System.out.println("0 - Finalizar compra");
            System.out.print("Digite o código da promoção: ");
            int codigo = scanner.nextInt();

            if (codigo == 0) {
                break; // Finaliza a compra
            }

            switch (codigo) {
                case 1:
                    cliente.comprarPC(promo1);
                    break;
                case 2:
                    cliente.comprarPC(promo2);
                    break;
                case 3:
                    cliente.comprarPC(promo3);
                    break;
                default:
                    System.out.println("Código inválido!");
                    break;
            }
        }

        // Exibir resumo da compra
        cliente.exibirCompra();

        scanner.close();
    }
}
