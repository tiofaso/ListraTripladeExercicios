package ExerciciosEstruturaRepeticao02;

import java.util.Scanner;

public class Exercicio02MediaInteiros {
    public static void main(String[] args){
        // lendo teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade denúmeros que você quer dar entrada:");
        int usuarioNum = entrada.nextInt();

        //setando variáveis
        int contadorNum = 1;
        int somaNum = 0;
        String somaNumPrint = "";

        System.out.println("Você escolheu " + usuarioNum + " números");
        System.out.println("----------------------------------------");

        //setando variável temporária para pegar o que for digitado
        int numDigitado = 0;

        while (contadorNum <= usuarioNum){
            System.out.println("Digite o seu " + contadorNum + "º número");

            numDigitado = entrada.nextInt();
            somaNum = somaNum + numDigitado;
            somaNumPrint = somaNumPrint + String.valueOf(numDigitado) + " ";
            contadorNum++;
        }

        //Convertendo a média para poder mostrar as casas decimais
        double mediaFinal = somaNum/usuarioNum;

        System.out.println("Os números digitados foram: " + somaNumPrint);
        System.out.println("A média deles é: ~" + mediaFinal);
    }
}
