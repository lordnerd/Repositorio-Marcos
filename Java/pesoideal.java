import java.util.Scanner;

public class pesoideal {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int id_Sexo;
        String sexo;
        double altura, id_Peso;

        System.out.println("Escreva sua altura");
        altura = leia.nextDouble();

        System.out.println("Digite seu sexo");
        id_Sexo = leia.nextInt();

        switch(id_Sexo){
            case 1 : sexo = "masculino";
            id_Peso = (72.7*altura)-58;
            System.out.println("Seu sexo é " + sexo + "." + " Seu peso ideal com acordo com seu sexo e altura é " + id_Peso);
            break;

            case 2: sexo = "feminino";
            id_Peso = (62.1*altura)-44.7;
            System.out.println("Seu sexo é " + sexo + "." + " Seu peso ideal com acordo com seu sexo e altura é " + id_Peso);
            break;

            default : System.out.println("Não foi possível calacular seu peso ideal");
            break;
        }
    }
        
    }

