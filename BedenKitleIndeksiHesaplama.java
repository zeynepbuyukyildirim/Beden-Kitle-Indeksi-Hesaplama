package bedenkitleındeksihesaplama;

import java.util.Scanner;

/**
 *
 * @author Zeynep
 */
public class BedenKitleIndeksiHesaplama {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Kilonuzu giriniz: (Ornek:50,20)");
        double kilo=scan.nextDouble();
        System.out.print("Boyunuzu giriniz: (Ornek:1,72)");
        double boy=scan.nextDouble();
        
        double bki=kilo/(boy*boy);
        
        if(bki<18.5){
            System.out.println("Aşırı Zayıfsınız!");
        }
        else if(bki>18.5 && bki<24.9){
            System.out.println("Normal kilodasınız.");
        }
        else if(bki>24.9 && bki<29.9){
            System.out.println("Fazla Kilolusunuz.");
        }
        else if(bki>29.9 && bki<40){
            System.out.println("Obez!");
        }
        else{
            System.out.println("Aşırı Obez!!!!!");
        }
        
        System.out.println("Beden Kitle İndeksiniz: "+bki);
    }
    
}
