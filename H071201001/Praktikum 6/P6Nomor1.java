import java.util.Scanner;

class P6Nomor1 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		String input = obj.nextLine();

		int length = input.length();
		int lengthDoubled = length * length;
		int lengthHalved = (length - 1) / 2;

		input = input.toUpperCase().replaceAll("\\s", "");
		input = input.substring(0, lengthHalved);
		input += palindrome(input);

		char symbol = String.format("%x", lengthDoubled).charAt(0);
		symbol = Character.isAlphabetic(symbol) ? '?' : '!';

		System.out.printf("#%x%s%o%c", lengthDoubled, input, length, symbol);	
		obj.close();
	}

	static String palindrome(String a) {
		String reversed = "";
		for (int i = (a.length() - 2); i >= 0; i--) {
			reversed += a.charAt(i);
		}
		return reversed;
	}
}