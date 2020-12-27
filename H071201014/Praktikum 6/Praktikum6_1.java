import java.util.Scanner;

class Praktikum6_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input kalimat : ");
		String str = input.nextLine();
		if (!str.isEmpty()) {
			int strLength = str.length();
			String replace = str.replaceAll("\\s", "");
			String upperCase = replace.toUpperCase();
			String palindrom = new String(); 
			for (int i = 0; i < (replace.length() / 2); i++) {
				palindrom += upperCase.charAt(i);
			}
			for (int j = (replace.length() / 2 - 2); j >= 0; j--) {
				palindrom += upperCase.charAt(j);
			}
			String hex = String.format("%x", strLength * strLength);
			String oct = String.format("%o", strLength);
			String pattern1 = "^[0-9]+$";
			String pattern2 = "^[A-Za-z]+$";
			String simbol = new String();
			if (hex.charAt(0) >= '0' && hex.charAt(0) <= '9') {
				simbol += "!";
			} else {
				simbol += "?";
			}
			System.out.println("#" + hex + palindrom + oct + simbol);
		} else {
			System.out.println("Tidak terdapat karakter pada inputan.");
		}
	}
}