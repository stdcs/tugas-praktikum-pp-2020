import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan 2 Nilai Integer");
        int a = input.nextInt();
        int b = input.nextInt();

        int fpb = 0;
        for (int i = 1; i <= a && i <= b; i++) {

            if (a % i == 0 && b % i == 0)
                fpb = i;
        }
        System.out.print("FPB dari " + a + " dan " + b + " = " + fpb);
    }
}