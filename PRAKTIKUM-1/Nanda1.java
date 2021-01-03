//praktikum-1
import java.util.Scanner;

class Nanda1 {
    public static void main(String[] args) {
        Scanner nardi = new Scanner(System.in);
        int waktu = nardi.nextInt();
        int volume = nardi.nextInt();
        int efesiensi = nardi.nextInt();
        float a = ((float) waktu * volume / (float) efesiensi);
        System.out.printf("bensin yang digunakan = %.3f", a);
        System.out.print(" L");

    }
}