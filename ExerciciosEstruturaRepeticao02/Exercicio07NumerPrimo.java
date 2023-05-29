package ExerciciosEstruturaRepeticao02;

import java.util.Scanner;

//Determina se um número digitado é primo
public class Exercicio07NumerPrimo {
    public static void main(String[] args){
        System.out.println("Digite qualquer número e eu direi se ele é primo ou não!");

        Scanner entrada = new Scanner(System.in);
        int numDigitado = entrada.nextInt();

        //Setando variáveis
        int divEleMesmo = numDigitado % numDigitado;
        int divPorAnterior = 0;

        int contador = numDigitado;
        int contaZeros = 0;
        while (contador >= 1){
            if((numDigitado % contador) == 0){
                contaZeros = contaZeros + 1;
            }
            contador--;
        }

        if(contaZeros == 2){
            System.out.println("O número " + numDigitado + " é um número primo! :D");
        }else{
            System.out.println("O número " + numDigitado + " não é um número primo! :(");
        }

    }
}
