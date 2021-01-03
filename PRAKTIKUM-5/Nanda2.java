//PRAKTIKUM-5
import java.util.*;

public class Nanda2 {
  public static void main(String[] args) {
    Scanner nardi = new Scanner(System.in);
    int n = nardi.nextInt();
    int m = nardi.nextInt();
    String serialNumber = generateSerial(n, m);
    System.out.println(serialNumber);

  }
  public static String generateSerial(int n,int m){
    String str = "";
    Random angka = new Random();

    for(int i = 1; i <= n; i++){
      for(int j = 1; j<= m; j++){

        int num = angka.nextInt(10);
        str += String.valueOf(num);
      }if(i == n){
        str += " ";
      }else{
        str += "-";
      }}
    return str;
  }
}