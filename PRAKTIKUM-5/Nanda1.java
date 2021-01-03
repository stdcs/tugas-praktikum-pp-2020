//PRAKTIKUM-5
import java.util.Scanner;

public class Nanda1 {
    public static void main(String[] args) {
        Scanner nardi = new Scanner(System.in);
        int x = nardi.nextInt();
        int y = nardi.nextInt();
        System.out.println(FPB(x, y));
    }

    static int FPB(int x, int y) {
        int nilai = 0;
        int maksimum = Math.max(x, y);
        int z;
        z = maksimum;
        while (z > 0) {
            z--;
            if (x % z == 0 && y % z == 0) {
                nilai += z;

                break;
            }
        }
        return nilai;
    }
}