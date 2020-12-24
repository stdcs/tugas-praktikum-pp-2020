import java.util.Scanner;
public class Soal5 {
    public static void main(String[] args) {
        Scanner answer = new Scanner (System.in);
        float x;
        int jam = 6;
        System.out.println("Cetak Nilai x :");
        while (answer.hasNext()) {
        if(answer.hasNextFloat()) {
            x = answer.nextFloat();
            if(x >= 0 && x < 360) {
                float totalDetik= Math.round(x/(float)(0.25/60.0));
                if (x >= 0 && x < 90) {
                    System.out.println("Selamat Pagi");
                } else if (x >= 90 && x < 180) {
                    System.out.println("Selamat Siang");
                } else if (x >= 180 && x < 270) {
                    System.out.println("Selamat Sore");
                } else {
                    System.out.println("Selamat Malam");
                }                     
                jam = jam + (int)(totalDetik / 3600);
                int menit = (int)(totalDetik % 3600) / 60;
                int detik = (int)(totalDetik % 3600) % 60;
                System.out.printf("%02d:%02d:%02d",jam, menit, detik);
                jam = 6;
                }
            } else {
                System.out.println("End Of Loop");
            break;
            }  
        }
        answer.close(); 
    } 
}
