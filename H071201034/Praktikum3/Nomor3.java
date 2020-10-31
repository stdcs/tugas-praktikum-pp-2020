import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, a = 0, b = 1;
        n = input.nextInt();

        for (int count = 0; count < n; count++) {
            System.out.print(" " + a);
            a += b;
            b = a - b;
        }
    }
}
