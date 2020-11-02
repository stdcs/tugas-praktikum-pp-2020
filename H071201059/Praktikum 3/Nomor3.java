import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      long a = 0;
      long b = 1;
      for(int i = 0; i < n; i++){
        System.out.print(a + " ");
        a += b;
        b = a - b;
      }
    }
}
