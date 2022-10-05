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
        int quantidade_de_pc = 0;
        int idade_homens = 0;
        int quant_homens= 0;
        int quant_mulheres_altura_peso = 0;
        int pessoa_18e25 = 0;
        int media_de_homens = 0;
        float menor_altura_mulher = 0.0f;
        int maior_idade =0;




        ArrayList<String> dados = new ArrayList<String>();

        var leitor = new Scanner(System.in);


       String opcao = "";
       while (!opcao.equalsIgnoreCase("fim")){

            System.out.print("\nDigite o nome do paciente ou fim para encerrar: ");
            String nome = leitor.nextLine ();

            System.out.print("\nDigite o sexo do cliente ( 1 para Masculino  ou 2 para  Feminino): ");
            Integer sexo = leitor.nextInt();

            System.out.println("Digite a idade do paciente (anos): ");
            Integer idade = leitor.nextInt();

            System.out.print("Digite a altura do paciente:  ");
            float altura = leitor.nextFloat();

            System.out.print("Digite o peso do paciente:  ");
            float peso = leitor.nextFloat();
           quantidade_de_pc++;

            if ( (sexo == 1)) {
                if ((altura > 1.6) && (altura <1.7) && (peso > 70)){
                quant_mulheres_altura_peso++;}

                if (menor_altura_mulher > altura) {
                    menor_altura_mulher = altura;  }

            } else if (sexo ==2) {
                idade_homens = (idade_homens + idade);
                quant_homens++;
                media_de_homens = ((idade_homens / quant_homens));
            }else{
                System.out.println("Opção de sexo inválida");}


            if ((idade >18) && (idade< 25)){
                pessoa_18e25 = pessoa_18e25 +1;
            }

            if (maior_idade < idade){
                maior_idade = idade;
            }

            }
       System.out.println( "\nA quantidade de pacientes é:  " + quantidade_de_pc);
       System.out.println(("A média de idade dos homens é: "  + media_de_homens));
       System.out.println("A quantidade de mulheres com peso entre 1,6 e 1,7, com mais de 70kg é:  " + quant_mulheres_altura_peso) ;
       System.out.println(("A quantidade de pessoas com idade entre 18 e 25 é:  " + pessoa_18e25));
       System.out.println(("A pessoa mais velha é: "  + maior_idade));

   }
}



















