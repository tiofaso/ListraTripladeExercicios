package ExerciciosEstruturaRepeticao02;

import java.util.Scanner;

//Programa que faz a soma dos primeiros 50 ímpares
public class Exercicio08Soma50Impares {
    public static void main(String[] args){
        System.out.println("Vou somar os primeiros 50 números ímpares!");
        System.out.println("------------------------------------------\n");

        int contador = 0;
        String numImpares = "";
        int somaNumeros = 0;
        int ehImpar = 0;

        while (contador <= 50){
            ehImpar = contador % 2;
            if(ehImpar != 0){
                somaNumeros = somaNumeros + contador;
                numImpares = numImpares + String.valueOf(contador) + " ";
            }

            contador++;
        }// fim while

            System.out.println("Os números do intervalo são estes: " + numImpares);
            System.out.println("O valor da soma deles é: " + somaNumeros);
    }
}
