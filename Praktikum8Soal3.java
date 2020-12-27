import java.io.*;
import java.util.Scanner;
public class Praktikum8Soal3 {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        FileReader FR = null;
        BufferedReader BR = null;
        FileWriter FW = null;
        PrintWriter PW = null;
        try {
            String namafile = answer.nextLine();
            int jumlahAsisten = answer.nextInt();
            answer.nextLine();
            String [] nama = new String[jumlahAsisten];
            String [] nim = new String[jumlahAsisten];
            String [] angkatan = new String[jumlahAsisten];
            for (int i = 0; i < jumlahAsisten; i++){
                nama[i] = answer.nextLine();
                nim[i] = answer.nextLine();
                angkatan[i] = answer.nextLine();
                }
                FW = new FileWriter(namafile + ".txt");
                PW = new PrintWriter(FW);
                PW.println("+====================+===========+=========+");
                PW.println("|Nama                |NIM        |Angkatan |");
                PW.println("+====================+===========+=========+");
                for (int i = 0; i < jumlahAsisten; i++){
                    PW.printf("|%-20s|%-11s|%-9s|\n", nama[i], nim[i], angkatan[i]);
                }
                PW.printf("+====================+===========+=========+");
                System.out.println("Berhasil");
            } catch (IOException e){
                System.out.println("Gagal");
            } finally {
                try {
                    if (BR != null){
                        BR.close();
                    }
                    if (FR != null){
                        FR.close();
                    }
                    if (PW != null){
                        PW.close();
                    }
                } catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }