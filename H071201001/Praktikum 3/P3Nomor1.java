import java.util.Scanner;
	
public class P3Nomor1 {
		public static void main(String[] args) {
			Scanner asd = new Scanner(System.in);
			System.out.println("Masukkan dua angka!");
			int x = asd.nextInt(); // Angka Pertama
			int y = asd.nextInt(); // Angka Kedua

			for (int i = (x < y ? x : y); i <= (x < y ? y : x); i++) {
				String bilangan = i == 0 ? "nol" : (i % 2 == 0 ? "Genap" : "Ganjil");
				String sifat = i == 0 ? "" : (i > 0 ? "Positif" : "Negatif");
				System.out.printf("%d %s %s\n", i, bilangan, sifat);
			}
	}
}