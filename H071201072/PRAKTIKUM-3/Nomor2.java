import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner dua = new Scanner(System.in); 
        int x = dua.nextInt();
        int y = dua.nextInt();
        int z = 1;

        for (int i = 1; i <= y; i++){
            for (int j = 1; j <=x; j++) {
                if (z<=100)
                System.out.print(z + " ");
                z++;
            }  System.out.println();
        }dua.close();
    } 
}
