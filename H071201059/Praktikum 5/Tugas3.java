import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalDay = input.nextInt();
        System.out.println(myDay(totalDay));
        input.close();
    }

    public static String myDay(int d) {
        int year, month, day;
        year = d/365;
        d = d % 365;
        month = d / 30;
        d = d % 30;
        day = d;
        return year+" Tahun \n"+month+" Bulan \n"+day+" Hari \n";
    }
}