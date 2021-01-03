import java.util.InputMismatchException;
import java.util.Scanner;
class Nardi1 {
    public static void main(String[]args){
        Scanner nardi = new Scanner (System.in);
        try{

        int a = nardi.nextInt();
        int b = nardi.nextInt();
        int c = nardi.nextInt();
        int d = nardi.nextInt();
        int e = nardi.nextInt();
        int genap=0;
        int ganjil=0;
        int positif=0;
        int negatif=0;
        if (a%2 ==0 ){ genap++;
            }else { ganjil++;
            }
        if (a>=0 && a !=0){ positif++;
            }else if (a<0 && a !=0){ negatif++;
        }
        if (b%2 ==0 ){ genap++;
            }else { ganjil++;
            }
        if (b>=0 && b!=0){ positif++;
            }else if (b<0 && b !=0) { negatif++;
        }
        if (c%2 ==0){ genap++;
            }else { ganjil++;
            }
        if (c>=0 && c !=0){ positif++;
            }else if (c<0 && c !=0)  { negatif++;
        }
        
        if (d%2 ==0 ){ genap++;
            }else { ganjil++;
            }
        if (d>=0 && d !=0){ positif++;
            }else if (d<0 && d!=0){ negatif++;
        }
        
        if (e%2==0){ genap++;
            }else { ganjil++;
            }
        if (e>=0 && d!=0){ positif++;
            }else if (e<0 && d !=0) { negatif++;
        }
        
        System.out.println(genap + " bilangan genap");
        System.out.println(ganjil + " bilangan ganjil");
        System.out.println(positif + " bilangan positif");
        System.out.println(negatif+ " bilangan negatif");
    }
    
catch (InputMismatchException ptrzky) {
    System.out.println("Inputan Tidak Valid");
}
    }
}