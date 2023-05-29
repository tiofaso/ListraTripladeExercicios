package ExerciciosEstruturaDeDecisao;

import java.util.Scanner;

//Programa que pega médias parciais e indica se a pessoa foi aprovada ou não
public class Exercicio03MediaParcial {
    public static void main(String[] args){
            System.out.println("Vamos calcular a sua média parcial?");
            System.out.println("-----------------------------------\n");

            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite a sua primeira nota:");
            double notaPrimeira = entrada.nextDouble();

            System.out.println("Digite a sua primeira nota:");
            double notaSegunda = entrada.nextDouble();

            double preMedia = (notaPrimeira + notaSegunda)/2;

            System.out.println("Primeira nota: " + notaPrimeira);
            System.out.println("Segunda nota: " + notaSegunda);
            System.out.println("Sua média parcial é: " + preMedia);

            System.out.println("-----------------------------------");
            if(preMedia >= 7.0){System.out.println("Situação até o momento: APROVADO");}
            else if(preMedia <= 7.0){System.out.println("Situação até o momento: REPROVADO");}
            else if(preMedia == 10.0){System.out.println("Situação até o momento: APROVADO COM DISTINÇÃO");}
            System.out.println("-----------------------------------");
    }
}
