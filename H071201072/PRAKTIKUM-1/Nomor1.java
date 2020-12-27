import java.util.Scanner;

public class Nomor1{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int waktu = input.nextInt();
        int jarak = input.nextInt();
        int kecepatan;
        kecepatan = jarak*waktu;

        double penggunaan = kecepatan/14.0;

        System.out.printf("Bensin yang digunakan : %.3f L ",penggunaan);
    
        


    }
}