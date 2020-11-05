import java.util.Scanner;

public class Nomor4 {

        public static void main(String[] args) {
            Scanner empat = new Scanner(System.in);
            int harga_barang = empat.nextInt();
            int nilai_uang = empat.nextInt();
            int kembalian = harga_barang - nilai_uang;
            int rp100k = 0;
            int rp50k = 0;
            int rp20k = 0;
            int rp10k = 0;
            int rp5k = 0;
            int rp2k = 0;
            int rp1k = 0; 

            while (kembalian > 0) {
                if (kembalian >= 100000) {
                    kembalian -= 100000;
                    rp100k++;
                } else if (kembalian >= 50000) {
                    kembalian -= 50000;
                    rp50k++;
                } else if (kembalian >= 20000) {
                    kembalian -= 20000;
                    rp20k++;
                } else if (kembalian >= 10000) {
                    kembalian -= 10000;
                    rp10k++;
                } else if (kembalian >= 5000) {
                    kembalian -= 5000;
                    rp5k++;
                } else if (kembalian >= 2000) {
                    kembalian -= 2000;
                    rp2k++;
                } else {
                    kembalian -= 1000;
                    rp1k++;
                }
            }
        System.out.println(rp100k+ " uang Rp. 100.000");
        System.out.println(rp50k+ " uang Rp. 50.000");
        System.out.println(rp20k+ " uang Rp. 20.000");
        System.out.println(rp10k+ " uang Rp. 10.000");
        System.out.println(rp5k+ " uang Rp. 5.000");
        System.out.println(rp2k+ " uang Rp. 2.000");
        System.out.println(rp1k+ " uang Rp. 1.000");
        }
    }
    