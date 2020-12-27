import java.util.Scanner;

public class Praktikum4Nomor1 {

	public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();

		int[] angka = new int[n];

		for (int i = 0; i < angka.length; i++) {
			angka[i] = obj.nextInt();
		}
	    for (int i = 0; i < n; i++) {
	    	for (int j = i + 1; j < n; j++) {
	    		if (angka[i] % angka[j] != 0 && angka[j] % angka[i] != 0)
	    		System.out.print(angka[i] + " " + angka[j] + "\n");
	    	}	
	    	
	    }
	}
}