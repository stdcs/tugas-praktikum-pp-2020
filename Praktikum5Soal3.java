import java.util.Scanner;
public class Praktikum5Soal3 {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        System.out.println("Usia (dalam hari) : ");
        int a  = answer.nextInt();
        System.out.println(Hari(a));
    }
    public static String Hari(int x){
        int tahun = x / 365;
        int bulan = (x % 365) / 30;
        int hari = (x % 365) % 30;
        return tahun + " Tahun \n" + bulan + " Bulan \n" + hari + " Hari \n ";
    }
}
