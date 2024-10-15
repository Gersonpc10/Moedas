package Conversor;

import java.util.Scanner;
import java.net.ConnectException;  // Utilizada para tratar exceções de conexão com a API.

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner leituraNomeCliente = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nomeCliente = leituraNomeCliente.nextLine();
        System.out.println(nomeCliente + ", Seja Bem Vindo ao conversor de Moedas ");

        int opcaoMenuPrincipal;
        ConectaApi conectaApi = new ConectaApi();

        try {
            String menuPrincipal = """
                    --------------------MENU------------------------
                    Selecione uma das opções abaixo: 
                    1\t Dólar (USD)\t\t -->\t Real (BRL)
                    2\t Euro (EUR)\t\t\t -->\t Real (BRL)
                    3\t Yuan China (CNY)\t -->\t Real (BRL)
                    4\t Real  (BRA)\t -->\t Yuan China (CNY)
                    5\t Real  (BRA)\t -->\t Euro (EUR)
                    6\t Real  (BRA)\t -->\t Dólar (USD)
                    7\t SAIR
                    -------------------------------------------------
                    """;

            System.out.println(menuPrincipal);

            // Utiliza um do-while para repetir o menu até que o usuário escolha a opção de sair.
            do {
                opcaoMenuPrincipal = scanner.nextInt();

                // switch-case, processa cada opção do menu: Lê o valor a ser convertido. Chama o método "paraConverter" da classe ConectaApi para realizar a conversão.Imprime o resultado da conversão. Cria uma nova instância de ExecutaSubMenuPrincipal (não implementada no código fornecido).Trata exceções de conexão e outras exceções não especificadas.
                switch (opcaoMenuPrincipal) {

                    case 1:
                        System.out.print("Quanto você deseja converter? ");
                        double valorConversao = scanner.nextInt();

                        System.out.println("conversão foi realizada com sucesso!");

                        String resultado = conectaApi.paraConverter("USD", "BRL", valorConversao);
                        System.out.println(resultado);

                        break;

                    case 2:
                        System.out.print("Quanto você deseja converter? ");
                        valorConversao = scanner.nextInt();

                        System.out.println("A conversão foi realizada com sucesso!");

                        resultado = conectaApi.paraConverter("EUR", "BRL", valorConversao);
                        System.out.println(resultado);

                        break;

                    case 3:
                        System.out.print("Quanto você deseja converter? ");
                        valorConversao = scanner.nextInt();

                        System.out.println("A conversão foi realizada com sucesso!");

                        resultado = conectaApi.paraConverter("CNY", "BRL", valorConversao);
                        System.out.println(resultado);

                        break;

                    case 4:
                        System.out.print("Quanto você deseja converter? ");
                        valorConversao = scanner.nextInt();

                        System.out.println("A conversão foi realizada com sucesso!");

                        resultado = conectaApi.paraConverter("BRL", "CNY", valorConversao);
                        System.out.println(resultado);

                        break;

                    case 5:
                        System.out.print("Quanto você deseja converter? ");
                        valorConversao = scanner.nextInt();

                        System.out.println("A conversão foi realizada com sucesso!");

                        resultado = conectaApi.paraConverter("BRL", "EUR", valorConversao);
                        System.out.println(resultado);

                        break;

                    case 6:
                        System.out.print("Quanto você deseja converter? ");
                        valorConversao = scanner.nextInt();

                        System.out.println("A conversão foi realizada com sucesso!");

                        resultado = conectaApi.paraConverter("BRL", "USD", valorConversao);
                        System.out.println(resultado);

                        break;

                    case 7:
                        System.out.println("Fim do programa!");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                        break;

                }

            }  while (opcaoMenuPrincipal != 7) ;
            scanner.close();
        } catch (ConnectException e) {
            System.err.println("Erro de conexão ao acessar a API: " + e.getMessage());
        } catch (RuntimeException e) {
            System.err.println("Erro ao acessar a API: " + e.getMessage()); //Este erro está aparecendo ao final
            //quando tento encerrar apertando 2 no submenu.
        }
    }
}

