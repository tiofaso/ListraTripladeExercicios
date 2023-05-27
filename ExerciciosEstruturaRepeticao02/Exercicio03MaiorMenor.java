package ExerciciosEstruturaRepeticao02;

import java.util.Scanner;
//Programa que descobre o maior e o menor valor inserido
public class Exercicio03MaiorMenor {
    public static void main(String[] args) {//abre static
        // lendo teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 10 números e eu irei descobrir qual é o menor e o qual é o maior!\n");

        //setando variáveis
        int contadorNum = 1;
        String numPrint = "";

        //setando variável temporária para pegar o que for digitado
        int numDigitado = 0;
        int[] listaNumeros = new int[11];

        while (contadorNum <= 10) {//abre while
            System.out.println("Digite o seu " + contadorNum + "º número");

            numDigitado = entrada.nextInt();

            switch (contadorNum){
                case 1:
                    listaNumeros[0] = numDigitado;
                    break;

                case 2:
                    listaNumeros[1] = numDigitado;
                    break;

                case 3:
                    listaNumeros[2] = numDigitado;
                    break;

                case 4:
                    listaNumeros[3] = numDigitado;
                    break;

                case 5:
                    listaNumeros[4] = numDigitado;
                    break;

                case 6:
                    listaNumeros[5] = numDigitado;
                    break;

                case 7:
                    listaNumeros[6] = numDigitado;
                    break;

                case 8:
                    listaNumeros[7] = numDigitado;
                    break;

                case 9:
                    listaNumeros[8] = numDigitado;
                    break;

                case 10:
                    listaNumeros[9] = numDigitado;
                    break;
            }

            numPrint = numPrint + String.valueOf(numDigitado) + " ";
            contadorNum++;
        }// fecha while

        System.out.println("\nOs números digitados foram: " + numPrint);

       //Pesquisando o menor número - início
        int menorNum = 0;

        for(int i = 0; i < 10; i++){//início for i
            for(int j = i + 1; j < 10; j++){//início for j
                if(listaNumeros[i] < listaNumeros[j]){
                    menorNum = listaNumeros[i];
                    listaNumeros[i] = listaNumeros[j];
                    listaNumeros[j] = menorNum;
                }
            }//fim for j
        }//fim for i
        //Pesquisando o menor número - fim

        //Pesquisando o maior número - início
        int maiorNum = 0;

        for(int i = 0; i < 10; i++){//início for i
            for(int j = i + 1; j < 10; j++){//início for j
                if(listaNumeros[i] > listaNumeros[j]){
                    maiorNum = listaNumeros[i];
                    listaNumeros[i] = listaNumeros[j];
                    listaNumeros[j] = maiorNum;
                }
            }//fim for j
        }//fim for i
        //Pesquisando o maior número - fim

        System.out.println("O menor valor digitado foi: " +  menorNum );
        System.out.println("O maior valor digitado foi: " + maiorNum);



    }//fecha static
}
