import java.util.Scanner;
public class Praktikum1Soal2 {
static Scanner answer = new Scanner(System.in);
public static void main(String[] args) {
    System.out.println("jumlah detik");
    int a = answer.nextInt();
    int jam = a / 3600;
    int menit = a / 60 % 60;
    int detik = a % 60;

    System.out.printf("%02d:%02d:%02d", jam, menit, detik);

    }
}
