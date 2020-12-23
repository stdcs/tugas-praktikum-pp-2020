import java.util.Scanner;

public class Praktikum3Nomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, a = 0, b = 1;
        n = input.nextInt();

        // System.out.print(a + " " + b);

        // for (int x = 2; x < n; x++) {
        //     next = a + b;
        //     System.out.print(" " + next);
        //     a = b;
        //     b = next;
        // }
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            a += b;
            b = a - b;
        }
    }
}