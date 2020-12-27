import java.util.Scanner;

public class Praktikum3Nomor4 {
    public static void main(String[] args){
        try{
            Scanner input = new Scanner(System.in);
            int seratusRibu = 0; 
            int limaPuluhRibu =0;
            int duaPuluhRibu = 0;
            int sepuluhRibu = 0;
            int limaRibu = 0;
            int duaRibu = 0;
            int seribu = 0;

            System.out.print("Masukkan Harga Barang: ");
            int harga = input.nextInt();
            System.out.print("Masukkan Jumlah Uang: ");                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
            int uangBayar = input.nextInt();

            if(harga<uangBayar){
                int kembalian = uangBayar - harga;
                while(kembalian>0){
                    if(kembalian-100000 >= 0){
                        kembalian -= 100000;
                        seratusRibu++;
                    }else if(kembalian-50000 >= 0){
                        kembalian -= 50000;
                        limaPuluhRibu++;
                    }else if(kembalian-20000 >= 0){
                        kembalian -= 20000;
                        duaPuluhRibu++;
                    }else if(kembalian-10000 >= 0){
                        kembalian -= 10000;
                        sepuluhRibu ++;
                    }else if(kembalian-5000 >= 0){
                        kembalian -= 5000;
                        limaRibu++;
                    }else if(kembalian-2000 >= 0){
                        kembalian -= 2000;
                        duaRibu++;
                    }else{
                        kembalian -= 1000;
                        seribu++;
                    }
                }
                System.out.println(seratusRibu + " uang Rp.100.000");
                System.out.println(limaPuluhRibu + " uang Rp.50.000");
                System.out.println(duaPuluhRibu + " uang Rp.20.000");
                System.out.println(sepuluhRibu + " uang Rp.10.000");
                System.out.println(limaRibu + " uang Rp.5.000");
                System.out.println(duaRibu + " uang Rp.2.000");
                System.out.println(seribu + " uang Rp.1.000");
            }
            else
                System.out.println("uang anda tidak cukup untuk membayar");
        }
        catch(Exception e){
            System.out.println("mohon masukkan data yang benar");
        }
    }
}

