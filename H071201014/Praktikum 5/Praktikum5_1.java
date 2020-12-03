import java.util.Scanner;

class Praktikum5_1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input angka pertama : ");
		int angkaPertama = input.nextInt();
		System.out.print("Input angka kedua : ");
		int angkaKedua = input.nextInt();
		cariFPB(angkaPertama, angkaKedua);
	}

	static void cariFPB(int angkaPertama, int angkaKedua) {
		int besar = angkaPertama;
		int kecil = angkaKedua;
		if (angkaKedua > angkaPertama) {
			besar = angkaKedua;
			kecil = angkaPertama;
		}
		for (int i = kecil; i > 0; i--) {
			if (kecil % i == 0 && besar % i == 0) {
				int fpb = i;
				System.out.println("FPB dari " + angkaPertama + " dan " + angkaKedua + " adalah = " + fpb);
				break;
			}
		}
	}
}