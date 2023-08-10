package new2_Sayac;

import java.util.Scanner;

public class C02_SayacliSayiToplama {
    public static void main(String[] args) {

        //Soru:1'den başlamak üzere kullanıcıdan alınan sayıya kadar olan sayıları toplayın.

        Scanner scanner = new Scanner(System.in);

        System.out.print("1'den hangi sayıya kadar olan sayıları toplamak istersiniz? ");
        int hedefSayi = scanner.nextInt();

        /*
            Kullanıcıdan hedefSayi olarak adlandırdığımız bir değişkene kaç adet sayının
        toplanacağını girmesini istiyoruz. Daha sonra, while döngüsü kullanarak
        1'den hedefSayi'ye kadar olan sayıları topluyoruz.

            Döngü içinde, her adımda sayaç değerini ( örnek için 1'den başlayarak)
        toplam değerine ekliyoruz. Ardından, sayaç değerini bir artırarak bir
        sonraki sayıya geçiyoruz. Bu işlem, hedef sayıya kadar (hedef sayi dahil) olan
        tüm sayılar toplanana kadar devam ediyor.
         */
        int sayac = 1; // Sayaç değeri
        int toplam = 0; // Toplam değeri

        while (sayac <= hedefSayi) {
            // Her adımda sayaç değerini toplam değerine ekliyoruz
            toplam += sayac;

            // Sayaç değerini bir artırarak bir sonraki sayıya geçiyoruz
            sayac++;
        }

        System.out.println("1'den " + hedefSayi + " kadar olan sayıların toplamı: " + toplam);

    }
}
