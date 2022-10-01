//Exercício 001 do TED da disciplina Linguagem de Programação

import java.util.Scanner;

public class Exercicio001 {
    //Exercício 001 - Faça um programa que receba o valor dos créditos galácticos de um Star trooper e
//o percentual de aumento, calcule e mostre os créditos galácticos com o novo aumento.
    public static void main(String[] args) {
        var leitor = new Scanner(System.in);

        System.out.print("Digite o valor em crédidos: ");
        float credito = leitor.nextFloat();
        System.out.print("Digite o percentual de aumento: ");
        float aumento = leitor.nextFloat();

        var ganho = credito * aumento/100;
        var novo = credito + ganho;

        System.out.println("O novo valor em créditos é de  " + novo);
    }
}