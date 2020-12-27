import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("FPB dari "+a+" dan "+b+" = "+cariFpb(a, b));
        input.close();
    }
    public static int cariFpb(int a, int b) {
        if (b == 0) return a;
        return cariFpb(b, a % b);
    }
}