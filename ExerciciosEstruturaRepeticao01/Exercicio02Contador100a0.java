package ExerciciosEstruturaRepeticao01;
//Contador decremental de 100 a 1
public class Exercicio02Contador100a0 {
    public static void main(String[] agrs){
        System.out.println("Exibindo números de 100 a 1");

        //Setando variável
        int cont = 100;

        do{
            System.out.println("> " + cont);
            cont--;
        }while (cont >= 1);
    }
}
