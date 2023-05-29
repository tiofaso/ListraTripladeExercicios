package ExerciciosEstruturaDeDecisao;

import java.text.DecimalFormat;
import java.util.Scanner;

//Programa para reajuste do salário da zup
public class Exercicio04SalarioZup {
    public static void main(String[] args){
        System.out.println("Olá zupper! Vamos saber o quanto você terá de aumento?");
        System.out.println("Digite logo abaixo o quanto você ganha que eu te respondo...?");
        System.out.println("-------------------------------------------------------------");

        Scanner entrada = new Scanner(System.in);
        double salarioAtual = entrada.nextDouble();
        double salarioAumento = 0;
        double salarioPercentual = 0;
        double salarioNovo = 0;

        //definindo as porcentagens de aumento
        if(salarioAtual <= 280){
            salarioPercentual = 0.2;
            salarioAumento = salarioAtual * salarioPercentual;
            salarioNovo = salarioAtual + salarioAumento;
        }else if (salarioAtual > 280 && salarioAtual <= 700){
            salarioPercentual = 0.15;
            salarioAumento = salarioAtual * salarioPercentual;
            salarioNovo = salarioAtual + salarioAumento;
        }else if (salarioAtual > 700 && salarioAtual <= 1500){
            salarioPercentual = 0.1;
            salarioAumento = salarioAtual * salarioPercentual;
            salarioNovo = salarioAtual + salarioAumento;
        }else if (salarioAtual > 1500){
            salarioPercentual = 0.05;
            salarioAumento = salarioAtual * salarioPercentual;
            salarioNovo = salarioAtual + salarioAumento;
        }

        DecimalFormat dinheiro = new DecimalFormat("0.00");
        DecimalFormat porcentagem = new DecimalFormat("0");

        System.out.println("O seu salário antes do reajuste é de: R$" + dinheiro.format(salarioAtual));
        System.out.println("O seu percentual de aumento é: " + porcentagem.format((salarioPercentual*100)) + "%");
        System.out.println("O valor do aumento será de: R$" + dinheiro.format(salarioAumento));
        System.out.println("O seu novo salário será de: R$" + dinheiro.format(salarioNovo));
    }
}
