import java.util.Scanner;

class Praktikum6_2{
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Input kalimat : ");
    	String str = input.nextLine();
    	String newStr = new String();
    	int count = 0;
    	if (str.length() >= 16) {
    		for(int i = 0; i < str.length(); i++){
      			if(i % 2 == 0){
        			newStr += (str.charAt(i));
      			}else{
        			newStr += (int)(str.charAt(i));
      			}
    		}
    		for(int i = 0; i < 4; i++){
      			for (int j = 0; j < 4; j++) {
        			for (int k = 0; k < Math.ceil((double)newStr.length() / 16); k++) {
          				if(count<newStr.length()){
            				System.out.print(newStr.charAt(count));
            				count++;
          				}else{
            				System.out.print("?");
          				}
        			}
        			System.out.print(" ");
      			}
      			System.out.println();
    		}
    	}else{
    		System.out.println("Jumlah karakter pada inputan tidak sesuai syarat.");
    	}
  	}
}