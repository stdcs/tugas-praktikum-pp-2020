import java.util.Scanner;

public class Nomor031 {

    public static void main(String[] args)
    {
        try
        {
            Scanner scan = new Scanner(System.in);
            int n,a=0,b=1,next;
            n = scan.nextInt();
            for(int count = 2; count<n; count++)
            {
                System.out.print(" "+a);
                a+=b;
                b= a - b;
            }
        }
        catch(Exception e)
        {
            System.out.println("data harus bilangan bulat");
        }
    }
}
