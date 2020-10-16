import java.util.Scanner;



public class Pratikum1Nomor2 {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int time, cache, clock, minute, second;

       

        time   = scan.nextInt();
        scan.close();
        clock   = time / 3600;
        cache   = time % 3600;
        minute  = cache / 60;
        second  = cache % 60;

        System.out.printf("%02d:%02d:%02d",clock,minute,second);

     

        


      
    }

    
}
