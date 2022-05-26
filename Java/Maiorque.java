import java.util.Scanner;

public class Maiorque{
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        float a;
        float b;

        System.out.println("Digite o primeiro número");
        a = leia.nextFloat();
        System.out.println("Digite o segundo número");
        b = leia.nextFloat();

        if(a > b){
            System.out.println("O valor de A é maior que B. O maior valor é: "
            + a);
        }else{
            if(a < b){
                System.out.println("O valor de B é maior que A. O maior valor é: "
                + b); 
            }else{
                System.out.println("O valor de A e B são iguais.");
            }

        }
    

    }
}