import java.util.Scanner;
public class Praktikum4Soal1 {
    public static void main(String[] args) {
    Scanner answer = new Scanner(System.in);
    int a = answer.nextInt();
    int[] x = new int[a];
    for (int i = 0; i < x.length; i++){
        x[i] = answer.nextInt();
    }
    for (int i = 0; i < a; i++){
        for (int j = i + 1; j < a; j++){
            if (x[i] % x[j] != 0 && x[j] % x[i] !=0){
                System.out.print(x[i] + " " + x[j] + "\n");
            }
        }
    }
    }
}
