import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Nomor1 {
    public static List<String> judul = new ArrayList<String>();
    public static List<String> rilis = new ArrayList<String>();
    public static List<String> durasi = new ArrayList<String>();
    public static List<String> genre = new ArrayList<String>();
    public static List<String> sinopsis = new ArrayList<String>();
    public static List<String> cast = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        judul.add("Avengers : End Game");
        rilis.add("24 April 2019");
        durasi.add("3 jam 2 menit");
        genre.add("Laga , fiksi/ilmiah");
        sinopsis.add("ini adalah sinopsis");
        cast.add("Chris Evans, Chris Hemsworth, Robert Downey Jr.");
        judul.add("Spiderman : far from home");
        rilis.add("3 Juli 2019");
        durasi.add("2 jam 13 menit");
        genre.add("Laga/Petualangan");
        sinopsis.add("ini adalah sinopsis");
        cast.add("Ton Holland, Zendaya, Jake Gylenhaal");
        judul.add("Venom");
        rilis.add("3 Oktober 2018");
        durasi.add("2 jam 20 menit");
        genre.add("Laga/Fiksi Ilmiah");
        sinopsis.add("ini adalah sinopsis");
        cast.add("Tom Hardy, Michelle Williams, Woody Harrelson, Riz Ahmed");
        judul.add("Thor : Ragnarok");
        rilis.add("25 Oktober 2017");
        durasi.add("2 jam 10 menit");
        genre.add("Laga, fiksi Ilmiah");
        sinopsis.add("ini adalah sinopsis");
        cast.add("Chris Hemsworth, Cate Blanchett, Tom Hiddeleston, Tessa Thompson");
        show();
        while (obj.hasNext()) {
            char select = obj.next().charAt(0);
            switch (select) {
                case 'd':
                    int number = obj.nextInt();
                    detail(number);
                    break;
                case 'r':
                    int x = obj.nextInt();
                    remove(x);
                    show();
                    break;
                case 'a':
                    System.out.print("judul\t :");
                    tambah();
                    break;
                case 's':
                    String nama = obj.next();
                    search(nama);
            }
        }
    }

    public static void detail(int i) {
        i -= 1;
        System.out.println("judul    : " + judul.get(i));
        System.out.println("rilis    : " + rilis.get(i));
        System.out.println("durasi   : " + durasi.get(i));
        System.out.println("genre    : " + genre.get(i));
        System.out.println("sinopsis : " + sinopsis.get(i));
        System.out.println("cast     : " + cast.get(i));
        System.out.println("d(detail)\t s(search)\t r(remove)\t a(add)\t");
    }

    public static void remove(int i) {
        judul.remove(i - 1);
        for (int x = 0; x < judul.size(); x++)
            System.out.println(judul.get(x));
        System.out.println("d(detail)\t s(search)\t r(remove)\t a(add)\t");
    }

    public static void tambah() {
        Scanner scan = new Scanner(System.in);
        System.out.print(" ");
        judul.add(scan.nextLine());
        System.out.print("rilis\t :");
        rilis.add(scan.nextLine());
        System.out.print("durasi\t :");
        durasi.add(scan.nextLine());
        System.out.print("genre\t :");
        genre.add(scan.nextLine());
        System.out.print("sinopsis :");
        sinopsis.add(scan.nextLine());
        System.out.print("cast\t :");
        cast.add(scan.nextLine());
        System.out.println("d(detail)\t s(search)\t r(remove)\t a(add)\t");
    }

    public static void search(String nama) {
        for (int x = 0; x < judul.size(); x++) {
            if (judul.get(x).contains(nama)) {
                System.out.println(x + 1 + ". " + judul.get(x));
            }
        }
        System.out.println("d(detail)\t s(search)\t r(remove)\t a(add)\t");
    }

    public static void show() {
        for (int x = 0; x < judul.size(); x++) {
            System.out.println(x + 1 + ". " + judul.get(x));
        }
        System.out.println("d(detail)\t s(search)\t r(remove)\t a(add)\t");
    }
}
