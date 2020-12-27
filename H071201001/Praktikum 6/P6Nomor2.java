import java.util.Scanner;

class P6Nomor2 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		String input = obj.nextLine();
		input = transform(input);

		String[][] array = new String[4][4];
		int count = 0;
		int characters = arrayChars(input);

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				array[i][j] = "";
				for (int k = 0; k < characters; k++) {
					array[i][j] += count < input.length() ? input.charAt(count) : '?';
					count++; 
				}
			}
		}

		printArray(array);
	}

	static String transform(String a) {
		String k = "";
		for (int i = 0; i < a.length(); i++) {
			if (i % 2 == 0) {
				k += a.charAt(i);
			} else {
				k += a.codePointAt(i);
			}	
		}
		return k;
	}

	static int arrayChars(String input) {
		int characters = 0;
		while ((16 * characters) < input.length()) {
			characters++;
		}
		return characters;
	}

	static void printArray(String array[][]) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
