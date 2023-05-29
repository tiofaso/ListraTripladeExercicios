package ExerciciosEstruturaDeDecisao;

import java.util.Scanner;

//Programa para exibir dia da semana a partir de um número
public class Exercicio05DiaDaSemana {
    public static void main(String[] args){
        System.out.println("Digite um número de 1 a 7 para exibir o dia da semana");
        System.out.println("-----------------------------------------------------");

        Scanner entrada = new Scanner(System.in);
        int diaSemana = entrada.nextInt();

        switch (diaSemana) {//início switch
            case 1:
                System.out.println("1 é para domingo!");
                break;
            case 2:
                System.out.println("2 é para segunda-feira!");
                break;
            case 3:
                System.out.println("3 é para terça-feira!");
                break;
            case 4:
                System.out.println("4 é para quarta-feira!");
                break;
            case 5:
                System.out.println("5 é para quinta-feira!");
                break;
            case 6:
                System.out.println("6 é para sexta-feira!");
                break;
            case 7:
                System.out.println("7 é para sábado!");
                break;
            default:
                System.out.println("Você digitou um valor inválido! :(");
        }//fim switch
    }
}
