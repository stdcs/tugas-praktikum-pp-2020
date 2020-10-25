import java.util.Scanner;
	
public class P3Nomor5 {
		public static void main(String[] args) {
			Scanner asd = new Scanner(System.in);
			while (asd.hasNext()) {
				if (asd.hasNextFloat()) {
					float m = asd.nextFloat();
					if (m >= 360 || m < 0) {
						continue;
					}
					float konversi = m * 480; // konversi ke detik
					float hours = konversi/3600;
        			float minutes = (konversi%3600)/60;
        			float sec = (konversi%3600)%60;
        			System.out.printf("%02.0f:%02.0f:%02.0f\n", hours, minutes, sec);
        			continue;
				} else if (asd.hasNextLine()) {
					String m = asd.nextLine();
					if (m.equalsIgnoreCase("")) {
						asd.close();
						break;
					}/* else {
						System.out.println("Input harus berupa float!");
					}*/
			}
		}
	}	
}