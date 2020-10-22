import java.util.Scanner;
public class Praktikum1Nomor3 {
    public static void main(String[] args) {
            Scanner data = new Scanner(System.in);
            int H = data.nextInt();
            int A = data.nextInt();
            int B = data.nextInt();

            double tana = Math.tan(Math.toRadians(A)) * H;
            double tanb = Math.tan(Math.toRadians(B)) * H;
            double panjangKapal = tana-tanb;	
	
            System.out.printf("Panjang Kapal = %.1f m\n", panjangKapal);
    }
} 
