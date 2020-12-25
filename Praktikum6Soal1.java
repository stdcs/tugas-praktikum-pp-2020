import java.util.Scanner;
public class Praktikum6Soal1 {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        String word = answer.nextLine().toUpperCase();
        System.out.print("#" + hexadecimal(word) + palindrom(word) + octal(word));
        char hexChar = String.valueOf(hexadecimal(word)).charAt(0);
        if (hexChar >= 'a' && hexChar <= 'z'){
            System.out.println("?");
        } else {
            System.out.println("!");
        }
    }
    static String halfword(String x){
        String newWord = x.replaceAll(" ", "");
        int wordlength = newWord.length()/2;
        newWord = newWord.substring(0, wordlength);
        return newWord;
    }
    static String palindrom(String x){
        String word = halfword(x);
        String palindrome = "";
        for (int i = word.length() - 2; i >= 0; i--){
            palindrome += word.charAt(i);
        }
        String newWord = word.concat(palindrome);
        return newWord;
    }
    static String hexadecimal(String x){
        int wordlength = x.length();
        int decimal = wordlength * wordlength;
        String hexa = String.format("%x", decimal);
        return hexa;
    }
    static String octal(String x){
        int wordlength = x.length();
        String octal = String.format("%o", wordlength);
        return octal;
    }
}
