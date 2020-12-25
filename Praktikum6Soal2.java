import java.util.Scanner;
public class Praktikum6Soal2 {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        String x = answer.nextLine();
        String y = new String();
            for (int i = 0; i < x.length(); i++){
                if (i % 2 == 0){
                    y += (x.charAt(i));
                } else {
                    y += (int)(x.charAt(i));
                }
            }
            int count = 0;
            for (int i = 0; i < 4; i++){
                for (int j = 0; j < 4; j++){
                    for (int k = 0; k < Math.ceil((double) y.length() / 16); k++){
                        if (count < y.length()){
                            System.out.print(y.charAt(count));
                            count++;
                        } else {
                        System.out.print("?");
                    }
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
