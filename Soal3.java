import java.util.Scanner;
public class Soal3 {
    public static void main(String[] args) {
        Scanner answer = new Scanner (System.in);
        System.out.println("Elemen ke n : ");
        int n = answer.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 0; i < n; i++){
            System.out.print(a + " ");
            a += b;
            b = a - b;
        }
    }
}
