import java.util.Scanner;
public class Soal1 {
    public static void main(String[] args) {
        Scanner answer = new Scanner (System.in);
        System.out.println("Input Nilai Awal");
        int x = answer.nextInt();
        System.out.println("Input Nilai Akhir");
        int y = answer.nextInt();
        for (int i = x; i <= y; i++){
            if(i % 2 == 0 && i > 0){
            System.out.println(i + " Genap Positif");
            }else if (i % 2 == 0 && i < 0){
            System.out.println(i + " Genap Negatif");
            }else if (i > 0){
            System.out.println(i + " Ganjil Positif");
            }else if (i < 0){
            System.out.println(i + " Ganjil Negatif");
            }else {
                System.out.println(i + " Nol");
            }
        }
    }
}
