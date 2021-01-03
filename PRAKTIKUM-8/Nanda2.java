import java.util.Scanner;
import java.io.*;

public class Nanda2{
   public static void main(String[] args) throws FileNotFoundException {
      Scanner nardi = new Scanner (System.in);
      FileWriter f = null;
      PrintWriter p = null;
      FileReader r = null;
      BufferedReader b = null;

      try {
         String dataSatu = nardi.next();                                            
         String dataDua = nardi.next();                                           
         nardi.close();
         r = new FileReader(String.format("%s.txt",dataSatu));
         b = new BufferedReader(r);
         f = new FileWriter(String.format("%s.txt", dataDua));
         p = new PrintWriter(f);

         String test;

         int a = 0;
         while ((test = b.readLine()) != null){
             if (test.length() > a){
                a=test.length();
             }else{
                a=a;
             }
          
         }
         r = new FileReader(String.format("%s.txt",dataSatu));
         b = new BufferedReader(r);


         String test1;

         while ((test1 = b.readLine()) != null) {
            p.write(String.format("%"+ a +"s\n", test1));
         }

      } catch (IOException ioe){
         System.out.println("Gagal");
      } finally {
         try {
            if (f != null){
               System.out.println("Berhasil");
               f.close();
            } 
            if (r != null){
               r.close();
            }
         } catch (IOException ioe){
            System.out.println(ioe.getMessage());
         }
      }
   }
} 