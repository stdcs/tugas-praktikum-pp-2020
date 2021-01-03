import java.io.*;
import java.util.Scanner;

class Nanda1 {
    public static void main(String[] args) {
        Scanner saya = new Scanner (System.in);
        FileInputStream inp = null;
        FileOutputStream outp = null;
        try {
            inp = new FileInputStream(saya.next()+".txt");
            outp = new FileOutputStream(saya.next()+".txt");
            int d;
            while ((d = inp.read()) != -1) {
                outp.write(d);
            }
        } catch (IOException ioe) {
            System.out.println("gagal");
        }

        finally {
            try {
                if (inp != null) {
                    System.out.println("berhasil");
                    inp.close();
                }
                if (outp != null) {
                    outp.close();
                }
            } catch (IOException ioe) {
                System.out.println("gagal");
            }
        }
    }
}