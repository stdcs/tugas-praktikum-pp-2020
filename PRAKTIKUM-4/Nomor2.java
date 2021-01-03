import java.util.Scanner;
public class Nomor2 {
    public static void main(String[] args) {
        int i, j, k;
        Scanner nardi = new Scanner(System.in);
        System.out.print("Masukan Nilai Variable i : ");
        i = nardi.nextInt();
        System.out.print("Masukan Nilai Variable j : ");
        j = nardi.nextInt();
        System.out.print("Masukan Nilai Variable k : ");
        k = nardi.nextInt();

        // Input User : 3 , 2, 4
        int[][] matrixPertama = new int[i][j];
        // Mengisi Array A
        for (int a = 0; a < i; a++) {
            for (int b = 0; b < j; b++) {
                System.out.print("Isi Array [" + a + "][" + b + "] : ");
                matrixPertama[a][b] = nardi.nextInt();
            }
        }

        // Mengisi Array B
        int[][] matrixKedua = new int[j][k];
        for (int a = 0; a < j; a++) {
            for (int b = 0; b < k; b++) {
                System.out.print("Isi Array [" + a + "][" + b + "] : ");
                matrixKedua[a][b] = nardi.nextInt();
            }
        }

        // Hitung Operasi Matrix
        int[][] resultMatrix = new int[i][k];
        for (int a = 0; a < i; a++) {
            for (int b = 0; b < k; b++) {
                for (int s = 0; s < j; s++) {
                    resultMatrix[a][b] += matrixPertama[a][s] * matrixKedua[s][b];
                }
            }
        }

        // Cetak Hasil
        for (int[] row : resultMatrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
    

