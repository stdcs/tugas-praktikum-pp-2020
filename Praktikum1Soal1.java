import java.util.Scanner; 
public class Praktikum1Soal1 {
    static Scanner answer = new Scanner(System.in);
public static void main(String[] args) {
    System.out.println("jam");
    int a = answer.nextInt();
    System.out.println("km/jam");
    int b = answer.nextInt();
    float bensin = (float) b / 14 * a;
    System.out.printf("%.3f", bensin);



}        
      } 
