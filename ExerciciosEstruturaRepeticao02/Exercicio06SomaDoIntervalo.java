package ExerciciosEstruturaRepeticao02;

import java.util.Scanner;

//Programa que calcula a soma dos números ímpares de um intervalo
public class Exercicio06SomaDoIntervalo {
    public static void main(String[] args){
        System.out.println("Eu quero somar os números ímpares, mas preciso de sua ajuda");
        System.out.println("Por favor defina um intervalo para eu calcular.\n");

        //Setando variáveis
        int numInicial = 0;
        int numFinal = 0;

        System.out.println("Digite um número inicial do intervalo:");
        Scanner entrada = new Scanner(System.in);

        numInicial = entrada.nextInt();

        System.out.println("Agora digite número final do intervalo:");
        numFinal = entrada.nextInt();

        if(numInicial >= numFinal){//usuário digitou um intervalo inválido
            System.out.println("Intervalo de valores inválido! :(");
        }else{//usuário digitou um intervalo correto
            int contador = numInicial;
            String numImpares = "";
            int somaNumeros = 0;

            int ehImpar = numInicial % 2;

//            //verificando se o primeiro número do intervalo é ímpar
//            if(ehImpar != 0){
//                somaNumeros = numInicial;
//            }

            while (contador <= numFinal){
                ehImpar = contador % 2;
                if(ehImpar != 0){
                    somaNumeros = somaNumeros + contador;
                    numImpares = numImpares + String.valueOf(contador) + " ";
                }

                contador++;
            }// fim while

            System.out.println("Os números do intervalo são estes: " + numImpares);
            System.out.println("O valor da soma deles é: " + somaNumeros);
        }//fim do if


    }
}
