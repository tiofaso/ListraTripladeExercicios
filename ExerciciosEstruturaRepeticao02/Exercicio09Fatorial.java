package ExerciciosEstruturaRepeticao02;

import java.util.Scanner;

//Calcula o fatorial de um número aleatório
public class Exercicio09Fatorial {
    public static void main(String[] args) {
        System.out.println("Digite qualquer número para eu mostrar o fatorial do mesmo!");
        Scanner entrada = new Scanner(System.in);

        int numDigitado = entrada.nextInt();
        int contador = numDigitado;
        int fatorial = numDigitado;
        String fatorialDisplay = "";


        while (contador > 1){
            fatorial = fatorial * (contador - 1);
            fatorialDisplay = fatorialDisplay + String.valueOf(contador) + " x ";
            contador--;

        }

        //Corrigindo como os resultados aparecerão no prompt
        if(numDigitado == 0){
            fatorial = 1;
            fatorialDisplay = "1";
        }else if(numDigitado == 1){
                fatorialDisplay = "1";
        }else{fatorialDisplay = fatorialDisplay + "1";}

        System.out.println("\n" + numDigitado + "! = " + fatorialDisplay);
        System.out.println("Resultado do fatorial: " + fatorial);


    }
}
