import java.util.Scanner;
	
public class P3Nomor3 {
		public static void main(String[] args) {
			Scanner asd = new Scanner(System.in);
			System.out.println("Masukkan banyak anggota himpunan yg ingin ditampilkan!");
			int x = asd.nextInt();
			int angkaSatu = 0;
			int angkaDua = 1;

			for (int i = 1; i <= x; i++) {
				System.out.print(angkaSatu + " ");
				int sum = angkaSatu + angkaDua;
				angkaSatu = angkaDua;
				angkaDua = sum;
			}
	}
}