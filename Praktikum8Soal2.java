import java.util.Scanner;
import java.io.*;
public class Praktikum8Soal2 {
    public static void main(String[] args) {
    Scanner answer = new Scanner(System.in);
    FileReader a = null;
    BufferedReader b = null;
    FileWriter c = null;
    PrintWriter d = null;
    try {
        String file1 = answer.next();
        String file2 = answer.next();
        answer.close();
        a = new FileReader(file1 + ".txt");
        b = new BufferedReader(a);
        c = new FileWriter(file2 + ".txt");
        d = new PrintWriter(c);
        String trial;
        int max = 0;
        while ((trial = b.readLine()) != null){
            max = trial.length() > max ? trial.length() : max;
        }
        a = new FileReader(file1 + ".txt");
        b = new BufferedReader(a);
        String test;
        while ((test = b.readLine()) != null){
            d.write(String.format("%" + max + "s\n", test));
        }
    } catch (IOException ioe){
        System.out.println("Gagal");
    } finally {
        try {
           if (a != null){
              System.out.println("Berhasil");
              a.close();
           } 
           if (c != null){
              c.close();
           }
        } catch (IOException ioe){
           System.out.println(ioe.getMessage());
        }
        }
    }
}


