import java.util.Scanner;
	
public class P3Nomor1 {
		public static void main(String[] args) {
			Scanner asd = new Scanner(System.in);
			int nilaiAwal = asd.nextInt();
			int nilaiAkhir = asd.nextInt();
			
			String bilangan = "";
			String sifat = "";

			for (int i = nilaiAwal; i <= nilaiAkhir; i++) {
				bilangan = i == 0 ? "nol" : (i % 2 == 0 ? "Genap" : "Ganjil");
				sifat = i == 0 ? "" : (i > 0 ? "Positif" : "Negatif");
				System.out.printf("%d %s %s\n", i, bilangan, sifat);
			}		

			for (int i = nilaiAkhir; i <= nilaiAwal; i++) {
				bilangan = i == 0 ? "nol" : (i % 2 == 0 ? "Genap" : "Ganjil");
				sifat = i == 0 ? "" : (i > 0 ? "Positif" : "Negatif");
				System.out.printf("%d %s %s\n", i, bilangan, sifat);
			}	
	}
}