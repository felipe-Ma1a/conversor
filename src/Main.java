import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        while (true) {
            System.out.println("******************************************");
            System.out.println("      Seja bem-vindo(a) ao Conversor de Moeda =]");
            System.out.println("******************************************");
            System.out.println("1) Dólar => Peso argentino");
            System.out.println("2) Peso argentino => Dólar");
            System.out.println("3) Dólar => Real brasileiro");
            System.out.println("4) Real brasileiro => Dólar");
            System.out.println("5) Dólar => Peso colombiano");
            System.out.println("6) Peso colombiano => Dólar");
            System.out.println("7) Sair");
            System.out.print("Escolha uma opção válida: ");

            opcao = scanner.nextInt();

            if (opcao == 7) {
                System.out.println("Saindo do programa. Obrigado por utilizar o Conversor de Moeda!");
                break;
            }

            String moedaOrigem;
            String moedaDestino;

            switch (opcao) {
                case 1:
                    moedaOrigem = "USD";
                    moedaDestino = "ARS";
                    break;
                case 2:
                    moedaOrigem = "ARS";
                    moedaDestino = "USD";
                    break;
                case 3:
                    moedaOrigem = "USD";
                    moedaDestino = "BRL";
                    break;
                case 4:
                    moedaOrigem = "BRL";
                    moedaDestino = "USD";
                    break;
                case 5:
                    moedaOrigem = "USD";
                    moedaDestino = "COP";
                    break;
                case 6:
                    moedaOrigem = "COP";
                    moedaDestino = "USD";
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                    continue;
            }

            System.out.print("Digite o valor que deseja converter: ");
            double valor = scanner.nextDouble();

            try {
                double taxa = conversor.obterTaxaDeCambio(moedaOrigem, moedaDestino);
                double valorConvertido = valor * taxa;
                System.out.printf("Valor %.2f [%s] corresponde ao valor final de >>> %.2f [%s]\n",
                        valor, moedaOrigem, valorConvertido, moedaDestino);
            } catch (RuntimeException e) {
                System.out.println("Erro ao buscar a taxa de câmbio: " + e.getMessage());
            }

            System.out.println();
        }

        scanner.close();
    }
}