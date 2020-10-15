import java.util.Scanner;
public class Praktikum1Nomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Ketinggian Menara");
        int h = input.nextInt();
        System.out.println("Masukkan Ujung Belakang Kapal");
        int a = input.nextInt();
        System.out.println("Masukkan Ujung Depan Kapal");
        int b = input.nextInt();
        double Ab;
        double Bc;

        Ab = Math.tan(Math.toRadians(a));
        Bc = Math.tan(Math.toRadians(b));

        double Pk;
        Pk = (Ab * h) - (Bc * h);

        System.out.printf("%.1f m", Pk);

    }
    
}
