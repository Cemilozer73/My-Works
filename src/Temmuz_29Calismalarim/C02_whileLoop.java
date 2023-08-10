package Temmuz_29Calismalarim;

import java.util.Scanner;

public class C02_whileLoop {
    public static void main(String[] args) {

        /*
        Soru: Kullanicidan alinan 3 basamakli sayilar alip,
              11 ile bölünebilen pozitif tamsayilar oldugunu yazdiirin
         */

        Scanner scanner;
        System.out.println("Lütfen 3 basamakli tamsayi giriniz");

        int sayi =103;

        while(sayi>=100 && sayi<1000){ // while loop body true oldugu muddetce çalışacak
                                       // istegimiz yerine gelecektir
            scanner= new Scanner(System.in);
            sayi= scanner.nextInt();
            if (sayi>=1000 || sayi < 100){
                System.out.println("Sayi 3 basamakli degildir");
            } else {
                if(sayi %11==0){
                    System.out.println("11 ile tam bolunebilen sayi");
                }else {
                    System.out.println("11 ile bolunemez");
                }
            }
            sayi++;
        }

    }
}
