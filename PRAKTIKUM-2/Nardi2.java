import java.util.Scanner;
class Nardi2{
    public static void main (String[]args){
        Scanner nardi = new Scanner (System.in);
        int luasPersegi;
        int luasPersegiPanjang ;
        int luasSegitiga;
        int luasJajarGenjang;
        int volumeKubus;
        int volumeBalok;
        int volumePrismaSegitiga;
        int volumeLimasSegitiga;
        System.out.println("==========menu==========");
        System.out.println("1.mencari luas bangun datar :");
        System.out.println("2.mencari volume bangun ruang : ");
        System.out.print("menu pilihan : ");
        int menu  = nardi.nextInt();
        if (menu==1){
            System.out.println("pilih bangun datar");
            System.out.println("1. persegi");
            System.out.println("2. persegi panjang");
            System.out.println("3. segitiga");
            System.out.println("4. jajarGenjang");
            System.out.print("masukkan menu pilihan : ");
            int menuX = nardi.nextInt();
            if (menuX==1){
                System.out.print("masukkan sisi : ");
                int s = nardi.nextInt();
                luasPersegi= s*s;
                System.out.print("Luas persegi adalah :" + luasPersegi);
            }
            if (menuX==2){
                System.out.print("masukkan panjang : ");
                int x = nardi.nextInt();
                System.out.print("masukkan lebar : ");
                int y = nardi.nextInt();
                luasPersegiPanjang= x*y;
                System.out.print("Luas persegi panjang : " + luasPersegiPanjang);
            }
            if (menuX==3){
                System.out.print("masukkan alas :");
                int a = nardi.nextInt();
                System.out.print("masukkan tinggi : ");
                int t = nardi.nextInt();
                luasSegitiga = (a/2)*t;
                System.out.print("Luas Segitiga : " + luasSegitiga);
            }
            if (menuX==4){
                System.out.print("masukkan alas :");
                int l = nardi.nextInt();
                System.out.print("masukkan tinggi : ");
                int g = nardi.nextInt();
                luasJajarGenjang = l*g;
                System.out.print("Luas jajar Genjang : " + luasJajarGenjang);
            }
        }else if (menu==2){
            System.out.println("pilih bangun datar");
            System.out.println("1. kubus");
            System.out.println("2. balok");
            System.out.println("3. prisma segitiga");
            System.out.println("4. Limas Segitiga");
            System.out.print("masukkan menu pilihan : ");
            int menuY = nardi.nextInt();
            if (menuY==1){
                System.out.print("masukkan sisi : ");
                int s = nardi.nextInt();
                volumeKubus = s*s*s;
                System.out.print("volume kubus : " + volumeKubus);
            }
            if (menuY==2){
                System.out.print("masukkan panjang : ");
                int n = nardi.nextInt();
                System.out.print("masukkan lebar : ");
                int l = nardi.nextInt();
                System.out.print("masukkan tinggi : ");
                int t = nardi.nextInt();
                volumeBalok = n*l*t;
                System.out.print("volume balok : " + volumeBalok);
            }
            if (menuY==3){
                System.out.print("masukkan luas alas : ");
                int l = nardi.nextInt();
                System.out.print("masukkan tinggi : ");
                int t= nardi.nextInt();
                volumePrismaSegitiga =l*t;
                System.out.print("volume tabung : " + volumePrismaSegitiga);
            }
            if (menuY==4){
                System.out.print("masukkan luas alas : ");
                int l = nardi.nextInt();
                System.out.print("masukkan tinggi : ");
                int t= nardi.nextInt();
                volumeLimasSegitiga =(l/3)*t;
                System.out.print("volume tabung : " + volumeLimasSegitiga);
        }
            }
            }
}