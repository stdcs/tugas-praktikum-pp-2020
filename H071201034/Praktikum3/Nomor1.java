import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        for (int i = (x > y) ? y : x; i <= ((x > y) ? x : y); i++) {
            System.out.print(i);

            if (i % 2 == 0 && i != 0) {
                System.out.print(" genap ");
            } else if (i != 0) {
                System.out.print(" ganjil ");
            }

            if (i == 0) {
                System.out.println(" nol");
            } else if (i > 0) {
                System.out.println("positive");
            } else {
                System.out.println("negatif");
            }

        }

    }
}
