import java.util.Scanner;

class Praktikum3_4 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int harga = input.nextInt();
    int uang = input.nextInt();
    input.close();
        if(harga < uang) {
            while (harga > 0) {
                int kembalian = uang - harga;
                int kembalian100 = kembalian / 100000;
                kembalian = kembalian % 100000;
                int kembalian50 = kembalian / 50000;
                kembalian = kembalian % 50000;
                int kembalian20 = kembalian / 20000;
                kembalian = kembalian % 20000;
                int kembalian10 = kembalian / 10000;
                kembalian = kembalian % 10000;
                int kembalian5 = kembalian / 5000;
                kembalian = kembalian % 5000;
                int kembalian2 = kembalian / 2000;
                kembalian = kembalian % 2000;
                int kembalian1 = kembalian / 1000;
                System.out.println(kembalian100+" Uang Rp. 100.000");
                System.out.println(kembalian50+" Uang Rp. 50.000");
                System.out.println(kembalian20+" Uang Rp. 20.000");
                System.out.println(kembalian10+" Uang Rp. 10.000");
                System.out.println(kembalian5+" Uang Rp. 5.000");
                System.out.println(kembalian2+" Uang Rp. 2.000");
                System.out.println(kembalian1+" Uang Rp. 1.000");
                break;
            }
        }else {
            System.out.println("Uang Kurang");
        }
    }
}
