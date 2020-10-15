import java.util.Scanner;

class Praktikum1_2 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Input jumlah detik : ");
		int jumlah = obj.nextInt();
		int jam = jumlah / 3600;
		int menit = (jumlah % 3600) / 60;
		int detik = (jumlah % 60);
		System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
	}
}