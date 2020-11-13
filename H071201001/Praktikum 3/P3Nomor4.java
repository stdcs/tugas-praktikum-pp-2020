import java.util.Scanner;
	
public class P3Nomor4 {
		public static void main(String[] args) {
			Scanner asd = new Scanner(System.in);
			System.out.println("Masukkan harga kemudian bayaran!");
			int hargaBarang = asd.nextInt();
			int bayar = asd.nextInt();
			int kembalian = bayar - hargaBarang; // estimasi kembalian

			// inisialisasi uang
			int seratusRibu = 0;
			int limaPuluhRibu = 0;
			int duaPuluhRibu = 0;
			int sepuluhRibu = 0;
			int limaRibu = 0;
			int duaRibu = 0;
			int seribu = 0;

			for (int i = 0; i <= kembalian; i++) {
				if (kembalian >= 100000) {
					seratusRibu++;
					kembalian -= 100000;
				} else if (kembalian >= 50000) {
					limaPuluhRibu++;
					kembalian -= 50000;
				} else if (kembalian >= 20000) {
					duaPuluhRibu++;
					kembalian -= 20000;
				} else if (kembalian >= 10000) {
					sepuluhRibu++;
					kembalian -= 10000;
				} else if (kembalian >= 5000) {
					limaRibu++;
					kembalian -= 5000;
				} else if (kembalian >= 2000) {
					duaRibu++;
					kembalian -= 2000;
				} else if (kembalian >= 1000) {
					seribu++;
					kembalian -= 1000;
				}
			}
			System.out.printf("%d uang Rp. 100.000\n", seratusRibu);
			System.out.printf("%d uang Rp. 50.000\n", limaPuluhRibu);
			System.out.printf("%d uang Rp. 20.000\n", duaPuluhRibu);
			System.out.printf("%d uang Rp. 10.000\n", sepuluhRibu);
			System.out.printf("%d uang Rp. 5.000\n", limaRibu);
			System.out.printf("%d uang Rp. 2.000\n", duaRibu);
			System.out.printf("%d uang Rp. 1.000\n", seribu);
	}
}