import java.util.Scanner;
import java.util.*;
//Faça um programa que receba duas notas de seis alunos, calcule e mostre
// O total de alunos aprovados;
//• O total de alunos de exame;
//• Total de alunos reprovados;
//• A média da classe
//(comando for)
public class Exercicio006 {
    public static void main(String[] args) {

        //foi preciso importat a biblioteca util e em seguida definit um locale para Default como ingles americano para que pudesse ser usado o ponto no lugar virgula para dados decimais.
        //antes estava confirgurado como pt-BR e só aceitava vírgula nas casas decimais

        Locale locale = new Locale("en", "US");
        Locale.setDefault(locale);
        //System.out.println(locale.getLanguage() + " - "
                //+ locale.getDisplayCountry()); se quise visualizar o locale atual

        var leitor = new Scanner(System.in);

        int aprovados = 0;
        int reprovados = 0;
        int total = 0;
        float media = 0;
        float nova_media;
        float notas_turma =0;
        System.out.println("****************************************************************************");
        System.out.println("Informe as notas dos seis alunos e verifique a média individual, a média da turma e quantos alunos foram aprovados, reprovados ou vão fazer prova final.");

        for (int i = 1; i < 7; i += 1){

            System.out.print("\nDigite a primeira nota do aluno " + i  + ":  ");
            float primeira = leitor.nextFloat();
            System.out.print("Digite a segunda nota do aluno " + i + ":  ");
            float segunda = leitor.nextFloat();


            nova_media = Math.round((primeira + segunda) / 2);
            notas_turma = media + nova_media;

            if (nova_media > 7.0) {
                aprovados = aprovados + 1;
                System.out.println("\nO aluno obteve média:  " + nova_media + "  Aluno aprovado por média!");
            }
            else if (nova_media <= 7) {
                if (nova_media > 3) {
                    total += 1;
                    System.out.println("\nO aluno obteve média: " + nova_media + "   Aluno fará prova final.");
                } else if (nova_media <3) {
                    reprovados = reprovados + 1;
                    System.out.println("\nO aluno obteve média: " + nova_media + "  Aluno está reprovado.");  }
            }
        }
        float media_turma = (notas_turma / 6);
        System.out.println("\n A seguir, os dados da turma:  ");
        System.out.println("O total de aprovados foi de : " + aprovados);
        System.out.println("O total de reprovados foi de : " + reprovados);
        System.out.println("O total de alunos em recuperação: " + total);
        System.out.println("\nA média total da  turma foi de : " + media_turma);
     }
}