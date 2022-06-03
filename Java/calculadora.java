import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double num1, num2, soma, subtracao, multi, divi;

        System.out.println("Digite o primeiro número");
        num1 = leia.nextDouble();

        System.out.println("Digite o segundo número");
        num2 = leia.nextDouble();

        soma = num1 + num2;
        System.out.println("O resultado da soma é: " + soma);

        subtracao = num1 - num2;
        System.out.println("O resultado da subtração é: " + subtracao);
        
        multi = num1 * num2;
        System.out.println("O resultado da multiplicação é: " + multi);

        divi = num1/num2;
        System.out.println("O resultado da divisão é: " + divi);

    }
}
