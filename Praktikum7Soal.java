import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Praktikum7Soal {
    public static List<String> daftarfilm = new ArrayList<String>();
    public static Map<String, String> filmMap = new HashMap<String, String>();
    public static Scanner answer = new Scanner (System.in);
    public static boolean cek = true;
    public static void main(String[] args) {
        if (cek){
            System.out.println("\nDaftar Kosong. Silahkan menambahkan film");
            getAll();
        }
        String pilihan = answer.nextLine();
        if (pilihan.equals("a")){
            add();
            getAll();
        } else if (pilihan.equals("d")){
            getInfo(answer.nextInt() - 1);
            getAll();
        } else if (pilihan.equals("r")){
            daftarfilm.remove(answer.nextInt() - 1);
            getAll();
        } else if (pilihan.equals("s")){
            searchdaftar();
            getAll();
        }
        cek = false;
        main(args);
    }
    public static void getAll(){
        for (int i = 0; i < daftarfilm.size(); i++){
            System.out.println((i + 1) + "." + daftarfilm.get(i));
        }
        System.out.println("(d)detail (s)search (a)add (r)remove");
    }
    public static void add(){
        System.out.print("Judul :");
        String judul = answer.nextLine();
        daftarfilm.add(judul);
        System.out.print("Rilis :");
        String info = answer.nextLine() + "@";
        System.out.print("Durasi :");
        info += answer.nextLine() + "@";
        System.out.print("Genre :");
        info += answer.nextLine() + "@";
        System.out.print("Sinopsis :");
        info += answer.nextLine() + "@";
        System.out.print("Cast :");
        info += answer.nextLine() + "@";
        filmMap.put(judul, info);
    }
    public static void getInfo(int i){
        String judul = daftarfilm.get(i);
        String[] info = filmMap.get(judul).split("@");
        System.out.println("Judul    : " + judul);
        System.out.println("Rilis    : " + info[0]);
        System.out.println("Durasi   : " + info[1]);
        System.out.println("Genre    : " + info[2]);
        System.out.println("Sinopsis : " + info[3]);
        System.out.println("Cast     : " + info[4]);
    }
    public static void searchdaftar(){
        boolean ditemukan;
        String kata = answer.nextLine();
        for (int i =0; i < daftarfilm.size(); i++){
            String text = daftarfilm.get(i);
            ditemukan = text.contains(kata);
            if (ditemukan){
                System.out.println((i + 1) + "." + daftarfilm.get(i));
            }
        }
    }
}
