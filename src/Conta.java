import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeCliente = "Jéssica Ferreira";
        String tipoDeConta = "Corrente";
        double saldo = 100.00;
        int opcao = 0;

        System.out.println("----------------------------------");
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("----------------------------------");

        String menu = """
                         DIGITE SUA OPÇÃO         
                1. Consultar saldo da conta
                2. Transferir valor
                3. Receber valor
                4. Sair do menu
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo é de R$ " + saldo + ".\n");
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = sc.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo suficiente para essa transferência! Volte ao menu e verifique " +
                            "\no seu saldo e tente novamente.\n");
                } else {
                    saldo -= valor;
                    System.out.println("\nTransferência realizada com sucesso!\nSeu saldo atualizado é de R$ " + saldo + ".\n");
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valorRecebido = sc.nextDouble();
                saldo += valorRecebido;
                System.out.println("Seu saldo atualizado é de R$ " + saldo + ".\n");
            } else if (opcao == 4) {
                System.out.println("Até breve!");
            } else if (opcao != 4) {
                System.out.println("Opção inválida, digite novamente!\n");
            }
        }
    }
}
