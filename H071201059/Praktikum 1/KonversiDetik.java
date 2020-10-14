import java.util.Scanner;
public class KonversiDetik {
    public static void main(String[] args) {
        int totalDetik,jam,menit,detik;
        Scanner inputDetik = new Scanner(System.in);
        totalDetik = inputDetik.nextInt();
        jam = totalDetik / 3600;
        menit = (totalDetik % 3600) / 60;
        detik = (totalDetik % 3600) % 60;
        inputDetik.close();
        String konversiDetik = String.format("%02d:%02d:%02d",jam, menit, detik);
        System.out.println(konversiDetik);
        
    }
}
