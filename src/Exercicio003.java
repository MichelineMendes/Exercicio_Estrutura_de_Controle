//exercicio 003

import java.util.Scanner;
/*Uma empresa decidiu dar 20% de aumento aos funcionários cujos salários são inferiores a 500 reais. Escreva um programa que leia o salário de vários
funcionários se mostre o valor do salário reajustado ou uma mensagem caso o funcionário não tenha direito ao aumento. O programa será encerrado quando se
digitar “fim” para o nome do funcionário. (Comando while)*/
public class Exercicio003 {
    public static void main(String[] args) {
        var leitor = new Scanner(System.in);

        String opcao = "";

        while (!opcao.equalsIgnoreCase("fim")) {

            System.out.print("Digite seu salário: ");

            float salario = leitor.nextFloat();
            float aumento = 1.2f;
            float percentual = 0.2f;
            float aumentou = Math.round(salario * percentual);

            if (salario < 500) {
                float novoSalario = Math.round(salario * aumento);
                System.out.println("Você recebeu R$" + aumentou + " de aumento. Seu salário atual é de: R$" + novoSalario);
            }

            if (salario >= 500) {
                System.out.println("Você não tem direito a aumento de salário!");
            }

            System.out.println("digite fim para encerra ro programa: ");
            opcao = leitor.nextLine();


        }
     }
}