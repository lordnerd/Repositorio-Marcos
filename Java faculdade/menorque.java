import java.util.Scanner;

public class menorque {
    public static void main(String[]args){
        Scanner leia = new Scanner (System.in);

        float a,b,c;

        System.out.println("Digite o primeiro número");
        a = leia.nextFloat();

        
        System.out.println("Digite o segundo número");
        b = leia.nextFloat();

        
        System.out.println("Digite o terceiro número");
        c = leia.nextFloat();

        if((a<b) & (a<c)){
            System.out.println("O menor número é o primeiro: " + a);
        }else{
            if((b<a) & (b<c)){
                System.out.println("O menor número é o segundo: " + b);
            }else{
                if((c<a) & (c<b)){
                    System.out.println("O menor número é o terceiro: " + c);
                }else{
                    System.out.println("Todos os números são iguais");
                }
            }
        }
    }
}
