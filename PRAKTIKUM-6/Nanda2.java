//PRAKTIKUM-6
import java.util.Scanner;
public class Nanda2 {
    public static void main(String[] args) {
        Scanner nardi = new Scanner(System.in);
        String a = nardi.nextLine();

        //hexadecimal
        int hexa = a.length()*a.length();
        String b = String.format("%x",hexa);

        //palindrom
        String c = a.replace(" ", "");
        String d = c.substring(0, (a.length()-1)/2);
        String e = d.toUpperCase();

        char[] f = e.toCharArray();
        String string = "";
        System.out.println(e);
        for (int i=0;i<e.length()-1; i++){
            string = f[i] + string;
        }
        String palindrom = e + string;

        
        int oktal = a.length();
        String jumlahOktal = String.format("%o", oktal);

        String s ="!";
        String t = "?";
        int hasil = (int)b.charAt(0);
        if(hasil<=97 && hasil >= 122){
            System.out.printf("#%s%s%s%s", b, palindrom, jumlahOktal, t);

        }else {
            System.out.printf("#%s%s%s%s", hexa, palindrom, jumlahOktal, s );
        }

    }
    
}