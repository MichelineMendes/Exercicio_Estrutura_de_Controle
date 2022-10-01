import java.util.Scanner;

/*A prefeitura de João Pessoa abriu uma linha de crédito para os funcionários
municipais. O valor máximo da prestação não poderá ultrapassar 30% do salário
bruto. Fazer um algoritmo que permita entrar com o salário bruto e o valor da
prestação e informar se o empréstimo pode ou não ser concedido. (comando if) */
public class Exercicio005 {
    public static void main(String[] args) {
        System.out.println("****************************************************************************");
        System.out.println("Verifique se você pode obter um empréstimo, informando o valor de seu salário e o valor da parcela desejado.");
        var leitor = new Scanner(System.in);

        System.out.print("\nDigite o seu salário atual: ");
        Integer salario = leitor.nextInt();
        System.out.print("Digite o valor da parcela desejado: ");
        Integer parcela = leitor.nextInt();

        float percentual = 0.3f;
        float parcelaPermitida = salario * percentual;

        if (parcelaPermitida < parcela) {
            System.out.println(" \n O empréstimo não pode ser concedido."); }
        else {
            System.out.println("\n>>> O empréstimo pode ser concedido !!!");}
     }
 }