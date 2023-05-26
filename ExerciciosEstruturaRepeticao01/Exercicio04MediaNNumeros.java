package ExerciciosEstruturaRepeticao01;

import java.util.Random;
import java.util.Scanner;

//Programa que pega N números aleatórios e mostra a média
public class Exercicio04MediaNNumeros {
    public static void main (String[] args){
        //Lendo teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite qualquer número inteiro:");
        int numeroUsuario = entrada.nextInt();

        //Setando contador com o número definido pelo usuário
        int contadorUsuario = numeroUsuario;
        int mediaNumero = 0;

        //Gerando números aleatórios
        Random aleatorio = new Random();
        int numeroAleatorio = 0;

        //Armazenar os números que foram utilizados na média
        String somaNumeros = "";

        while(contadorUsuario > 0){
            numeroAleatorio = aleatorio.nextInt(numeroUsuario);
            somaNumeros = somaNumeros + String.valueOf(numeroAleatorio) + " ";
            mediaNumero = mediaNumero + numeroAleatorio;

            contadorUsuario--;
        }

        //Convertendo o valor final da média para mostras os decimais
        double mediaFinal = mediaNumero/numeroUsuario;

        System.out.println("###" + mediaNumero);
        System.out.println("Você solicitou a média de: " + numeroUsuario + " números");
        System.out.println("Os números somados foram: " + somaNumeros);
        System.out.println("A média deles é: " + mediaFinal);
    }
}
