import java.util.Scanner;
public class Praktikum3Soal2 {
    public static void main(String[] args) {
        Scanner answer = new Scanner (System.in);
        System.out.println("Nilai X : ");
        int x = answer.nextInt();
        System.out.println("Nilai Y : ");
        int y = answer.nextInt();
        for (int i = 1; i <= y; i++){
            if(i % x == 0){
            System.out.println(i + " ");
        }else{
            System.out.print(i + " ");
        }
      }
    }
}
