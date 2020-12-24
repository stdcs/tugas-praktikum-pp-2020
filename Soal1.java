import java.util.Scanner;
public class Soal1 {
    public static void main(String[] args) {
    Scanner answer = new Scanner(System.in); 
        int positif = 0;
        int negatif = 0;
        int genap = 0;
        int ganjil = 0;

        if (answer.hasNextInt()){
        int a = answer.nextInt();
        positif += a > 0 ? 1 : 0;
        negatif += a < 0 ? 1 : 0;
        genap += a % 2 == 0 ? 1 : 0;
        ganjil += a % 2 != 0 ? 1 : 0;
        }
        if (answer.hasNextInt()){
        int b = answer.nextInt();
        positif += b > 0 ? 1 : 0;
        negatif += b < 0 ? 1 : 0;
        genap += b % 2 == 0 ? 1 : 0;
        ganjil += b % 2 != 0 ? 1 : 0;
        }
        if (answer.hasNextInt()){
        int c = answer.nextInt();
        positif += c > 0 ? 1 : 0;
        negatif += c < 0 ? 1 : 0;
        genap += c % 2 == 0 ? 1 : 0;
        ganjil += c % 2 != 0 ? 1 : 0;
        }
        if (answer.hasNextInt()){
        int d = answer.nextInt();
        positif += d > 0 ? 1 : 0;
        negatif += d < 0 ? 1 : 0;
        genap += d % 2 == 0 ? 1 : 0;
        ganjil += d % 2 != 0 ? 1 : 0;
        }
        if (answer.hasNextInt()){
        int e = answer.nextInt();
        positif += e > 0 ? 1 : 0;
        negatif += e < 0 ? 1 : 0;
        genap += e % 2 == 0 ? 1 : 0;
        ganjil += e % 2 != 0 ? 1 : 0;
        System.out.println(positif + " Angka Positif");
        System.out.println(negatif + " Angka Negatif");
        System.out.println(genap + " Angka Genap");
        System.out.println(ganjil + " Angka Ganjil");
        }else{
            System.out.printf("Inputan Invalid");
        }
    }           
}