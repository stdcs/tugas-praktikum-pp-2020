import java.util.Scanner;
public class praktikum1nomor3 {
    public static void main(String[] args) {
        int H,A,B;
        do
        {
            Scanner data = new Scanner(System.in);
            System.out.print("Tinggi Menara (h) = ");
            H = data.nextInt();
            System.out.print("Sudut ke bagian belakang kapal (a) = ");
            A = data.nextInt();
            System.out.print("Sudut ke bagian depan kapal (b) = ");
            B = data.nextInt();
                if (B>90 || B>A)
                {
                    System.out.println("\nInput TIDAK valid! Mohon masukkan ulang nilai sesuai interval: (90>a>b)\n");
                }
        } 
        while(B>90 || B>A);

        double sina = Math.sin(Math.toRadians(A));
        double sinadiv = Math.sin(Math.toRadians(180-90+A));
        double sinb = Math.sin(Math.toRadians(B));
        double sinbdiv = Math.sin(Math.toRadians(180-90+B));

        double front = (sinb*H)/sinbdiv;
        double back = (sina*H)/sinadiv;
        double panjang = back-front;
        System.out.printf("Panjang Kapal = %.1f m\n", panjang);
    }
} 