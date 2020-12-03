import java.util.Scanner;

class Praktikum5_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input usia (hari) : ");
		int total = input.nextInt();
		System.out.println(myDay(total));
	}

	public static String myDay(int total) {
		int tahun = total / 365;
		int bulan = (total % 365) / 30;
		int hari = (total % 365) % 30;
		String str = tahun + " tahun\n" + bulan + " bulan\n" + hari + " hari";
		return str;
	}
}