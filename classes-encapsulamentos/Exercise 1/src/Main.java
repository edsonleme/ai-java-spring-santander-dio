import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TODO: todos os execicios devem ter um menu de interativo para chamar as funções
        // e ter uma opção de sair para finalizar a execução.
        //
        // Siga as seguintes regras para implementar
        //   - A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
        //   - O o valor do cheque especial é definido no momento da criação da conta, de acordo
        //   com o valor depositado na conta em sua criação;

        //   - Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
        //   - Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar
        //   uma taxa de 20% do valor usado do cheque especial.


        // consultar cheque especial
        //    - Depositar dinheiro;
        //    - Sacar dinheiro;
        //    - Pagar um boleto.
        //    - Verificar se a conta está usando cheque especial.

        Scanner sc = new Scanner(System.in);
        ContaBancaria  conta = new ContaBancaria();
        int option = 0;
        int menu = 0;
        do {
            if (menu == 0){
                System.out.println("***********************************");
                System.out.println("******   Digital Bank Leme   ******");
                System.out.println("***********************************");
                System.out.println("******     Menu Inicial      ******");
                System.out.println("***********************************");
                System.out.println("**** Digite a opcao desejada:  ****");
                System.out.println("** 1. Criar sua conta       *******");
                System.out.println("** 2. Consultar cheque especial  **");
                System.out.println("** 0. Para sair                  **");
                System.out.println("***********************************");
            } else if(menu > 0){
                System.out.println("**** Digite a opcao desejada:  ****");
                System.out.println("** 1. Criar sua conta       *******");
                System.out.println("** 2. Consultar cheque especial  **");
                System.out.println("** 0. Para sair                  **");
            }


            option = sc.nextInt();

            switch(option){
                case 1:
                    if(conta.depositoInicial != 0){
                        System.out.println("Sua conta já foi aberta!");
                        System.out.println("\n");
                        break;
                    }

                    System.out.println("Digite seu saldo inicial:");
                    Scanner dp = new  Scanner(System.in);



                    conta.criarConta(dp.nextDouble());

                    System.out.println("Seu saldo inicial: " + conta.depositoInicial);
                    System.out.println("\n");
                    break;

                case 2:
                    var limite = conta.getLimite();
                    System.out.println("Seu limite: " + limite);
                    System.out.println("\n");
                    break;

                default:
                    System.out.println("** Obrigado por utilizar nossos serviços **");
                    break;
            }
            menu = menu + 1;
        } while (option != 0);
        sc.close();

    }
}