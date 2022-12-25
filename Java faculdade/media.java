import java.util.Scanner;

public class media{
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);

        float n1,n2,n3,media,nr1,novo_exam;

        System.out.println("Digite a primeira nota");
        n1 = leia.nextFloat();
        
        System.out.println("Digite a segunda nota");
        n2 = leia.nextFloat();

        
        System.out.println("Digite a terceira nota");
        n3 = leia.nextFloat();

        media = (n1+n2+n3)/3;

        System.out.println("Sua média foi "+ media);

        if(media>=7){
            System.out.println("Parábens! Você foi aprovado. Sua média foi "+ media);
        }else{
            System.out.println("Você foi para recuperação. Sua média foi " + media + "." + " Você terá que realizar um novo exame");
        
        if(media<7){
            System.out.println("Digite a nota da recuperação ");
            nr1 = leia.nextFloat();
            novo_exam = (nr1 + media)/2;
        
        if(novo_exam>=5){
             System.out.println("Você passou da recuperação! Sua nota foi de " + novo_exam);
        }else{
            System.out.println("Você foi reprovado! Sua nota foi de " + novo_exam);
            }
        }
      }
    }  
} 