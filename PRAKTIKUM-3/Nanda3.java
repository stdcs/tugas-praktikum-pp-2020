//PRAKTIKUM-3
import java.util.Scanner;

public class Nanda3 {
    public static void main(String[] args) {
        Scanner nardi = new Scanner(System.in);
        int A = nardi.nextInt();
        int B = 0;
        int C = 1;
        int next = 0;
        System.out.print(B);
        System.out.printf(" " + B);
        for (int i = 2; i < A; i++) {
            next = A + B;
            System.out.printf(" " + next);
            B = C;
            C = next;
        }
    }

}