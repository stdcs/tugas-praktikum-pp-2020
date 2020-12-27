import java.util.Scanner;
import java.util.Random;
public class Praktikum5Soal2 {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        int n = answer.nextInt();
        int m = answer.nextInt();
        String serialNumber = generateSerial(n, m);
        System.out.println(serialNumber);
    }
    public static String generateSerial (int n, int m) {
        String str = "";
        Random acak = new Random();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                str += acak.nextInt(10);
            }
            str += (i < n - 1) ? "-" : "\n";
        }
        return str;
        }
}
