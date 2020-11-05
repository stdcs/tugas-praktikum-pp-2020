import java.util.Scanner;

public class Nomor2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sekon = input.nextInt();

        int jam = sekon/3600;
        int menit = (sekon%3600)/60;
        int detik = sekon%60;
        System.out.printf("%02d : %02d : %02d",jam,menit,detik);

    }
}