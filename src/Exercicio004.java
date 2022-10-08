//exercicio 004

import java.util.Scanner;
/*Um motorista parou no posto de gasolina, comprou dois refrigerantes e abasteceu o
seu carro com gasolina. Leia a quantidade de litros de gasolina foram necessários
para abastecer o veículo e informe o valor total da conta desse cliente, sabendo-se
que cada refrigerante custou R$3,00 e o litro de gasolina está custando R$2,50.
(Estrutura Sequencial). */

public class Exercicio004 {
    public static void main(String[] args) {
        var leitor = new Scanner(System.in);

        System.out.print("Digite a quantidade de litros de gasolina abastecida: ");
        Integer litros = leitor.nextInt();

        System.out.println("Digite a quantidade de refrigerantes : ");
        Integer lata = leitor.nextInt();

        float abastece = 2.5f;
        float refrigerante = 3.0f;
        float totalGasolina = (abastece * litros);
        float totalConveniencia = (lata * refrigerante);
        float total =  totalGasolina + totalConveniencia;

        System.out.println("------------------------------");
        System.out.println("       CUPOM FISCAL           ");
        System.out.println("------------------------------");
        System.out.println("001 - GASOLINA COMUM .............");
        System.out.println( litros + " litros  x  R$ " + abastece + ".... R$" + totalGasolina  );
        System.out.println("\n002 - REFRIGERANTE EM LATA 350 ML ");
        System.out.println( lata + " latas  x  R$ " + refrigerante + "....... R$" + totalConveniencia );
        System.out.println("\nTOTAL  A PAGAR R$ " + total);






     }


}
