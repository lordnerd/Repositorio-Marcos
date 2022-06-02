public class repitamenu{
    public static void main(String[] args) {

        int contador = 1;

        System.out.println("Cadastro clientes");

        while(contador < 2){
            System.out.println("1-Incluir");
            System.out.println("2-Alterar");
            System.out.println("3-Consultar");
            System.out.println("4-Excluir");
            System.out.println("5-Sair");

            contador = contador+1;
        }
        
    }
}