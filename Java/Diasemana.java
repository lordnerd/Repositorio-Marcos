import java.util.Scanner;

public class Diasemana {
    public static void main(String[]args){
        Scanner leia = new Scanner (System.in);

        int dia;
        String dia_nome;

        System.out.println("Digite o código do dia");
        dia = leia.nextInt();

    switch(dia){
        case 1 : dia_nome = "Segunda";
        System.out.println("Hoje é " + dia_nome);
        break;

        case 2: dia_nome = "Terça";
        System.out.println("Hoje é " + dia_nome);
        break;

        case 3: dia_nome = "Quarta";
        System.out.println("Hoje é " + dia_nome);
        break;

        case 4: dia_nome = "Quinta";
        System.out.println("Hoje é " + dia_nome);
        break;

        case 5: dia_nome = "Sexta";
        System.out.println("Hoje é " + dia_nome);
        break;

        case 6: dia_nome = "Sábado";
        System.out.println("Hoje é " + dia_nome);
        break;

        case 7: dia_nome = "Domingo";
        System.out.println("Hoje é " + dia_nome);
        break;

        default : System.out.println("Número inválido");
        break;
    }
    }
}
