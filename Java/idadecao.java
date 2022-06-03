import java.util.Scanner;

public class idadecao{
    public static void main(String[] args) {
        System.out.println("Digite a idade do seu cãozinho: ");

        Scanner leia = new Scanner(System.in);

        int idade_cao = leia.nextInt();
        idade_cao = idade_cao * 7;

        System.out.println("Seu cãozinho tem " + idade_cao + " anos.");
    }
}