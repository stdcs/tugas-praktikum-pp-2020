import java.io.*;
import java.util.Scanner;
public class Praktikum8Soal1 {
    public static void main(String[] args) {
    Scanner answer = new Scanner(System.in);
    FileInputStream in = null;
    FileOutputStream out = null;
    String input = answer.next();
    String output = answer.next();
    try {
    in = new FileInputStream("C:\\new\\"+input+".txt");
    out = new FileOutputStream("C:\\new\\"+output+".txt");
    int data;
    while ((data = in.read()) != -1){
        out.write(data);
        }
        System.out.println("Berhasil");
    } catch (IOException e){
        System.out.println("Gagal");
    } finally {
        try {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        } catch (IOException e) {
            System.out.println("gagal");
        }
    }
    }
}
