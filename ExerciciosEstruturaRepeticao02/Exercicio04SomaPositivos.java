package ExerciciosEstruturaRepeticao02;

import java.util.Scanner;

//Lê N números positivos e depois soma tudo
public class Exercicio04SomaPositivos {
    public static void main(String[] args){
        //Lendo teclado
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite qualquer número positivo para começar:");
        System.out.println("----------------------------------------------");

        int numPositivo = entrada.nextInt();

        //verificando se a pessoa digitou qualquer coisa além de número positivo
        int digitaCarai = 0;
        String somaNumPrint = "";
        int somaNum = 0;
        do{
            if(numPositivo < 0 || numPositivo == 0){
                System.out.println("Você precisa digitar um número positivo!");
                numPositivo = entrada.nextInt();
            }else{digitaCarai = 1;}
        }while(digitaCarai == 0);

        somaNum = numPositivo;
        somaNumPrint = String.valueOf(somaNum) + " ";

        int numFake = 0;

        do {
            System.out.println("Digite qualquer número positivo (para sair digite 0):");
            numPositivo = entrada.nextInt();
            somaNum = somaNum + numPositivo;
            numFake = numPositivo;
            somaNumPrint = somaNumPrint + String.valueOf(numFake) + " ";
        }while (numPositivo != 0);

        System.out.println("-----------");
        System.out.println("Os números digitados fortam: " + somaNumPrint);
        System.out.println("E a soma desses números dá " + somaNum);
    }


}
