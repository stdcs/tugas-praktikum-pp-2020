import java.util.Scanner;

public class Nomor5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float m;

        while (scan.hasNext()) {
            m = scan.nextFloat();
            if (m >= 0 && m < 360) {
                int jam = 0, menit = 0;
                int detik = (int) (m * 240);
                /*
                 * while(dSementara>0){ if(dSementara-3600>=0){ jam++; dSementara-=3600; } else
                 * if(dSementara-60>=0){ menit++; dSementara-=60; } else{ detik++;
                 * dSementara-=1; } }
                 */

                jam = detik / 3600;
                menit = detik % 3600 / 60;
                detik %= 60;
                jam += 6;

                if (jam >= 24)
                    jam -= 24;

                if (jam < 11) {
                    System.out.println("selamat pagi!");
                    System.out.printf("%02d : %02d : %02d\n", jam, menit, detik);
                } else if (jam < 15) {
                    System.out.println("selamat siang!");
                    System.out.printf("%02d : %02d : %02d\n", jam, menit, detik);
                } else if (jam < 7) {
                    System.out.println("selamat sore!");
                    System.out.printf("%02d : %02d : %02d\n", jam, menit, detik);
                } else {
                    System.out.println("selamat malam!");
                    System.out.printf("%02d : %02d : %02d\n", jam, menit, detik);
                }
            } else
                System.out.println("> > > Masukkan nilai 0<=m<360! < < <");
        }

    }
}