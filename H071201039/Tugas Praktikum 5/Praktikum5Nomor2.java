import java.util.Scanner;
import java.util.Random;

class Praktikum5Nomor2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		int q = scanner.nextInt();
		int r = scanner.nextInt();
		String serialNumber = generateSerial(q,r);
		System.out.println(serialNumber);	
	}

	public static String generateSerial(int q, int r) {
		Random rnd = new Random();
		StringBuilder strBuild = new StringBuilder();
		int[][] numbers = new int[q][r];

		for (int i = 0; i < q; i++) {
			for (int j = 0; j < r; j++) {
				numbers[i][j] = rnd.nextInt(9);
			}
		}

		for (int i = 0; i < q; i++) {
			for (int j = 0; j <= r; j++) {
				if (j < r) {
					strBuild = strBuild.append(numbers[i][j]);
				} else if (j == r) {
					strBuild = strBuild.append(i == q - 1 ? "" : "-");
				}
			}
		}
		String str = strBuild.toString();
		return str;
	}
}