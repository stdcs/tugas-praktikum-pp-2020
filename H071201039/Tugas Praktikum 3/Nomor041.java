import java.util.Scanner;

public class Nomor041 {

    public static void main(String[] args)
    {
        try
        {
            Scanner scan = new Scanner(System.in);
            int seratusRibu=0,limpuluhRibu=0,duapuluhRibu=0,sepuluhRibu=0,limaRibu=0,duaRibu=0,seribu=0;
            int harga = scan.nextInt();
            int uang = scan.nextInt();
            if (harga<uang)
            {
                int kembalian = uang-harga;
                while(kembalian > 0)
                {
                    if(kembalian-100000>=0)
                    {
                        kembalian -= 100000;
                        seratusRibu++;
                    }
                    else if(kembalian-50000>=0)
                    {
                        kembalian -= 50000;
                        limpuluhRibu++;
                    }
                    else if(kembalian-20000>=0)
                    {
                        kembalian -= 20000;
                        duapuluhRibu++;
                    }
                    else if(kembalian-10000>=0)
                    {
                        kembalian -= 10000;
                        sepuluhRibu++;
                    }
                    else if(kembalian-5000>=0)
                    {
                        kembalian -= 5000;
                        limaRibu++;
                    }
                    else if(kembalian-2000>=0)
                    {
                        kembalian -= 2000;
                        duaRibu++;
                    }
                    else
                    {
                        kembalian -= 1000;
                        if(kembalian==0)
                            seribu++;
                    }
                }
                System.out.println(seratusRibu+" uang Rp.100.000");
                System.out.println(limpuluhRibu+" uang Rp.50.000");
                System.out.println(duapuluhRibu+" uang Rp.20.000");
                System.out.println(sepuluhRibu+" uang Rp.10.000");
                System.out.println(limaRibu+" uang Rp.5.000");
                System.out.println(duaRibu+" uang Rp.2.000");
                System.out.println(seribu+" uang Rp.1.000");
            }
            else
                System.out.println("uang anda tidak cukup untuk membayar");
        }
        catch(Exception e)
        {
            System.out.println("mohon masukkan data yang benar");
        }
    }
    
}
