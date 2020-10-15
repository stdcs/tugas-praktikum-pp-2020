import java.util.Scanner;

class Praktikum1_3 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Input nilai h : ");
		int h = obj.nextInt();
		System.out.print("Input nilai a : ");
		int a = obj.nextInt();
		System.out.print("Input nilai b : ");
		int b = obj.nextInt();
		double tan1 = Math.tan(Math.toRadians(a));
        double tan2 = Math.tan(Math.toRadians(b));
        double panjang_kapal = (h * tan1) - (h * tan2);
        System.out.printf("Panjang kapal = %.1f m\n", panjang_kapal);
	}
}