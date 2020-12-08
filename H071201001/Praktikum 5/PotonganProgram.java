import java.util.Scanner;
import java.util.Random;

class PotonganProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		String serialNumber = generateSerial(n,m);
		System.out.println(serialNumber);	
	}

	public static String generateSerial(int n, int m) {
		String str = "";
		Random rnd = new Random();
		int[][] numbers = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				numbers[i][j] = rnd.nextInt(9);
				str += numbers[i][j];
			}
			str += (i == n-1) ? "" : "-";
		}
		return str;
	}
}