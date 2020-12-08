import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class P8Nomor3 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    String fileName = "file/" + obj.nextLine() + ".txt";
    write(fileName); 
    obj.close();
  }

  // method untuk menyusun data
  static void write(String test) {
    File source = new File(test);
    if (!source.exists()) {
      writeData(test);
    } else {
      appendData(test);
    }
  }

  // method untuk membuat data
  static String addData(boolean append) {
    Scanner asd = new Scanner(System.in);
    String d = asd.nextLine();
    int data = Integer.parseInt(d);
    String[] nama = new String[data];
    String[] nim = new String[data];
    int[] angkatan = new int[data];
    String loop = "";
    for (int i = 0; i < data; i++) {
      nama[i] = asd.nextLine();
      nim[i] = asd.nextLine();
      String number = asd.nextLine();
      angkatan[i] = Integer.parseInt(number);
   // pengkondisian apabila file sudah ada/tidak
      if (append) {
          loop += i != (data - 1) ? 
           String.format("| %-25s | %-10s | %-8s |\n", nama[i], nim[i], angkatan[i]) :
           String.format("| %-25s | %-10s | %-8s |", nama[i], nim[i], angkatan[i]); 
      } else {
          loop += String.format("| %-25s | %-10s | %-8s |\n", nama[i], nim[i], angkatan[i]); 
      }
    }
    return loop;
  }

  // method untuk membuat file dan merangkai data
  static void writeData(String source) {
    boolean append = false;
    try (BufferedWriter file = new BufferedWriter(new FileWriter(source))) {
      file.write("+---------------------------+------------+----------+\n");
      file.write(String.format("| %-25s | %-10s | %-8s |\n", "Nama", "NIM", "Angkatan"));
      file.write("+---------------------------+------------+----------+\n");
      file.write(addData(append));
      file.write("+---------------------------+------------+----------+\n"); 
      System.out.println("Berhasil");
    } catch (Exception e) {
      System.out.println("Gagal");
    }
  }

  // method untuk menambahkan data apabila file sudah ada
  static void appendData(String file) {
    boolean append = true;
    ArrayList<String> list = new ArrayList<>();
    String lines = null;
    FileWriter fileWriter = null;
    BufferedWriter path = null;
  // mengakses file
    try (BufferedReader source = new BufferedReader(new FileReader(file))) {
      fileWriter = new FileWriter(file, true);
      path = new BufferedWriter(fileWriter);
      while ((lines = source.readLine()) != null) {
        list.add(lines);
      }
  // modifikasi & menambahkan data pada file
      list.add(3, addData(append)); 
      path = new BufferedWriter(new FileWriter(file));
      for (String e : list) {
        path.write(e + "\n");
      }
      System.out.println("Berhasil");
    } catch (Exception e) {
      System.out.println("Gagal");
    } finally {
        try {
          fileWriter.close();
          path.close();
        } catch (Exception e) {
          System.out.println("Gagal");
        }
    }
  }
}
