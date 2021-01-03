//PRAKTIKUM-3
import java.util.Scanner;

public class Nanda5 {
    public static void main(String[] args) {
        Scanner nardi = new Scanner(System.in);
        System.out.print("masukkan waktu : ");
        int A = 0;
        int B = 0;
        int C = 0;
        while (nardi.hasNextFloat()) {
            float jam = nardi.nextFloat();// j untuk jam
            // int HariKeDetik=86400;
            // int HariKeDerajat=360;
            if (jam >= 0 && jam < 360) {
                float D = jam * 240;
                int X = (int) D;

                A = (X / 3600);
                A = A + 6;
                if (A > 23) {
                    A = A - 24;
                } else {
                    A += 0;
                }
                B = (X % 3600);
                B = B / 60;

                C = (X % 3600);
                C = C % 60;
                System.out.printf("%02d: %02d: %02d \n", A, B, C);

                if (X > 0 && X <= 14400) {
                    System.out.println("SELAMAT PAGI");
                }
                if (X > 14400 && X <= 32400) {
                    System.out.println("SELAMAT SIANG");
                }
                if (X > 32400 && X <= 46800) {
                    System.out.println("SELAMAT SORE");
                }
                if (X > 46800 && X <= 86900) {
                    System.out.println("SELAMAT MALAM");

                }

                else {
                    System.out.println("TIDAK VALID");

                }
            }

        }
    }

}