import java.io.*;
import java.util.Scanner;
class Nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FileInputStream in = null;
        FileOutputStream out = null;
        File checkedInput = null;
        try {
            String input1 = input.nextLine();
            String input2 = input.nextLine();
            input.close();
            in = new FileInputStream(String.format("%s.txt", input1));
            out = new FileOutputStream(String.format("%s.txt", input2));
            checkedInput = new File(String.format("%s.txt", input1));
            int read;
            while ((read = in.read()) != -1) {
                out.write(read);
            }
            if (checkedInput.exists()) {
                System.out.println("berhasil");
            } 
        } catch (IOException e) {
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
                System.out.println(e.getMessage());
            }
        }
    }
}