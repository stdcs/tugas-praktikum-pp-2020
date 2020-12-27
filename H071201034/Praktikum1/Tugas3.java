import java.util.Scanner;

class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Masukkan tinggi menara [enter] sudut elevasi ujung belakang kapal [enter] sudut elevasi ujung depan kapal");
        double h = input.nextDouble();
        double a = input.nextDouble();
        double b = input.nextDouble();

        double p = h * Math.tan(Math.toRadians(a));
        double q = h * Math.tan(Math.toRadians(b));
        double r = (p - q);

        System.out.printf("Masukkan Panjang kapal : %.1fm", r);
        
    } 
}