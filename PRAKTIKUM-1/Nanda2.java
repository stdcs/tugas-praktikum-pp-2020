//praktikum-1
import java.util.Scanner;
class Nanda2 {
    public static void main(String [] args) {
        Scanner nardi = new Scanner(System.in);
        System.out.print("Input jumlah detik= ");
        int second = nardi.nextInt();
        int jam1 = second/3600; 
        int jam2 = second%3600;
        int minute = jam2/60;
        int minute1 = second%60;
        int second1 = minute1;
        System.out.printf("%d : %02d : %d", jam1,minute,second1);
    }
}