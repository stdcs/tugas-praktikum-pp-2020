import java.util.Scanner;

class Praktikum2_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("** Menu **");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Ruang\n");
        System.out.print("Input angka sesuai dengan menu yang diinginkan : ");
        try {
        	int menuAwal = input.nextInt();
        	double sisi, panjang ,luas ,alas , lebar, tinggi , jari, atas, bawah, d1, d2;      	
        	switch (menuAwal) {
        		case 1 :
        			System.out.println("\n** Pilih Bangun Datar **");
                	System.out.println("1. Persegi");
                	System.out.println("2. Persegi Panjang");
                	System.out.println("3. Segitiga");
                	System.out.println("4. Lingkaran");
                	System.out.println("5. Jajar Genjang");
                	System.out.println("6. Trapesium");
                	System.out.println("7. Belah Ketupat");
                	System.out.println("8. Layang-Layang\n");
                	System.out.print("Input angka sesuai dengan nomor bangun datar yang diinginkan : ");
                	int menu1 = input.nextInt();
                	switch (menu1) {
                		case 1 :
                			System.out.print("\nInput panjang sisi : ");
                            sisi = input.nextDouble();
                            double luasPersegi = sisi * sisi;
                            System.out.println("Luas Persegi : " + luasPersegi);
                            break;
                        case 2 :
                            System.out.print("\nInput panjang : ");
                            panjang = input.nextDouble();
                            System.out.print("Input Lebar : ");
                            luas = input.nextDouble();
                            double luasPersegiPanjang = panjang * luas;
                            System.out.println("Luas Persegi Panjang : " + luasPersegiPanjang);
                            break;
                        case 3 :
                            System.out.print("\nInput alas : ");
                            alas = input.nextDouble();
                            System.out.print("Input tinggi : ");
                            tinggi = input.nextDouble();
                            double luasSegitiga = (alas * tinggi) / 2;
                            System.out.println("Luas Segitiga : " + luasSegitiga);
                            break;
                        case 4 :
                            System.out.print("\nInput jari-jari : ");
                            jari = input.nextDouble();
                            double luasLingkar = 3.14 * jari * jari;
                            System.out.println("Luas Lingkaran : " + luasLingkar);
                            break;
                        case 5 :
                            System.out.print("\nInput alas : ");
                            alas = input.nextDouble();
                            System.out.print("Input tinggi : ");
                            tinggi = input.nextDouble();
                            double luasJajar = alas * tinggi;
                            System.out.println("Luas Jajar Genjang : " + luasJajar);
                            break;
                        case 6 :
                            System.out.print("\nInput sisi atas : ");
                            atas = input.nextDouble();
                            System.out.print("Input sisi bawah : ");
                            bawah = input.nextDouble();
                            System.out.print("Input tinggi : ");
                            tinggi = input.nextDouble();
                            double luasTrapesium = (atas + bawah) * 1/2 * tinggi;
                            System.out.println("Luas Trapesium : " + luasTrapesium);
                            break;
                        case 7 :
                            System.out.print("\nInput diagonal 1 : ");
                            d1 = input.nextDouble();
                            System.out.print("Input diagonal 2 : ");
                            d2 = input.nextDouble();
                            double luasKetupat = (d1 * d2) / 2;
                            System.out.println("Luas Belah Ketupat : " + luasKetupat);
                            break;
                        case 8 :
                            System.out.print("\nInput diagonal 1 : ");
                            d1 = input.nextDouble();
                            System.out.print("Input diagonal 2 : ");
                            d2 = input.nextDouble();
                            double luasLayang = (d1 * d2) / 2;
                            System.out.println("Luas Layang-Layang : " + luasLayang);
                            break;
                        default :
                            System.out.println("Menu tidak tersedia !");
                }
                break;
                case 2 :
                	System.out.println("\n** Pilih Bangun Ruang **");
                   	System.out.println("1. Kubus");
                    System.out.println("2. Balok");
                    System.out.println("3. Limas");
                    System.out.println("4. Prisma");
                    System.out.println("5. Tabung");
                    System.out.println("6. Kerucut");
                    System.out.println("7. Bola\n");
                    System.out.print("Input angka sesuai dengan nomor bangun ruang yang diinginkan : ");
                    int menu2 = input.nextInt();
                    switch (menu2) {
                    	case 1 :
                            System.out.print("\nInput panjang sisi : ");
                            sisi = input.nextDouble();
                            double volumeKubus = sisi * sisi * sisi;
                            System.out.println("Volume Kubus : " + volumeKubus);
                            break;
                        case 2 :
                            System.out.print("\nInput panjang : ");
                            panjang = input.nextDouble();
                            System.out.print("Input lebar : ");
                            lebar = input.nextDouble();
                            System.out.println("Input tinggi : ");
                            tinggi = input.nextDouble();
                            double volumeBalok = panjang * lebar * tinggi;
                            System.out.println("Volume Balok : " + volumeBalok);
                            break;
                        case 3 :
                            System.out.print("\nInput luas alas : ");
                            alas = input.nextDouble();
                            System.out.print("Input tinggi : ");
                            tinggi = input.nextDouble();
                            double volumeLimas = (alas * tinggi) / 3;
                            System.out.println("Volume Limas : " + volumeLimas);
                            break;
                        case 4 :
                            System.out.print("\nInput luas alas : ");
                            alas = input.nextDouble();
                            System.out.print("Input tinggi : ");
                            tinggi = input.nextDouble();
                            double volumePrisma = alas * tinggi;
                            System.out.println("Volume Prisma : " + volumePrisma);
                            break;
                        case 5 :
                            System.out.print("\nInput jari-jari : ");
                            jari = input.nextDouble();
                            System.out.print("Input tinggi : ");
                            tinggi = input.nextDouble();
                            double volumeTabung = 3.14 * jari * jari *tinggi;
                            System.out.println("Volume Tabung : " + volumeTabung);
                            break;
                        case 6 :
                            System.out.print("\nInput jari-jari : ");
                            jari = input.nextDouble();
                            System.out.print("Input tinggi : ");
                            tinggi = input.nextDouble();
                            double volumeKerucut = (3.14 * jari * jari * tinggi) / 3;
                            System.out.println("Volume Kerucut : " + volumeKerucut);
                            break;
                        case 7 :
                            System.out.print("\nInput jari-jari : ");
                            jari = input.nextDouble();
                            double volumeBola = (4 * 3.14 * jari * jari * jari) / 3;
                            System.out.println("Volume Bola : " + volumeBola);
                            break;
                        default :
                            System.out.println("Menu tidak tersedia !");
                }
                break;
                default :
                System.out.println("Masukkan menu yang benar !");
        	}
        }	
       		catch(Exception error){
            System.out.println("Masukkan menu yang benar");
        }
	}
}