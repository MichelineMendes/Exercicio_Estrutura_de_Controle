import javax.swing.text.StringContent;
import java.io.StringReader;
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

        String opcao = "";
        float caixa = 0.0f;

        while (!opcao.equalsIgnoreCase("fim")) {


            System.out.print("\nDigite o nome do cliente: ");
            String nome = leitor.nextLine();

            System.out.println("Digite a quantidade de diárias: ");
            Integer dias = leitor.nextInt();

            int servico1 = (15 * dias);
            int servico2 = (8 * dias);
            int diaria = 40;
            int total = (dias * diaria);
            float pagar = 0.0f;



            if (dias < 10) {
                pagar = total + servico2;
                System.out.println(" O hóspede " + nome + " tem um total de despesas a pagar de: R$ " + pagar);


            } else {
                pagar = total + servico1;
                System.out.println(" O hóspede " + nome + " tem um total de despesas a pagar de: R$ " + pagar);}

            caixa = (caixa + pagar);
            System.out.println("total" + caixa);


            System.out.println("\nDigite fim para encerrar o programa: ");
                opcao = leitor.nextLine();




        }
    }
}