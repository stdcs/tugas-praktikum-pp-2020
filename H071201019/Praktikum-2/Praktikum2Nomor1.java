import java.util.Scanner;

public class Praktikum2Nomor1 {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                int A = 0;
                int B = 0;
                int C = 0;
                int D = 0;
                int E = 0;
                boolean isInputValid = false;

                try {
                        System.out.println("Masukkan 5 Angka!");
                        A = input.nextInt();
                        B = input.nextInt();
                        C = input.nextInt();
                        D = input.nextInt();
                        E = input.nextInt();

                        int ganjil = 0;
                        int genap = 0;
                        int positif = 0;
                        int negatif = 0;

                        // =========== A
                        if (A % 2 == 0) {
                                genap++;
                        } else {
                                ganjil++;
                        }
                        if (A > 0) {
                                positif++;
                        } else if (A < 0) {
                                negatif++;
                        }
                        // =========== B
                        if (B % 2 == 0) {
                                genap++;
                        } else {
                                ganjil++;
                        }
                        if (B > 0) {
                                positif++;
                        } else if (B < 0) {
                                negatif++;
                        }
                        // =========== C
                        if (C % 2 == 0) {
                                genap++;
                        } else {
                                ganjil++;
                        }
                        if (C > 0) {
                                positif++;
                        } else if (C < 0) {
                                negatif++;
                        }
                        // =========== D
                        if (D % 2 == 0) {
                                genap++;
                        } else {
                                ganjil++;
                        }
                        if (D > 0) {
                                positif++;
                        } else if (D < 0) {
                                negatif++;
                        }
                        // ========== E
                        if (E % 2 == 0) {
                                genap++;
                        } else {
                                ganjil++;
                        }
                        if (E > 0) {
                                positif++;
                        } else if (E < 0) {
                                negatif++;
                        }

                        System.out.println(genap + "  Angka Genap");
                        System.out.println(ganjil + "  Angka Ganjil");
                        System.out.println(positif + "  Angka Positif");
                        System.out.println(negatif + "  Angka Negatif");

                } catch (Exception e) {
                        System.out.println(" Inputan tidak Valid! ");
                }
        }
}