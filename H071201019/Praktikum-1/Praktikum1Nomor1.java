import java.util.Scanner;
public class Praktikum1Nomor1 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.print("Waktu Yang Ditempuh : ");
        int waktu = y.nextInt();
        System.out.print("Jarak Yang Ditempuh : ");
        int jarak = y.nextInt();

        float bensin = (waktu * jarak) / 14f;

        System.out.println("_______________________");
        System.out.println("bensin Yang Digunakan : " + String.format("%.3f", bensin) + "L");
        System.out.println("_______________________");

    }
    
}

