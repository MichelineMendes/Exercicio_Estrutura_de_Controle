import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio008 {
    /*    Leia uma relação de pacientes de uma clínica, cada um com o nome, o
    sexo, o peso, a idade e a altura. Para sinalizar o fim da lista será fornecido
“fim” no nome do último paciente.
Exiba um relatório contendo:
• a quantidade de pacientes.
• a média de idade dos homens.
• a quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg.
• a quantidade de pessoas com idade entre 18 e 25.
• o nome do paciente mais velho.
• o nome da mulher mais baixa.*/

    public static void main(String[] args) {
        int quant_de_paciente = 0;
        int idade_homens = 0;
        int quant_homens = 0;
        int quantidadeMulheresAcima160eAbaixo170ePeso70 = 0;
        int quantidadePessoasEntre18e25Anos = 0;
        int maior_idade = 0;
        int sexo;
        float menorAlturaMulher = 0f;
        float media_de_homens = 0.0f;
        String nome = "", pessoa_mais_velha = "", baixinha = "";
        boolean continuar = true;
        var leitor = new Scanner(System.in);
        while (continuar) {

            System.out.print("\nDigite o nome do paciente:");
            nome = leitor.next();
            quant_de_paciente++;
            System.out.print("\nDigite o sexo do cliente ( 1 para  Feminino ou 2 para Masculino): ");
            sexo = leitor.nextInt();
            System.out.println("Digite a idade do paciente (anos): ");
            int idade = leitor.nextInt();
            System.out.print("Digite a altura do paciente:  ");
            float altura = leitor.nextFloat();
            System.out.print("Digite o peso do paciente:  ");
            float peso = leitor.nextFloat();


            if ((sexo == 1)) { //se feminino
                if ((altura > 1.6) && (altura < 1.7) && (peso > 70)) {
                    quantidadeMulheresAcima160eAbaixo170ePeso70++;
                }

                if (menorAlturaMulher == 0) { //Significa que eh a primeira mulher.
                    menorAlturaMulher = altura;
                    baixinha = nome;
                } else if(menorAlturaMulher > altura) {
                    menorAlturaMulher = altura;
                    baixinha = nome;
                }

            } else if (sexo == 2) {
                idade_homens = (idade_homens + idade);
                quant_homens++;
                media_de_homens = ((float)idade_homens / (float)quant_homens);
            } else {
                System.out.println("Opção de sexo inválida");
            }


            if ((idade > 18) && (idade < 25)) {
                quantidadePessoasEntre18e25Anos = quantidadePessoasEntre18e25Anos + 1;
            }

            if (maior_idade < idade) {
                maior_idade = idade;
                pessoa_mais_velha = nome;
            }

            System.out.print("\n\nDigite fim para sair;");
            //continuar = !"fim".equals(leitor.next()) ;
            if ("fim".equals(leitor.next())) {
                continuar = false;

            }
        }
        System.out.println("\nA quantidade de pacientes é:  " + quant_de_paciente);
        System.out.println(("A média de idade dos homens é: " + media_de_homens));
        System.out.println("A quantidade de mulheres com peso entre 1,6 e 1,7, com mais de 70kg é:  " + quantidadeMulheresAcima160eAbaixo170ePeso70);
        System.out.println(("A quantidade de pessoas com idade entre 18 e 25 é:  " + quantidadePessoasEntre18e25Anos));
        System.out.println(("A pessoa mais velha é: " + pessoa_mais_velha));
        System.out.println(("A mulher mas baixa é: " + baixinha));

    }
}



















