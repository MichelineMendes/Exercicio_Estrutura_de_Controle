import java.util.Scanner;
/*import java.util.Scanner;
//Uma pousada estipulou o preço da diária em R$ 40,00 e mais uma taxa de serviços //diários de:
//• R$ 15,00, se o número de dias for menor que 10;
//• R$ 8,00, se o número de dias for maior ou igual a 10.
//Criar um programa em Java que informe o nome, o valor da conta de cada cliente
//e ao final o total arrecadado pela pousada. (Comando while)*/

public class Exercicio007 {
    public static void main(String[] args) {

        var leitor = new Scanner(System.in);

        String cliente = "";
        int pousada = 0;
        int total_a_pagar = 0;


        while (!cliente.equalsIgnoreCase("fim")) {
            System.out.print("\nDigite o nome do cliente");
            cliente = leitor.next();

            System.out.print("\nDigite a quantidade de diárias: ");
            int dias = leitor.nextInt();

            if (dias < 10) {
                total_a_pagar = (dias * 40) + (dias * 8);
                System.out.println(" O hóspede " + cliente + " tem um total de despesas a pagar de: R$ " + total_a_pagar);

            } else {
                total_a_pagar = (dias * 40) + (dias * 15);
                System.out.println(" O hóspede " + cliente + " tem um total de despesas a pagar de: R$ " + total_a_pagar);
            }
            pousada = pousada + total_a_pagar;
            System.out.println("\nO caixa da pousada tem R$ " + pousada);

            System.out.print("\n\nDigite qualquer coisa para continuar ou fim para sair: ");
            cliente = leitor.next();

        }
    }
    }
