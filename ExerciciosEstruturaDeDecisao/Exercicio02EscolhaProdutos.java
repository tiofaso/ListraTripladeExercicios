package ExerciciosEstruturaDeDecisao;

import java.util.Scanner;

//Define qual produto é mais em conta
public class Exercicio02EscolhaProdutos {
    public static void main(String[] args){
        System.out.println("Qual será o produto mais em conta?");
        System.out.println("Digite o preço de cada um que eu irei te dizer!");
        System.out.println("-----------------------------------------------\n");

        //Lendo teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do produto A");
        double produtoA = entrada.nextDouble();

        System.out.println("Digite o valor do produto B");
        double produtoB = entrada.nextDouble();

        System.out.println("Digite o valor do produto C");
        double produtoC = entrada.nextDouble();

        String produtoEscolhido = "";

        if(produtoA < produtoB && produtoA < produtoC){produtoEscolhido = "A";}
        else if(produtoB < produtoA && produtoB < produtoC){produtoEscolhido = "B";}
        else if(produtoC < produtoA && produtoC < produtoB){produtoEscolhido = "C";}
        else{
            if(produtoA == produtoB){produtoEscolhido = "A e B";}
            else if(produtoA == produtoC){produtoEscolhido = "A e C";}
            else if(produtoC == produtoB){produtoEscolhido = "B e C";}
        }



        System.out.println("Os preços dos produtos são os seguintes:");
        System.out.println("Produto A: R$ " + produtoA);
        System.out.println("Produto B: R$ " + produtoB);
        System.out.println("Produto C: R$ " + produtoC);

        if(produtoA == produtoB || produtoA == produtoC || produtoC == produtoB){
            System.out.println("\nOs produtos mais em conta são os " + produtoEscolhido);
        }else{
        System.out.println("\nO produto mais em conta é o " + produtoEscolhido);
        }



    }
}
