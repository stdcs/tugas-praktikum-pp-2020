import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Input Integer p, q, r : ");
        int p = input.nextInt();
        int q = input.nextInt();
        int r = input.nextInt();

        int[][] matriksA = new int[p][q];
        int[][] matriksB = new int[q][r];
        int[][] matriksC = new int[p][r];
        int sum = 0;
        for (int i = 0; i < matriksA.length; i++) {
            for (int j = 0; j < matriksA[i].length; j++) {
                matriksA[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < matriksB.length; i++) {
            for (int j = 0; j < matriksB[i].length; j++) {
                matriksB[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < q; k++) {
                    sum = sum + matriksA[i][k] * matriksB[k][j];
                }
                matriksC[i][j] = sum;
                sum = 0;
                System.out.print(matriksC[i][j] + " ");
            }
            System.out.println();
        }
    }
}
