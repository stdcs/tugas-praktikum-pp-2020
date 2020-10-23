import java.util.Scanner;

public class Nomor1 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int A = 0;
			int B = 0;
			int C = 0;
			int D = 0;
			int E = 0;

			try {
				System.out.println("Masukkan 5 Angka!");
				A = input.nextInt();
				B = input.nextInt();
				C = input.nextInt();
				D = input.nextInt();
				E = input.nextInt();
			} catch (Exception inputMismatch) {
				System.out.println("Inputan Tidak Valid!");
				return;
			}

				int genap = 0;
				int ganjil = 0;
				int positif = 0;
				int negatif = 0;
				int angkaNol = 0;
				int bilangan = 0;
				int sifat = 0;

				sifat = (A != 0) ? ((A % 2 == 0) ? ganjil++ : genap++) : angkaNol++;
				bilangan = (A != 0) ? ((A > 0) ? positif++ : negatif++) : bilangan;

				sifat = (B != 0) ? ((B % 2 == 0) ? ganjil++ : genap++) : angkaNol++;
				bilangan = (B != 0) ? ((B > 0) ? positif++ : negatif++) : bilangan;

				sifat = (C != 0) ? ((C % 2 == 0) ? ganjil++ : genap++) : angkaNol++;
				bilangan = (C != 0) ? ((C > 0) ? positif++ : negatif++) : bilangan;

				sifat = (D != 0) ? ((D % 2 == 0) ? ganjil++ : genap++) : angkaNol++;
				bilangan = (D != 0) ? ((D > 0) ? positif++ : negatif++) : bilangan;

				sifat = (E != 0) ? ((E % 2 == 0) ? ganjil++ : genap++) : angkaNol++;
				bilangan = (E != 0) ? ((E > 0) ? positif++ : negatif++) : bilangan;

				System.out.println(genap + " Angka Genap");
				System.out.println(ganjil + " Angka Ganjil");
				System.out.println(angkaNol + " Angka Nol");
				System.out.println(positif + " Angka Positif");
				System.out.println(negatif + " Angka Negatif");
			}
		}
