package ExerciciosEstruturaRepeticao02;
//Programa que faz contagem de 0 a 100 duas vezes, uma com for e outra com while
public class Exercicio01ForWhile {
    public static void main(String[] args){
        int contador;

        System.out.println("Contando até 100 com for!");
        System.out.println("-------------------------");
        //loop com for
        for(contador = 0;contador <= 100; contador++){
            System.out.println("> " + contador);
        }

        //setando o contador
        contador = 0;

        System.out.println("\nContando até 100 com while!");
        System.out.println("-------------------------");
        //loop com while
        while (contador <= 100){
            System.out.println("> " + contador);
            contador++;
        }
    }
}
