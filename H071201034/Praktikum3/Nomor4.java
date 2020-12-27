import java.util.Scanner;

public class Nomor4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Harga Barang");
        int harga = input.nextInt();
        System.out.println("Masukkan Jumlah Uang");
        int uang = input.nextInt();

        int seratus = 0;
        int limapuluh = 0;
        int duapuluh = 0;
        int sepuluh = 0;
        int lima = 0;
        int dua = 0;
        int seribu = 0;
        int kembalian = uang - harga;

        while (kembalian > 0) {
            if (kembalian - 100000 >= 0) {
                kembalian -= 100000;
                seratus++;
            } else if (kembalian - 50000 >= 0) {
                kembalian -= 50000;
                limapuluh++;
            } else if (kembalian - 20000 >= 0) {
                kembalian -= 20000;
                duapuluh++;
            } else if (kembalian - 10000 >= 0) {
                kembalian -= 10000;
                sepuluh++;
            } else if (kembalian - 5000 >= 0) {
                kembalian -= 5000;
                lima++;
            } else if (kembalian - 2000 >= 0) {
                kembalian -= 2000;
                dua++;
            } else {
                kembalian -= 1000;
                if (kembalian == 0)
                    seribu++;
            }
        }

        System.out.println(seratus + " uang Rp. 100.000");
        System.out.println(limapuluh + " uang Rp. 50.000");
        System.out.println(duapuluh + " uang Rp. 20.000");
        System.out.println(sepuluh + " uang Rp. 10.000");
        System.out.println(lima + " uang Rp. 5.000");
        System.out.println(dua + " uang Rp. 2.000");
        System.out.println(seribu + " uang Rp. 1.000");
    }
}