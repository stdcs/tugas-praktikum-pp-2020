import java.util.Scanner;

class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan besaran detik ");
        int second = input.nextInt();
        int hour = second / 3600;
        int minute = (second % 3600) / 60;
        second = (second % 3600) % 60;
        
        System.out.printf("%02d : %02d : %02d",hour, minute, second);
    }
}