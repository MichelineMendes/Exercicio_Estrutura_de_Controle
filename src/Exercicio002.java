//exercicio 002

import java.util.Scanner;

//Faça um programa que leia 10 números inteiros e exiba na tela a mensagem ‘Par’
// se ele for um número par, ou ‘Ímpar’ se ele for um número ímpar. (Comando if).
public class Exercicio002 {

    public static void main(String[] args) {
        int i = 0;
        while (i <= 10) {
            var leitor = new Scanner(System.in);
            System.out.print("Digite um número: ");
            Integer numero = leitor.nextInt();
            i = i + 1;

            if (numero % 2 == 0) {
                System.out.println("Esse número " + numero + " é par");
            } else {
                System.out.println("Esse número " + numero + " é ímpar");
            }


        }
     }
}

