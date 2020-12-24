import java.util.Scanner;
public class Praktikum1Soal3 {
    static Scanner answer = new Scanner(System.in);
public static void main(String[] args) {
    System.out.println("h");
    int h = answer.nextInt();
    System.out.println("a");
    int a = answer.nextInt();
    System.out.println("b");
    int b = answer.nextInt();
    double kesatu = Math.tan(Math.toRadians(a))*h;
    double kedua = Math.tan(Math.toRadians(b))*h;
    double panjang = kesatu - kedua;
    System.out.printf("%.1fm", panjang);
    }
}