import java.util.Scanner;
public class Praktikum3Soal4 {
    public static void main(String[] args) {
        Scanner answer = new Scanner (System.in);
        System.out.println("Harga Barang :");
        int a = answer.nextInt();
        System.out.println("Nilai Uang yang dibayarkan");
        int b = answer.nextInt();
        int kembalian = b - a;
        int seratusribu = 0;
        int limapuluhribu = 0;
        int duapuluhribu = 0;
        int sepuluhribu = 0;
        int limaribu = 0;
        int duaribu = 0;
        int seribu = 0;

        while (kembalian > 0){
        if (kembalian - 100000 >= 0){
            kembalian -= 100000;
            seratusribu++;
        }else if (kembalian - 50000 >= 0){
            kembalian -= 50000;
            limapuluhribu++;
        }else if (kembalian - 20000 >= 0){
            kembalian -= 20000;
            duapuluhribu++;
        }else if (kembalian - 10000 >= 0){
            kembalian -= 10000;
            sepuluhribu++;
        }else if (kembalian - 5000 >= 0){
            kembalian -= 5000;
            limaribu++;
        }else if (kembalian - 2000 >= 0){
            kembalian -= 2000;
            duaribu++;
        }else{
            kembalian -= 1000;
            seribu++;
        }
    }
        System.out.println(seratusribu   + " Uang Rp.100.000");
        System.out.println(limapuluhribu + " Uang Rp.50.000");
        System.out.println(duapuluhribu  + " Uang Rp.20.000");
        System.out.println(sepuluhribu   + " Uang Rp.10.000");
        System.out.println(limaribu  + " Uang Rp.5.000");
        System.out.println(duaribu   + " Uang Rp.2.000");
        System.out.println(seribu    + " Uang Rp.1.000");
    }
}
