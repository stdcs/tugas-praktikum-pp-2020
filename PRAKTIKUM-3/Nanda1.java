//PRAKTIKUM-3
import java.util.Scanner;

public class Nanda1 {
    public static void main(String[] args) {
        Scanner nardi = new Scanner(System.in);
        int X = nardi.nextInt();
        int Y = nardi.nextInt();
        if (X < Y) {
            for (; X <= Y; X++) {
                System.out.print(X);
                if (X % 2 == 0)
                    System.out.print(" GENAP ");
                else
                    System.out.print(" GANJIL ");
                if (X < 0)
                    System.out.println(" NEGATIF ");
                else
                    System.out.println(" POSITIF ");
            }
        } else {
            for (; X >= Y; X--) {
                System.out.print(X);
                if (X % 2 == 0)
                    System.out.print(" GENAP ");
                else
                    System.out.print(" GANJIL ");
                if (X < 0)
                    System.out.println(" NEGATIF ");
                else
                    System.out.println(" POSITIF ");
            }
        }
    }

}