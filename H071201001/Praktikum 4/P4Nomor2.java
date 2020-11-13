
import java.util.Scanner; 

class P4Nomor2 {
	public static void main(String[] args) {
			Scanner obj = new Scanner(System.in);

			int x = obj.nextInt();
			int y = obj.nextInt();
			int z = obj.nextInt();

			int[][] matriksA = new int[x][y];
			int[][] matriksB = new int[y][z];
			int[][] matriksHasil = new int[x][z];

			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					matriksA[i][j] = obj.nextInt();
				}
			}

			for (int i = 0; i < y; i++) {
				for (int j = 0; j < z; j++) {
					matriksB[i][j] = obj.nextInt();
				}
			}
			
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < z; j++) {
					for (int k = 0; k < y; k++) {
						matriksHasil[i][j] += matriksA[i][k] * matriksB[k][j];
					}
					System.out.print(matriksHasil[i][j] + " ");
				}
				System.out.println();
			}	
			/*for (int i = 0; i < x; i++) {
				for (int j = 0; j < z; j++) {
					System.out.print(matriksHasil[i][j] + " ");
				}
			System.out.println();
			}	*/
	}
}