package ExerciciosEstruturaRepeticao01;

import java.util.Scanner;

//Programa que lê 5 números aleatórios e depois mostra sua soma
public class Exercicio03SomaCincoNumeros {
    public static void main(String[] Args){
        //Lendo as entradas do teclado
        Scanner entrada = new Scanner(System.in);

        int num01, num02, num03, num04, num05;
        num01 = 0;
        num02 = 0;
        num03 = 0;
        num04 = 0;
        num05 = 0;

        int cont = 1;

        do{
            switch (cont) {
                case 1:
                    System.out.println("Digite o primeiro número:");
                    num01 = entrada.nextInt();
                    break;
                case 2:
                    System.out.println("Digite o segundo número:");
                    num02 = entrada.nextInt();
                    break;
                case 3:
                    System.out.println("Digite o terceiro número:");
                    num03 = entrada.nextInt();
                    break;
                case 4:
                    System.out.println("Digite o quarto número:");
                    num04 = entrada.nextInt();
                    break;
                case 5:
                    System.out.println("Digite o quinto número:");
                    num05 = entrada.nextInt();
                    break;
            }//fim switch

            cont++;
        }while (cont <= 5);

        //Setando variável
        int somaNumeros = num01 + num02 + num03 + num04 + num05;
        System.out.println("Você digitou: " + num01 + ", " + num02 + ", " + num03 + ", " + num04 + " e " + num05);
        System.out.println("A soma de todos os números é igual a: " + somaNumeros);
    }
}
