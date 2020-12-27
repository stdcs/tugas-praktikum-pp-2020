
import java.util.Scanner;

class P4Nomor1 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		int n = obj.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = obj.nextInt();
		}

		 for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				boolean notCoprime;
				for (int k = 2; k <= array[i] && k <= array[j]; k++) {
					if (array[i] % k == 0 && array[j] % k == 0) 
						notCoprime = true;
				}
					if (!notCoprime)
						System.out.println(array[i] + " " + array[j]);
				}
			}
		}
	}