import java.util.Scanner;

public class Praktikum4Nomor2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i = scan.nextInt();
		int j = scan.nextInt();
		int k = scan.nextInt();

		int[][] matriksA = new int[i][j];
		int[][] matriksB = new int[j][k];
		int[][] matriksC = new int[i][k];

        	for(int qq = 1; qq<=2; qq++){
		    for(int x=0; x<(qq==1?i:j); x++){
		        for(int y=0;y<(qq==1?j:k);y++){
				if(qq==1)
			        	matriksA[x][y] = scan.nextInt();
				else
					matriksB[x][y] = scan.nextInt();
		        }
		    }
        	}
		for (int m = 0; m < i; m++){
			for (int n = 0; n < k; n++){
				for (int o = 0; o < j; o++){
					matriksC[m][n] += matriksA[m][o] * matriksB[o][n];
				}
				System.out.print(matriksC[m][n] + " ");
			}
			System.out.println();
		}

	}
}