import java.util.Scanner;

import java.util.Random;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int m = obj.nextInt();
        String serialNumber = generateSerial(n, m);
        System.out.println(serialNumber);
    }

    public static String generateSerial(int n, int m) {
        Random input = new Random();
        String adj = " ";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                adj += input.nextInt(10);
            }
            if (i < n - 1)
                adj += '-';
        }
        return adj;
    }
}
