import java.util.Scanner;

class Praktikum3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        for(int i = 1; i <= y; i++) {
            if(i % x == 0){
                System.out.println(i + " ");
            }else{
                System.out.print(i + " ");
            }
        }
    }
}