import java.util.Scanner;
public class Praktikum2Soal2 {
    public static void main(String[] args) {
      Scanner answer = new Scanner (System.in);
      int pilihan = answer.nextInt();
      if (pilihan == 1){
        System.out.println("Mencari luas bangun datar");
        int bangundatar = answer.nextInt();
        if (bangundatar == 1){
            System.out.println("nilai sisi persegi : ");
            float a = answer.nextFloat();
            float luas = a * a;
            System.out.printf("luas persegi : %.1f", luas);
        }else if (bangundatar == 2){
            System.out.println("nilai panjang persegi panjang : ");
            float a = answer.nextFloat();
            System.out.println("nilai lebar persegi panjang : ");
            float b = answer.nextFloat();
            float luas = a * b;
            System.out.printf("luas persegi panjang : %.1f", luas);
        }else if (bangundatar == 3){
            System.out.println("nilai alas segitiga : ");
            float a = answer.nextFloat();
            System.out.println("nilai tinggi segitiga : ");
            float b = answer.nextFloat();
            float luas = a * b * 1/2;
            System.out.printf("luas segitiga : %.1f", luas);
        }else if (bangundatar == 4){
            System.out.println("nilai jari-jari lingkaran : ");
            float a = answer.nextFloat();
            float luas = (a * a) * 22/7;
            System.out.printf("luas lingkaran : %.1f", luas);
        }else if (bangundatar == 5){
            System.out.println("nilai alas jajar genjang : ");
            float a = answer.nextFloat();
            System.out.println("nilai tinggi jajar genjang : ");
            float b = answer.nextFloat();
            float luas = a * b;
            System.out.printf("luas jajar genjang : %.1f", luas);
        }else if (bangundatar == 6){
            System.out.println("nilai panjang sisi sejajar trapesium : ");
            float a = answer.nextFloat();
            System.out.println("nilai tinggi trapesium : ");
            float b = answer.nextFloat();
            float luas = a * b * 1/2;
            System.out.printf("luas trapesium : %.1f", luas);
        }else if (bangundatar == 7){
            System.out.println("nilai diagonal 1 belah ketupat : ");
            float a = answer.nextFloat();
            System.out.println("nilai diagonal 2 belah ketupat : ");
            float b = answer.nextFloat();
            float luas = a * b * 1/2;
            System.out.printf("luas belah ketupat : %.1f", luas);
        }else if (bangundatar == 8){
            System.out.println("nilai diagonal 1 layang-layang : ");
            float a = answer.nextFloat();
            System.out.println("nilai diagonal 2 layang-layang : ");
            float b = answer.nextFloat();
            float luas = a * b * 1/2;
            System.out.printf("luas layang-layang : %.1f", luas);
        }
      }else if (pilihan == 2){
          System.out.println("Mencari volume bangun ruang");
          int bangunruang = answer.nextInt();
          if (bangunruang == 1){
              System.out.println("nilai panjang rusuk kubus : ");
              float a = answer.nextFloat();
              float volume = a * a * a;
              System.out.printf("volume kubus : %.1f", volume);
          }else if (bangunruang == 2){
              System.out.println("nilai panjang balok : ");
              float a = answer.nextFloat();
              System.out.println("nilai lebar balok : ");
              float b = answer.nextFloat();
              System.out.println("nilai tinggi balok ");
              float c = answer.nextFloat();
              float volume = a * b * c;
              System.out.printf("volume balok : %.1f", volume);
          }else if (bangunruang == 3){
              System.out.println("nilai alas tabung : ");
              float a = answer.nextFloat();
              System.out.println("nilai tinggi tabung : ");
              float b = answer.nextFloat();
              float volume = (a * a) * b * 22/7;
              System.out.printf("volume tabung : %.1f", volume);
          }else if (bangunruang == 4){
              System.out.println("nilai luas alas prisma : ");
              float a = answer.nextFloat();
              System.out.println("nilai tinggi prisma : ");
              float b = answer.nextFloat();
              float volume = a * b;
              System.out.printf("volume prisma : %.1f", volume);
          }else if (bangunruang == 5){
              System.out.println("nilai luas alas limas : ");
              float a = answer.nextFloat();
              System.out.println("nilai tinggi limas : ");
              float b = answer.nextFloat();
              float volume = a * b * 1/2;
              System.out.printf("volume limas : %.1f", volume);
          }else if (bangunruang == 6){
              System.out.println("nilai alas kerucut : ");
              float a = answer.nextFloat();
              System.out.println("nilai tinggi kerucut : ");
              float b = answer.nextFloat();
              float volume = (a * a) * b * 1/3 * 22/7;
              System.out.printf("volume keucut : %.1f", volume);
          }else {
              System.out.println("nilai jari-jari bola : ");
              float a = answer.nextFloat();
              float volume = (a * a) * 4/3 * 22/7;
              System.out.printf("volume bola : %.1f", volume);
          }
      }
    }
    
}
