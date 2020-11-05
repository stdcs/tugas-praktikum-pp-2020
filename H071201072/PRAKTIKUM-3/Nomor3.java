import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        Scanner tiga = new Scanner(System.in);
        int n = tiga.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        System.out.print(a+ " ");
        System.out.print(b);

        while (count<n){
            int next = a+b;
            System.out.print(" "+next);
            a=b;
            b=next;
            count++;
        } 
    }
}
    
