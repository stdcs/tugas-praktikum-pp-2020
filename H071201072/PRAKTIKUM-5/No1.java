import java.util.Scanner;
class No1 {
public static void main (String[] args) {
Scanner efpebe = new Scanner(System.in);
int m = efpebe.nextInt();
int n = efpebe.nextInt();
System.out.println("FPB dari "+m+ " dan " +n+ " = " + cariFPB(m, n)); }

public static int cariFPB(int bil_a, int bil_b) {
    int  fpb = 0;

    for (int i = bil_a; i > 0; i--) {
        float bagi_a = (float) bil_a/i;
        float bagi_b = (float) bil_b/i;

        if (bagi_a == ((int) bagi_a) && bagi_b == ((int) bagi_b)) {
            fpb = i;
            break;
        }  
    }
    return fpb;
}
}