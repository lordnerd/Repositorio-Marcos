package edu.marcos.primeirasemana;

public class BoletimEstudantil {
    public static void main(String[] args) {
       
        int mediaFinal = 4;
        
            if(mediaFinal<6){
                System.out.println("REPROVADO!");
            }else if(mediaFinal == 6){
                System.out.println("Recuperação");
            }else{
                System.out.println("Aprovado");
            } 
    }

}
