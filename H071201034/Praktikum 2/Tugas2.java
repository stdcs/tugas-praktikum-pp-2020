import java.util.Scanner;
class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("** Menu **");
        System.out.println("1. Mencari Luas Bangun Datar:");
        System.out.println("2. Mencari Volume Bangun Ruang:");
        System.out.println("Input angka sesuai dengan menu yang diinginkan :");
        int menu = input.nextInt();
        
        double s,p,l,a,t,r,atas,bawah,d1,d2,alassegitiga,alasjajar,alastrap,alasketupat,alaslayang;
        double phi = 3.14;
        switch (menu) {
            case 1 :
                System.out.println("** Pilih Bangun Datar **");
                System.out.println("1. Persegi");
                System.out.println("2. Persegi Panjang");
                System.out.println("3. Segitiga");
                System.out.println("4. Lingkaran");
                System.out.println("5. Jajar Genjang");
                System.out.println("6. Trapesium");
                System.out.println("7. Belah Ketupat");
                System.out.println("8. Layang-Layang");
                System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan :");
                int bangun = input.nextInt();
                switch (bangun) {
                    case 1 :
                        System.out.println("Input Panjang Sisi");
                        s = input.nextDouble();
                        double luaspersegi = s * s;
                        System.out.println("Luas Persegi = " + luaspersegi);
                        break;
                    case 2 :
                        System.out.println("Input Panjang");
                        p = input.nextDouble();
                        System.out.println("Input Lebar");
                        l = input.nextDouble();
                        double luaspersegipanjang = p * l;
                        System.out.println("Luas Persegi Panjang = " + luaspersegipanjang);
                        break;
                    case 3 :
                        System.out.println("Input Alas");
                        a = input.nextDouble();
                        System.out.println("Input Tinggi");
                        t = input.nextDouble();
                        double luassegitiga = (a * t) / 2;
                        System.out.println("Luas Segitiga = " + luassegitiga);
                        break;
                    case 4 :
                        System.out.println("Input jari-jari" );
                        r = input.nextDouble();
                        double luaslingkar = phi * r * r;
                        System.out.println("Luas Lingkaran = " + luaslingkar);
                        break;
                    case 5 :
                        System.out.println("Input Alas");
                        a = input.nextDouble();
                        System.out.println("Input Tinggi");
                        t = input.nextDouble();
                        double luasjajar = a * t;
                        System.out.println("Luas Jajar Genjang = " + luasjajar);
                        break;
                    case 6 :
                        System.out.println("Input Sisi Atas");
                        atas = input.nextDouble();
                        System.out.println("Input Sisi Bawah");
                        bawah = input.nextDouble();
                        System.out.println("Input Tinggi");
                        t = input.nextDouble();
                        double luastrap = (atas + bawah) * 1/2 * t;
                        System.out.println("Luas Trapesium = " + luastrap);
                        break;
                    case 7 :
                        System.out.println("Input Diagonal 1");
                        d1 = input.nextDouble();
                        System.out.println("Input Diagonal 2");
                        d2 = input.nextDouble();
                        double luasketupat = (d1 * d2) / 2;
                        System.out.println("Luas Belah Ketupat = " + luasketupat);
                        break;
                    case 8 :
                        System.out.println("Input Diagonal 1");
                        d1 = input.nextDouble();
                        System.out.println("Input Diagonal 2");
                        d2 = input.nextDouble();
                        double luaslayang = (d1 * d2) / 2;
                        System.out.println("Luas Layang-Layang = " + luaslayang);
                        break;
                default :
                    System.out.println("Inputan tidak valid.");        
                }        
                    break;
            case 2 :
                System.out.println("** Pilih Bangun Ruang **");
                System.out.println("1. Kubus");
                System.out.println("2. Balok");
                System.out.println("3. Prisma Segitiga");
                System.out.println("4. Tabung");
                System.out.println("5. Prisma Jajar Genjang");
                System.out.println("6. Prisma Trapesium");
                System.out.println("7. Prisma Belah Ketupat");
                System.out.println("8. Prisma Layang-Layang");
                System.out.println("Input angka sesuai dengan nomor bangun ruang yang diinginkan :");
                bangun = input.nextInt();
                switch (bangun) {
                    case 1 :
                        System.out.println("Input Panjang Sisi");
                        s = input.nextDouble();
                        double volkubus = s * s * s;
                        System.out.println("Volume Kubus = " + volkubus);
                        break;
                    case 2 :
                        System.out.println("Input Panjang");
                        p = input.nextDouble();
                        System.out.println("Input Lebar");
                        l = input.nextDouble();
                        System.out.println("Input Tinggi");
                        t = input.nextDouble();
                        double volbalok = p * l * t;
                        System.out.println("Volume Balok = " + volbalok);
                        break;
                    case 3 :
                        System.out.println("Input Luas Alas");
                        alassegitiga = input.nextDouble();
                        System.out.println("Input Tinggi");
                        t = input.nextDouble();
                        double volpristiga = alassegitiga * t;
                        System.out.println("Volume Prisma Segitiga = " + volpristiga);
                        break;
                    case 4 :
                        System.out.println("Input jari-jari");
                        r = input.nextDouble();
                        System.out.println("Input Tinggi");
                        t = input.nextDouble();
                        double voltabung = phi * r * r * t;
                        System.out.println("Volume Tabung = " + voltabung);
                        break;
                    case 5 :
                        System.out.println("Input Luas Alas");
                        alasjajar = input.nextDouble();
                        System.out.println("Input Tinggi");
                        t = input.nextDouble();
                        double volprisjajar = alasjajar * t;
                        System.out.println("Volume Prisma Jajar Genjang = " + volprisjajar);
                        break;
                    case 6 :
                        System.out.println("Input Luas Alas");
                        alastrap = input.nextDouble();
                        System.out.println("Input Tinggi");
                        t = input.nextDouble();
                        double volpristrap = alastrap * t;
                        System.out.println("Volume Prisma Trapesium = " + volpristrap);
                        break;
                    case 7 :
                        System.out.println("Input Luas Alas");
                        alasketupat = input.nextDouble();
                        System.out.println("Input Tinggi");
                        t = input.nextDouble();
                        double volprisketupat = alasketupat * t;
                        System.out.println("Volume Prisma Belah Ketupat = " + volprisketupat);
                        break;
                    case 8 :
                        System.out.println("Input Luas Alas");
                        alaslayang = input.nextDouble();
                        System.out.println("Input Tinggi");
                        t = input.nextDouble();
                        double volprislayang = alaslayang * t;
                        System.out.println("Volume Prisma Layang-Layang = " + volprislayang);
                        break;
                default :
                    System.out.println("Inputan tidak valid.");      
                }
                break;
        default :
            System.out.println("Inputan tidak valid.");
        } 
    }
}