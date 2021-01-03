//praktikum-1
import java.util.Scanner;
class Nanda3 {
   public static void main(String[] args) {
      Scanner nardi = new Scanner(System.in);
      int tinggi = nardi.nextInt();
      int sudutElevasiDepan = nardi.nextInt();
      int sudutElevasiBelakang = nardi.nextInt();
      //double BD,CD,BC;
      double BD =Math.tan(Math.toRadians(sudutElevasiDepan))*(double)tinggi;
      double CD =Math.tan(Math.toRadians(sudutElevasiBelakang))*(double)tinggi;
      double BC = BD - CD;
      System.out.printf("%.1f", BC);
      System.out.printf(" m");
      


       
   } 
}