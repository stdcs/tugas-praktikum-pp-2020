import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Panjang N ");
        int n = input.nextInt();
        System.out.println("Masukkan Elemen Input Integer ");
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        System.out.println("Dua elemen yang saling relatif prima : ");
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (a[i] % a[j] != 0 && a[j] % a[i] != 0) {
                    System.out.println(a[i] + " " + a[j]);
                }
            }
        }
    }
}
