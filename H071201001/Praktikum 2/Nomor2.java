import java.util.Scanner;

public class Nomor2 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			try {	
				System.out.println("** Menu **");
				System.out.println("1. Mencari Luas Bangun Datar");
				System.out.println("2. Mencari Volume Bangun Ruang\n");
				System.out.println("Input angka sesuai dengan menu yang diinginkan :");
				int menuUtama = input.nextInt();

		//		
				double luas = 0.0;
				double volume = 0.0;
				double pi = 3.14159;
				String namaBangun = "";
				String namaRuang = "";
		//

				if (menuUtama == 1) {
					System.out.println("\n** Pilih Bangun Datar**");
					System.out.println("1. Persegi\n2. Persegi Panjang\n3. Segitiga\n4. Lingkaran\n");
					System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan :");
					int menuDatar = input.nextInt();

					if (menuDatar == 1) {
						System.out.println("\nInput Panjang Sisi");
						double sisi = input.nextInt();
						luas = sisi * sisi;
						namaBangun = "Persegi";
					} else if (menuDatar == 2) {
						System.out.println("\nInput Panjang");
						double panjang = input.nextDouble();
						System.out.println("Input Lebar");
						double lebar = input.nextDouble();
						luas = panjang * lebar;
						namaBangun = "Persegi Panjang";
					} else if (menuDatar == 3) {
						System.out.println("\nInput Alas");
						double alas = input.nextDouble();
						System.out.println("Input Tinggi");
						double tinggi = input.nextDouble();
						luas = alas * tinggi;
						namaBangun = "Segitiga";
					} else if (menuDatar == 4) {
						System.out.println("\nInput Diameter");
						double diameter = input.nextDouble();
						luas = (pi * (diameter * diameter)) / 4.0;
						namaBangun = "Lingkaran";
					} else {
						System.out.println("Maaf! Pilihan tidak terdapat di menu.");
					}

					if (namaBangun.length() > 0) {
						System.out.printf("\nLuas %s = %.1f\n", namaBangun, luas);
					}

				} else if (menuUtama == 2){
					System.out.println("\n** Pilih Bangun Ruang**");
					System.out.println("1. Kubus\n2. Balok\n3. Kerucut\n4. Bola\n");
					System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan :");
					int menuRuang = input.nextInt();	

					if (menuRuang == 1) {
						namaRuang = "Kubus";
						System.out.println("\nInput Panjang Sisi");
						double sisi = input.nextInt();
						volume = sisi * sisi * sisi;
					} else if (menuRuang == 2) {
						namaRuang = "Balok";
						System.out.println("\nInput Panjang");
						double panjang = input.nextDouble();
						System.out.println("Input Lebar");
						double lebar = input.nextDouble();
						System.out.println("Input Tinggi");
						double tinggi = input.nextDouble();
						volume = panjang * lebar * tinggi;
					} else if (menuRuang == 3) {
						namaRuang = "Kerucut";
						System.out.println("\nInput Jari-jari");
						double jari = input.nextDouble();
						System.out.println("Input Tinggi");
						double tinggi = input.nextDouble();
						volume = (pi * (jari * jari) * tinggi) / 3;
					} else if (menuRuang == 4) {
						namaRuang = "Bola";
						System.out.println("\nInput Jari-jari");
						double jari = input.nextDouble();
						volume = (4 * pi * (jari * jari)) / 3;
					} else {
						System.out.println("Maaf! Pilihan tidak terdapat di menu.");
					}

					if (namaRuang.length() > 0) {
						System.out.printf("\nVolume %s = %.1f\n", namaRuang, volume);
					}
				} else {
					System.out.println("Maaf! Pilihan tidak ada di menu.");
				}
			} catch (Exception inputMismatch) {
				System.out.println("\nInput tidak valid!");
			}
			
		}
}