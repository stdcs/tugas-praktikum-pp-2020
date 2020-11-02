import java.util.Scanner;
public class Nomor4 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int harga = input.nextInt();
    int uang = input.nextInt();
    input.close();
        if(harga < uang) {
            while (harga > 0) {
                int kembalian = uang - harga;
                int kembalian_100 = kembalian / 100000;
                kembalian = kembalian % 100000;
                int kembalian_50 = kembalian / 50000;
                kembalian = kembalian % 50000;
                int kembalian_20 = kembalian / 20000;
                kembalian = kembalian % 20000;
                int kembalian_10 = kembalian / 10000;
                kembalian = kembalian % 10000;
                int kembalian_5 = kembalian / 5000;
                kembalian = kembalian % 5000;
                int kembalian_2 = kembalian / 2000;
                kembalian = kembalian % 2000;
                int kembalian_1 = kembalian / 1000;
                System.out.println(kembalian_100+" Uang Rp. 100.000");
                System.out.println(kembalian_50+" Uang Rp. 50.000");
                System.out.println(kembalian_20+" Uang Rp. 20.000");
                System.out.println(kembalian_10+" Uang Rp. 10.000");
                System.out.println(kembalian_5+" Uang Rp. 5.000");
                System.out.println(kembalian_2+" Uang Rp. 2.000");
                System.out.println(kembalian_1+" Uang Rp. 1.000");
                break;
            }
        }else {
            System.out.println("== HARGA > UANG ==");
        }
    }
}
