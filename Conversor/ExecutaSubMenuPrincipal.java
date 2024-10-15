package Conversor;

import java.util.Scanner;

public class ExecutaSubMenuPrincipal {
    public ExecutaSubMenuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        int opcaoSubMenuPrincipal;

        try {

            String subMenuPrincipal = """
                *************************************************************
                Escolha a opção abaixo:
                1\tRetornar ao MENU anterior
                2\tSAIR
                *************************************************************
                """;
            System.out.println(subMenuPrincipal);


            do {
                opcaoSubMenuPrincipal = scanner.nextInt();

                switch (opcaoSubMenuPrincipal) {

                    case 1:
                        new MenuPrincipal();
                        break;

                    case 2:
                        System.out.println("Fim do programa!");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                        break;
                }

            } while (opcaoSubMenuPrincipal != 2);

        } catch (RuntimeException e) {
            System.err.println("Erro ao acessar a API:2 " + e.getMessage());
        }
        scanner.close();
    }
}
