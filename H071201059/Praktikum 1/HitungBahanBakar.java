import java.util.Scanner;

public class HitungBahanBakar {
    public static void main(String[] args) {
        int waktu,kecepatan;
        final int EFISIENSI_MOBIL = 14;
        float jumlahBensin;
        Scanner inputUser = new Scanner(System.in);
        waktu = inputUser.nextInt();
        kecepatan = inputUser.nextInt();
        inputUser.close(); 
        jumlahBensin = ( (float) waktu * kecepatan) / EFISIENSI_MOBIL;
        System.out.printf("%s%.3f%s", "Bensin yang digunakan : ", jumlahBensin, " L");
    }
     
}
