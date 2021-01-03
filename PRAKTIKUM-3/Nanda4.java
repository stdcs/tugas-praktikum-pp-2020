//PRAKTIKUM-3
import java.util.Scanner;

public class Nanda4 {
    public static void main(String[] args) {
        Scanner nardi = new Scanner(System.in);
        int harga = nardi.nextInt();
        int Uang = nardi.nextInt();
        int sisa = Uang - harga;

        for (int i = 1; i <= 7; i++) {
            int countUang = 0;
            int jumlah = 0;
            String jenisUang = "";
            switch (i) {
                case 1:
                    jumlah= 100000;
                   jenisUang = "100.000";
                    break;
                case 2:
                    jumlah= 50000;
                   jenisUang = "50.000";
                    break;
                case 3:
                    jumlah= 20000;
                   jenisUang = "20.000";
                    break;
                case 4:
                    jumlah= 10000;
                   jenisUang = "10.000";
                    break;
                case 5:
                    jumlah= 5000;
                   jenisUang = "5.000";
                    break;
                case 6:
                    jumlah= 2000;
                   jenisUang = "2.000";
                    break;
                case 7:
                    jumlah= 1000;
                   jenisUang = "1.000";
                    break;
            }
            countUang = sisa / jumlah;
            sisa -= countUang * jumlah;
            System.out.println(countUang + " uang Rp. " +jenisUang);
        }

    }

}