//PRAKTIKUM-3
import java.util.Scanner;

public class Nanda2 {
    public static void main(String[] args) {
        Scanner nardi = new Scanner(System.in);
        int X = nardi.nextInt();
        int Y = nardi.nextInt();
        int Z = 0;
        int i;
        for (i = 1; i <= Y; i++) {
            if (i == 1) {
                System.out.print(i);
            } else if (Z == X) {
                System.out.printf("\n" + i);
                Z = 0;
            } else {
                System.out.printf(" " + i);
            }
            Z++;
        }
    }

}