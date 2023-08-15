package august15_MyWorks;

import java.util.Scanner;

public class BolmeMethodu {
    public static void main(String[] args) {
        // Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
        // kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bölünecek sayiyi giriniz: ");
        int bolunen = scan.nextInt();
        System.out.println("Lütfen kaca boleceginizi giriniz: ");
        int bolen = scan.nextInt();
        int sayac=0;

        while (bolunen>=bolen){
            bolunen-=bolen;
            sayac++;// Bölünenin icinde kac tane bölen oldugunu gosterir.
        }
        System.out.println("Kalan Sayi: "+bolunen);
        System.out.println("Bolum: "+sayac);

    }
}
