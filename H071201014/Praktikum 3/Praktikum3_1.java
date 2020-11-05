import java.util.Scanner;

class Praktikum3_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input nilai awal : ");
		int x = input.nextInt();
		System.out.print("Input nilai akhir : ");
		int y = input.nextInt();
		int i;
		for (i = x; i <= y ; i++) {
			if (x < 0) {
				if (x % 2 == 0) {
					System.out.println(x + " Genap negatif");
				} else {
					System.out.println(x + " Ganjil negatif");
				}
			}
			if (x > 0) {
				if (x % 2 == 0) {
					System.out.println(x + " Genap positif");
				} else {
					System.out.println(x + " Ganjil positif");
				}
			}
			if (x == 0) {
				System.out.println(x + " Nol");
			}
			x++;
		}
	}
}