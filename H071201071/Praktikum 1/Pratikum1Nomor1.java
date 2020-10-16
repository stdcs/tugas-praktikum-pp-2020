import java.util.Scanner;

 class Pratikum1Nomor1 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
       
       int waktu = scan.nextInt();
        int kecepatan = scan.nextInt();
        scan.close();
        
        double jumlahBahanBakar =  (waktu*kecepatan) / 14d;

       
        System.out.printf("%.3f L", jumlahBahanBakar);



        
    }
}