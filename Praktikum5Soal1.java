import java.util.Scanner;
public class Praktikum5Soal1 {
   public static void main(String[] args) {
       Scanner answer = new Scanner(System.in);
       System.out.println("Inputan Angka Pertama dan Kedua :");
       int a = answer.nextInt();
       int b = answer.nextInt();
       int c = cariFPB(a, b);
       System.out.println("FPB dari " + a + " dan " + b + " adalah " + c);
   } 
   static int cariFPB(int a, int b){
       int fpb = 0;
       for (int i = 1; i <= a && i <= b; i++){
           if (a % i == 0 && b % i == 0)
               fpb = i;
           }
           return fpb; 
   }
}
