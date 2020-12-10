import java.util.Scanner;
public class No3 {
    public static void main(String[] args) {
        Scanner tiga = new Scanner(System.in);
        int usia = tiga.nextInt();
        
        System.out.println(myDay(usia)); }
        
    public static String myDay (int age){
        int tahun = age/365;
        int bulan = (age%365)/30;
        int hari = bulan%60;
        tahun += bulan==12 ? 1 : 0;
        bulan += hari==30 ? 1 :0;

        String usia = tahun + " Tahun\n" + bulan + " Bulan\n" + hari + " Hari";
        return usia;
    }
}