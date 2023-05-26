package ExerciciosEstruturaRepeticao01;
//Contador incremental de 0 a 100
public class Exercicio01Contator0a100 {
    public static void main(String[] agrs){
        System.out.println("Exibindo números de 0 a 100");

        //Setando variável
        int cont = 1;

        do{
            System.out.println("> " + cont);
            cont++;
        }while (cont <= 100);
    }
}
