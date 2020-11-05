import java.util.Scanner;

public class Luasdanvolume{
    public static void main(String[] args) {
        Scanner dua = new Scanner(System.in);
        System.out.println("** Menu **");
        System.out.println("1. Mencari luas bangun datar");
        System.out.println("2. Mencari volume bangun ruang");
        System.out.println("Input angka sesuai dengan menu yang diinginkan :");
        int menu = dua.nextInt();
        if (menu == 1) {
            System.out.println("**Pilih Bangun Datar**");
            System.out.println("1. Persegi");
            System.err.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Jajar Genjang");
            System.out.println("6. Trapesium");
            System.out.println("7. Belah Ketupat");
            System.out.println("8. Layang-Layang");
            System.out.println("Input angka sesuai dengan nomor yang diinginkan:");
        int bangun = dua.nextInt();
        int persegi, persegi_panjang, segitiga, jajar_genjang, trapesium, belah_ketupat, layang_layang;
        double lingkaran;
        double phi = 3.14;{
            if (bangun == 1) {
                System.out.println("Input sisi:");
                int s = dua.nextInt();
                persegi = s*s;
                System.out.println("Luas persegi = "+ persegi);
            } else if (bangun == 2) {
                System.out.println("Input panjang, lebar:");
                int p = dua.nextInt();
                int l = dua.nextInt();
                persegi_panjang = p*l;
                System.out.println("Luas = " + persegi_panjang);
            } else if (bangun == 3) {
                System.out.println("Input alas, tinggi:");
                int a = dua.nextInt(); 
                int t = dua.nextInt();
                segitiga = (a*t) / 2;
                System.out.println("Luas = " + segitiga);
            } else if (bangun == 4) {
                System.out.println("Input jari-jari:");
                int r = dua.nextInt();
                lingkaran = phi * r*r;
                System.out.println("Luas = " + lingkaran);
            } else if (bangun == 5) {
                System.out.println("Input alas, tinggi:");
                int a = dua.nextInt(); 
                int t = dua.nextInt();
                jajar_genjang = a*t;
                System.out.println("Luas = " + jajar_genjang);
            } else if (bangun == 6) {
                System.out.println("Input sisi-sisi sejajar, tinggi:");
                int sisi_sejajar = dua.nextInt();
                int t = dua.nextInt();
                trapesium = (sisi_sejajar *t) / 2;
                System.out.println("Luas = " + trapesium);
            } else if (bangun == 7) {
                System.out.println("Input diagonal 1, diagonal 2:");
                int d1 = dua.nextInt(); 
                int d2 = dua.nextInt();
                belah_ketupat = d1*d2*1/2;
                System.out.println("Luas = " + belah_ketupat);
            } else {
                System.out.println("Input diagonal 1, diagonal 2:");
                int d1 = dua.nextInt(); 
                int d2 = dua.nextInt();
                layang_layang = d1*d2*1/2;
                System.out.println("Luas = " + layang_layang); 
            } } 
        } if (menu == 2) {
            System.out.println("**Pilih Bangun Ruang**");
            System.out.println("1. Kubus");
            System.err.println("2. Balok");
            System.out.println("3. Limas");
            System.out.println("4. Prisma");
            System.out.println("5. Tabung");
            System.out.println("6. Kerucut");
            System.out.println("7. Bola");
            System.out.println("Input angka sesuai dengan nomor yang diinginkan:"); 
        int bangun = dua.nextInt();
        int kubus, balok, limas, prisma;
        double tabung, kerucut, bola;
        double phi = 3.14;{
            if (bangun == 2) {
                System.out.println("Input sisi:");
                int s = dua.nextInt();
                kubus = s*s*s;
                System.out.println("Volume kubus = "+ kubus);
            } else if (bangun == 2) {
                System.out.println("Input panjang, lebar, tinggi:");
                int p = dua.nextInt();
                int l = dua.nextInt();
                int t = dua.nextInt();
                balok = p*l*t;
                System.out.println("Volume = " + balok);
            } else if (bangun == 3) {
                System.out.println("Input luas alas, tinggi:");
                int a = dua.nextInt(); 
                int t = dua.nextInt();
                limas = (a*t) / 3;
                System.out.println("Volume = " + limas);
            } else if (bangun == 4) {
                System.out.println("Input luas alas, tinggi:");
                int a = dua.nextInt();
                int t = dua.nextInt();
                prisma = a*t;
                System.out.println("Volume = " + prisma);
            } else if (bangun == 5) {
                System.out.println("Input jari-jari, tinggi:");
                int r = dua.nextInt(); 
                int t = dua.nextInt();
                tabung = phi*r*r*t;
                System.out.println("Volume = " + tabung);
            } else if (bangun == 6) {
                System.out.println("Input jari-jari:");
                int r = dua.nextInt();
                kerucut = phi*r*r / 3;
                System.out.println("Volume = " + kerucut);
            } else {
                System.out.println("Input jari-jari:");
                int r = dua.nextInt(); 
                bola = 4*phi*r*r*r/3;
                System.out.println("Volume = " + bola); 
            }
    }
}
    }
}
