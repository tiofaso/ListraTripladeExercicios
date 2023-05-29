package ExerciciosEstruturaDeDecisao;

import java.util.Scanner;

//Recebe dois números e mostra o maior deles
public class Exercicio01MaiorNumero {
    public static void main(String[] args) {
        System.out.println("Deixe-me descobrir qual é o maior número!");
        System.out.println("-----------------------------------------\n");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");

        int primeiroNum = entrada.nextInt();

        System.out.println("Digite o segundo número:");
        int segundoNum = entrada.nextInt();

        //Verificando qual é o maior número
        if(primeiroNum > segundoNum){System.out.println("\nO primeiro número é o maior!");}
        else if(primeiroNum < segundoNum){System.out.println("\nO segundo número é o maior!");}
        else{System.out.println("\nRá! Os dois números são iguais!");}


    }
}
