import java.util.Scanner;

public class Mensagem{
    public static void main(String[] args) {
        System.out.println("Fatec Pompeia");
        int idade = 19;

        System.out.println("A minha idade é de " + idade +" anos");

        double Media = 7.546;
        System.out.printf("Média = %.2f",Media + "\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor inteiro:");

        int inteiro = input.nextInt();

        System.out.println("Este foi o valor inserido: " + inteiro + ".");

    }
}