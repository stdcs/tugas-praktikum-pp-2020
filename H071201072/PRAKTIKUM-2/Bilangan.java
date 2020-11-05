import java.util.Scanner;
class Bilangan{

    public static void main(String[] args) {
        try{
        Scanner satu = new Scanner(System.in);
        int bil1 = satu.nextInt();
        int bil2 = satu.nextInt();
        int bil3 = satu.nextInt();
        int bil4 = satu.nextInt();
        int bil5 = satu.nextInt();
        int genap = 0;
        int ganjil = 0;
        int positif = 0;
        int negatif = 0;

        if (bil1%2 == 0){
            genap +=1;
        }if (bil2%2 == 0){
            genap +=1;
        }if (bil3%2 ==0){
            genap +=1;
        }if (bil4%2 == 0){
            genap +=1;
        }if (bil5%2 == 0){
            genap +=1;
        }System.out.println(genap + " Angka genap");

        if (bil1%2 !=0){
            ganjil +=1;}
        if (bil2%2 !=0){
            ganjil +=1;}
        if (bil3%2 !=0){
            ganjil +=1;}
        if (bil4%2 !=0){
            ganjil +=1;}
        if (bil5%2 !=0){
            ganjil +=1;
        }System.out.println(ganjil +" Angka ganjil");

        if (bil1>0){
            positif +=1;}
        if(bil2>0){
            positif +=1;}
        if(bil3>0){
            positif +=1;}
        if (bil4>0){
            positif +=1;}
        if (bil5>0);{
            positif +=1;
        }System.out.println(positif + " Angka positif");
           
        if (bil1<0){
            negatif +=1;}
        if(bil2<0){
            negatif +=1;}
        if(bil3<0){
            negatif +=1;}
        if (bil4<0){
            negatif +=1;}
        if (bil5<0){
            negatif +=1;
        }System.out.println(negatif +" Angka negatif");
        
            
    }catch (java.util.InputMismatchException eInputMismatchException) {
        System.out.println("Inputan tidak valid"); 
        
} 
} 
}