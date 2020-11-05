import java.util.Scanner;
public class Nomor1 {
    public static void main(String[] args) {
        Scanner coba = new Scanner(System.in);
        int genap_positif = 0;
        int ganjil_positif = 0;
        int genap_negatif = 0;
        int ganjil_negatif = 0;
        int nol = 0;
        int x = coba.nextInt();
        int y = coba.nextInt();

        if (x<=y){
            while (x<=y){
                if (x<0){
                    if (x%2!=0)
                    System.out.println(x + " ganjil negatif "); } 
                if (x%2==0){
                    if (x<0)
                    System.out.println(x + " genap negatif ");  } 

                if (x>0){
                    if (x%2!=0)
                    System.out.println(x + " ganjil positif "); }
                if (x>0){
                    if (x%2==0)
                    System.out.println(x+ " genap positif ");  } 
                if (x==0){
                    System.out.println(" 0 nol "); }

                x++; } }

        else if (x>=y){
            while(x>=y){
                if (y>0){
                    if(y%2==0)
                    System.out.println(y+ " genap positif ");  }
                if (y>0){
                    if (y%2!=0)
                    System.out.println(y+ " ganjil positif "); } 
                if (y<0) {
                    if (x%2==0)
                    System.out.println(y+ " genap negatif "); } 
                if (y<0){
                    if (x%2!=0)
                    System.out.println(y+ " ganjil negatif "); }

                else { 
                    System.out.println(" 0 nol "); }
                
                y++;} } 
}
}

