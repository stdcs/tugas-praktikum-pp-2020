import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        for(int bil = 1; bil <= y; bil++) {
            if(bil % x == 0){
                System.out.println(bil + " ");
            }else{
                System.out.print(bil + " ");
            }
        }
    }
}
