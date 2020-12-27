import java.io.*;
import java.util.Scanner;
class Nomor3 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        try { 
            String destination = input.nextLine();
            int data = input.nextInt();
            input.nextLine();
            String[] nama = new String [data];
            String[] nim = new String [data];
            String[] angkatan = new String [data];
            for (int i = 0; i < data; i++) {
                nama[i] = input.nextLine();
                nim[i] = input.nextLine();
                angkatan[i] = input.nextLine();
            }
            input.close();
            fileWriter = new FileWriter(destination + ".txt");
            printWriter = new PrintWriter(fileWriter);
            printWriter.println("+--------------------+-----------+---------+");
            printWriter.println("|Nama                |NIM        |Angkatan |");
            printWriter.println("+--------------------+-----------+---------+");
            for (int i = 0; i < data; i++) {
                printWriter.printf("|%-20s|%-11s|%-9s|\n", nama[i], nim[i], angkatan[i]);
            }
            printWriter.println("+--------------------+-----------+---------+");
            System.out.println("Berhasil");
        } catch (IOException e) {
            System.out.println("Gagal");
        } finally {
            try {
                if (bufferedReader !=  null) {
                    bufferedReader.close();      
                }
                if (fileReader !=  null) {
                    fileReader.close();
                }
                if ( printWriter != null) {
                    printWriter.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}