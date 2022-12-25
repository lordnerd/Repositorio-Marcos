import java.util.Scanner;

public class operacoes {
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);

       float a,b,operacao;
       String c;

       System.out.println("Digite o primeiro número");
       a = leia.nextFloat();

       System.out.println("Digite o segundo número");
       b = leia.nextFloat();

       System.out.println("Digite a operação");
       c = leia.next();

       switch(c){
           case "+" : System.out.println("Você selecionou a adição");
           operacao = a + b;
           System.out.println("O resultado da operação foi " + operacao);
           break;

           case "-" : System.out.println("Você selecionou a subtração");
           operacao = a - b;
           System.out.println("O resultado da operação foi " + operacao);
           break;

           case "*" : System.out.println("Você selecionou a multiplicação");
           operacao = a * b;
           System.out.println("O resultado da operação foi " + operacao);
           break;

           case "/" : System.out.println("Você selecionou a divisão");
           operacao = a / b;
           System.out.println("O resultado da operação foi " + operacao);
           break;

           default : System.out.println("Digite uma operação válida");
           break;
         }

    }
}
