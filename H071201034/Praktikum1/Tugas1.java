import java.util.Scanner;

class Tugas1 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Masukkan waktu yang ditempuh [enter] kecepatan rata-rata");
        int t = input.nextInt();
        int v = input.nextInt();
        
        double bensin = (v * t) / 14.0;

        System.out.printf("Jumlah bensin yang digunakan = %.3fL",bensin);

    }
}