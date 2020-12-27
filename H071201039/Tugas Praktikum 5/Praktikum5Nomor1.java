
import java.util.Scanner;

class Praktikum5Nomor1 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int x = obj.nextInt();
		int y = obj.nextInt();
		int gcd = cariFPB(x, y);
		System.out.printf("FPB dari %d dan %d adalah %d", x, y, gcd);
	}

	static int cariFPB(int x, int y) {
		int fpb = 0;
		for (int i = 1; i <= x && i <= y; i++) {
			if (x % i == 0 && y % i == 0) 
				fpb = i;
		}
		return fpb;
	}
}