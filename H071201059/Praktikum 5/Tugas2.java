import java.util.Scanner;
import java.util.Random;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        String serialNumber = generateSerial(n, m);
        System.out.println(serialNumber);
        input.close();

    }
    public static String generateSerial(int n, int m) {
        String strings = "";
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                strings += rand.nextInt(10);
            }
            strings += (i < n-1) ? "-" : "\n"; 
        }
        return strings;
    }
}
