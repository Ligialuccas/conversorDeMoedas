import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        ConverterMoedas converterMoedas = new ConverterMoedas();


        Menu.exibirMenu();

        System.out.println("\nDigite o número da moeda de ORIGEM (ou 0 para sair): ");
        int moeda1 = leitura.nextInt();

        if (moeda1 == 0) {
            System.out.println("Encerrando o programa");
            System.exit(0);
        }

        System.out.println("Digite o número da moeda de DESTINO: ");
        int moeda2 = leitura.nextInt();

        System.out.println("Digite o valor: ");
        double valor = leitura.nextDouble();

        String siglaMoedaOrigem = MoedaUtil.getSiglaMoeda(moeda1);
        String siglaMoedaDestino = MoedaUtil.getSiglaMoeda(moeda2);

        System.out.println("Convertendo de " + siglaMoedaOrigem + " para " + siglaMoedaDestino);

        Informacoes resultado = converterMoedas.fazerConversao(siglaMoedaOrigem, siglaMoedaDestino, valor);

        System.out.println(resultado);
        System.out.println("Resultado da conversão:");
        System.out.println(valor + " " + siglaMoedaOrigem + " = " + resultado.conversion_result() + " " + siglaMoedaDestino);


    }
}