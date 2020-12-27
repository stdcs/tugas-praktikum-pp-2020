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
					float konversi = m * 240; // konversi derajat ke detik
					float hours = (konversi / 3600);
					hours += 6;
        			float minutes = (konversi % 3600) / 60;
        			float sec = (konversi % 3600) % 60;
	        		hours -= hours >= 24 ? 24 : 0;
	        			if (hours >= 18 || hours < 6) {
	        				System.out.println("Selamat Malam!");
	        			} else if (hours >= 12 && hours < 18) {
	        				System.out.println("Selamat Siang!");
	        			} else if (hours >= 6 && hours < 12) {
	        				System.out.println("Selamat Pagi!");
	        			}
        			System.out.printf("%02.0f:%02.0f:%02.0f\n\n", hours, minutes, sec);
				}
		}
	}	
}