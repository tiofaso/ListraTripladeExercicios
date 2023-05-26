package ExerciciosEstruturaRepeticao01;

import java.util.Scanner;

//Programa para zera fila
public class Exercicio05ZerarFila {
    public static void main(String[] args){
        //Lendo teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o tamanho da fila que tá nesse banco:");
        int tamanhoFila = entrada.nextInt();

        do{
            System.out.println("Agora tem " + tamanhoFila + " pessoas");
            tamanhoFila--;
        }while (tamanhoFila > 0);

        System.out.println("Ufa! Zerou a fila!");
    }
}
