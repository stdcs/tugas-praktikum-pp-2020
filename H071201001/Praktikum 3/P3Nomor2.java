import java.util.Scanner;
	
public class P3Nomor2 {
		public static void main(String[] args) {
			Scanner asd = new Scanner(System.in);
			int x = 0;
			int y = 0;
			do {
				x = asd.nextInt();
				y = asd.nextInt();
				if (x >= y) {
					System.out.println("Invalid input! first input must be smaller than second!");
				}
			} while (x >= y);

			for (int i = 0; i <= x; i++) {
				for (int j = 1; j <= y; j++) {
					System.out.printf("%d ", j);
				}
			System.out.println("");
			}

	}
}