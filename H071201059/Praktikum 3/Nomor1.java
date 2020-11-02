import java.util.Scanner;

class Nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int x = input.nextInt();
            int y = input.nextInt();
            for(int i = x < y ? x : y; i <= (x < y ? y : x); i++) {
                if (i % 2 == 0 && i != 0) {
                    System.out.printf("%d%s",i, i < 0 ? " genap negatif \n" : " genap positif \n");
                } else {
                    if(i == 0) {
                        System.out.println(i+ " nol");
                    }else {
                        System.out.printf("%d%s",i, i < 0 ? " ganjil negatif \n" : " ganjil positif \n");
                    }
                }
            }      
    }
}