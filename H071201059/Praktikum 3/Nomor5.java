import java.util.Scanner;

public class Nomor5 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        float angle;
        int jam = 6;
        while (input.hasNext()) {
            if(input.hasNextFloat()) {
                angle = input.nextFloat();
                if(angle >= 0 && angle < 360) {
                    float totalDetik= Math.round( angle/(float)(0.25/60.0));
                    if (angle >= 0 && angle < 90) {
                        System.out.println("Selamat Pagi");
                    } else if (angle >= 90 && angle < 180) {
                        System.out.println("Selamat Siang");
                    } else if (angle >= 180 && angle < 270) {
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
        input.close(); 
         
    }
}
