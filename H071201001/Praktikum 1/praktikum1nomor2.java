import java.util.Scanner;
public class praktikum1nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("==== Program Konversi oleh Ahmad Fauzan Mansur ====\n" + "Masukkan jumlah detik yang akan dikonversi!");
        int seconds = input.nextInt();

        int hours = seconds/3600;
        int minutes = (seconds%3600)/60;
        int sec = (seconds%3600)%60;

        System.out.printf("%02d:%02d:%02d", hours, minutes, sec);
    }
}
