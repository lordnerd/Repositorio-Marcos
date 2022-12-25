import java.util.Scanner;

public class salario {
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);

        String funcionario;
        int idade;
        double salario, novo_Sal;

        System.out.println("Digite seu nome: ");
        funcionario = leia.next();

        System.out.println("Digite sua idade: ");
        idade = leia.nextInt();

        System.out.println("Digite seu salário: ");
        salario = leia.nextDouble();

        if(salario<=1100){
            System.out.println("Você é o funcionário " + funcionario + "  e sua idade é " + idade + ".");
            novo_Sal = salario * 1.2;
            System.out.println("  Parabéns! Você recebeu um aumento de 20%. Seu novo salário é de " + novo_Sal);
        }else{
            if(salario>1100){
                System.out.println("Você é o funcionário " + funcionario + "  e sua idade é " + idade + ".");
                novo_Sal = salario * 1.1;
                System.out.println(" Você recebeu um aumento de 10%. Seu novo salário é de " + novo_Sal);

            }
        }


    }
}
