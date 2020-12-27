import java.util.Scanner;

public class Pratikum1Nomor3 {
   
    public static void main(String[] args) {
     Scanner scan = new Scanner (System.in);
       
    int H, B, A; 

     H = scan.nextInt();
     A = scan.nextInt();
     B = scan.nextInt();
     
     scan.close();

     double C, panjangKapal;


    C = Math.tan(Math.toRadians(B)) * (double)H;
    panjangKapal =( Math.tan(Math.toRadians(A))*(double)H )- C;
    System.out.printf("%.1f",panjangKapal);
     System.out.print("m");



       
    }
}