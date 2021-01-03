import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

class Nanda3 {
    public static void main(String[] args) {
        Scanner nardi = new Scanner(System.in);
        FileWriter f = null;
        PrintWriter p = null;

        try{
            System.out.print("Nama file = ");
            String file = nardi.nextLine() + ".txt";
            ArrayList<String> nama = new ArrayList<>();
            ArrayList<String> nim = new ArrayList<>();
            ArrayList<String> angkatan = new ArrayList<>();

            System.out.print("input jumlah asistensi  =");
            int numberAssistance = nardi.nextInt();
            nardi.nextLine();

            for (int i = 0; i < numberAssistance; i++) {
                System.out.print("Nama = ");
                nama.add(nardi.nextLine());

                System.out.print("Nim = ");
                nim.add(nardi.nextLine());

                System.out.print("Angkatan = ");
                angkatan.add(nardi.nextLine());
            }

            f = new FileWriter (file);
            p = new PrintWriter(f);

            p.printf("+--------------------------------+--------------------+-----------+\n");
            p.printf("|NAMA                            |NIM                 |ANGKATAN   |\n");
            p.printf("+--------------------------------+--------------------+-----------+\n");
            
            for (int j = 0; j < numberAssistance; j++) {    
                p.printf("| %-30s | %-18s | %-8s  |\n", nama.get(j), nim.get(j), angkatan.get(j));
            }
            p.printf("+--------------------------------+--------------------+-----------+\n");

        } catch (IOException ioe){
            System.out.println("Gagal");
        } finally {
            try {
                if (p != null) {
                    System.out.println("Berhasil");
                    p.close();
                } 
                if (f != null) {
                    f.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
} 
    

