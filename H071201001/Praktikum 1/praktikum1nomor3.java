import java.util.Scanner;
public class praktikum1nomor3 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int H = data.nextInt();
        int A = data.nextInt();
        int B = data.nextInt();

        double tanA = Math.Tan(Math.toRadians(A))*H;
        double tanB = math.Tan(math.toRadians(B))*H;
        
        double panjangKapal = tanA-tanB;
        System.out.printf("Panjang Kapal = %.1f m\n", panjangKapal);
    }
} 
