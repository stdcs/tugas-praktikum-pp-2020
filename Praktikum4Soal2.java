import java.util.Scanner;
public class Praktikum4Soal2 {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        System.out.println("Ukuran Matriks A, B, C");
        int a = answer.nextInt();
        int b = answer.nextInt();
        int c = answer.nextInt();
        int[][] matriks1 = new int[a][b];
		int[][] matriks2 = new int[b][c];
        int[][] matriks = new int[a][c]; 
        int hasil = 0;
        for (int i = 0; i < matriks1.length; i++){
            for(int j = 0; j < matriks1[i].length; j++){
                matriks1[i][j] = answer.nextInt();
            }
        }
        for (int i = 0; i < matriks2.length; i++){
            for (int j = 0; j < matriks2[i].length; j++){
                matriks2[i][j] = answer.nextInt();
            }
        }
        for (int i = 0; i < a; i++){
            for (int j = 0; j < c; j++){
                for(int k = 0; k < b; k++){
                    hasil = hasil + matriks1[i][k] * matriks2[k][j];
                }
                matriks[i][j] = hasil;
                hasil = 0;
            }
        }
        for (int i = 0; i < a; i++){
            for (int j = 0; j < c; j++){
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
