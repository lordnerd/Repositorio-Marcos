import java.util.Scanner;

public class Mediakml {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in); 

        float km;
        float litro;
        

        System.out.println("Digite  a qauntidade de km rodados");
        km = leia.nextFloat();
        System.out.println("Digite  a qauntidade de litros de combustível");
        litro = leia.nextFloat();
        
        float consumo = km/litro;

        if(consumo<8){
            System.out.println("Você precisa trocar seu carro por um mais econômico. Ele consome " +
            consumo + " km/l");
        }else{
            System.out.println("Seu carro é econômico. Ele consome " + consumo + "km/l");
        }

        
    }
}
