import java.lang.Math;

public class repitaram {
    public static void main(String[] args) {
        int i = 2;
        int i_elev = 1;

        while(i_elev<=10){
            System.out.println(Math.pow(i, i_elev) + "GB");
            i_elev = i_elev + 1;
        }
    }
}
