import java.io.*;
import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String fileSource = "file/" + obj.nextLine() + ".txt";
        String fileDestination = "file/" + obj.nextLine() + ".txt";
        copyFile(fileSource, fileDestination);
        obj.close();
    }

    static void copyFile(String source, String dest) {
        // use filestreaminput and filestreamoutput
        try (BufferedReader in = new BufferedReader(new FileReader(source));
                BufferedWriter out = new BufferedWriter(new FileWriter(dest))) {
            String i = null;
            while ((i = in.readLine()) != null) {
                out.write(i + "\n");
            }
            System.out.println("Berhasil");
        } catch (Exception e) {
            System.out.print("Gagal");
        }
    }
}
