import java.util.Scanner;

class Praktikum2_1 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		try {
			System.out.print("Input bilangan pertama : ");
			int a = obj.nextInt();
			System.out.print("Input bilangan kedua : ");
			int b = obj.nextInt();
			System.out.print("Input bilangan ketiga : ");
			int c = obj.nextInt();
			System.out.print("Input bilangan keempat : ");
			int d = obj.nextInt();
			System.out.print("Input bilangan kelima : ");
			int e = obj.nextInt();
			int genap = 0;
			int ganjil = 0;
			int positif = 0;
			int negatif = 0;
			if (a <= 0) {
				if (a < 0) {
					negatif++;
				}
				if (a % 2 == 0) {
					genap++;
				} else {
					ganjil++;
				}
			} else {
				positif++;
				if (a % 2 == 0) {
					genap++;
				} else {
					ganjil++;
				}
			}
			if (b <= 0) {
				if (b < 0) {
					negatif++;
				}
				if (b % 2 == 0) {
					genap++;
				} else {
					ganjil++;
				}
			} else {
				positif++;
				if (b % 2 == 0) {
					genap++;
				} else {
					ganjil++;
				}
			}
			if (c <= 0) {
				if (c < 0) {
					negatif++;
				}
				if (c % 2 == 0) {
					genap++;
				} else {
					ganjil++;
				}
			} else {
				positif++;
				if (c % 2 == 0) {
					genap++;
				} else {
					ganjil++;
				}
			}
			if (d <= 0) {
				if (d < 0) {
					negatif++;
				}
				if (d % 2 == 0) {
					genap++;
				} else {
					ganjil++;
				}
			} else {
				positif++;
				if (d % 2 == 0) {
					genap++;
				} else {
					ganjil++;
				}
			}
			if (e <= 0) {
				if (e < 0) {
					negatif++;
				}
				if (e % 2 == 0) {
					genap++;
				} else {
					ganjil++;
				}
			} else {
				positif++;
				if (e % 2 == 0) {
					genap++;
				} else {
					ganjil++;
				}
			}
			System.out.println(genap + " Angka Genap.");
			System.out.println(ganjil + " Angka Ganjil.");
			System.out.println(positif + " Angka Positif.");
			System.out.println(negatif + " Angka Negatif.");
		}
		catch (Exception er) 
        {
            System.out.println("Inputan Tidak Valid");
        }
	}
}