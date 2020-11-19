import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int panjang = input.nextInt();
        int[] arr = new int[panjang];
        
        for ( int i = 0; i < arr.length; i++){
            arr[i] =  input.nextInt();
        }

        int i, j;
        int n = panjang - 1;
        for ( i = 0; i < arr.length; i++) {
            for ( j = 1 + i; j <= n; j++) {                                                                                       
                if (arr[i] % arr[j] != 0 && arr[j] % arr[i] !=0){
                     System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
