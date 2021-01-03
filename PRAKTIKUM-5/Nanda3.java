//PRAKTIKUM-5
import java.util.Scanner;

public class Nanda3 {
    public static void main(String[] args) {
        Scanner nardi = new Scanner(System.in);
        System.out.print("input number of age: ");
        int age = nardi.nextInt();
        myDay(age);
    }

    public static void myDay(int ageOnDay) {
        int tahun = ageOnDay / 365;
        int bulan = (ageOnDay % 365) / 30;
        int hari = (ageOnDay % 365) % 30;

        System.out.println(tahun + " tahun");
        System.out.println(bulan + " bulan");
        System.out.println(hari + " hari");
    }

}