import java.util.InputMismatchException;
import java.util.Scanner;

class Nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int d = input.nextInt();
            int e = input.nextInt();
            int genap = 0; 
            int ganjil = 0; 
            int positif = 0;
            int negatif = 0;
            if (a % 2 == 0) {
                genap++;
            } else {
                ganjil++;
            }
            if (b % 2 == 0) {
                genap++;
            } else{
                ganjil++;
            }
            if (c % 2 == 0) {
                genap++;
            } else{
                ganjil++;
            }
            if (d % 2 == 0) {
                genap++;
            } else{
                ganjil++;
            }
            if (e % 2 == 0) {
                genap++;
            } else{
                ganjil++;
            }
            if (a > 0) positif++;
            if (b > 0) positif++;
            if (c > 0) positif++;
            if (d > 0) positif++;
            if (e > 0) positif++;
            if (a < 0) negatif++;
            if (b < 0) negatif++;
            if (c < 0) negatif++;
            if (d < 0) negatif++;
            if (e < 0) negatif++;
            System.out.println(genap+ " Angka Genap");
            System.out.println(ganjil+ " Angka Ganjil");
            System.out.println(positif+ " Angka Positif");
            System.out.println(negatif+ " Angka Negatif");
        } catch (InputMismatchException e) {
            System.out.println("Inputan Tidak Valid");
        }
    }
}