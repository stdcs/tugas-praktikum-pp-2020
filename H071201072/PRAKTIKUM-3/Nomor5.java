import java.util.Scanner;

public class Nomor5 {

    public static void main(String[] args) {
        Scanner lima = new Scanner(System.in);
        float M = lima.nextInt();
        
        if ((M >= 360) | (M <= 0)) {
            System.out.println("Data yang anda masukkan tidak sesuai");   
           } else {
   
           int InputDetik = (int) (M/360*86400);
           InputDetik = InputDetik + 21600;
   
           if (InputDetik >= 86400) {
               InputDetik -= 86400; }
   
           int jam = InputDetik/3600;
           int menit = (InputDetik%3600)/60;
           int detik = InputDetik%60;
           
           if (10 > jam && jam >= 4) {
               System.out.println("Selamat pagi");
           } else if (14 > jam && jam >= 10) {
               System.out.println("Selamat siang");
           } else if (18 > jam && jam >= 14) {
               System.out.println("Selamat siang");
           } else System.out.println("Selamat malam");
           System.out.printf("%02d : %02d : %02d",jam,menit,detik);
   
           }
       }
   }