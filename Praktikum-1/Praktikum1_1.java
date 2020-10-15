import java.util.Scanner;

class Praktikum1_1 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Input waktu tempuh (Jam) : ");
		int waktu = obj.nextInt();
		System.out.print("Input kecepatan rata-rata (KM/Jam) : ");
		int rata_rata = obj.nextInt();
		float jarak = rata_rata*waktu;
		float bensin = (jarak/14);
		System.out.printf("Total bensin yang digunakan = %.3f L\n", bensin);
	}	
}