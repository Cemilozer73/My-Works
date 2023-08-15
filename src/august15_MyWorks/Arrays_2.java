package august15_MyWorks;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_2 {
    Scanner scan=new Scanner(System.in);
    /*
   Kullanicidan array'in boyutunu ve elemanlarini alip array'i olusturan ve bize döndüren bir method olusturun.
    */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayOlustur()));

    }
        public static int[] arrayOlustur(){
        Scanner scan=new Scanner(System.in);
        System.out.print(" Lütfen olusturulacak array'in boyutunu giriniz: ");
        int length = scan.nextInt();
        int [] array = new int[length]; /* array'in boyutunu belirledik ve simdi tek tek
                                        donguye girecegiz elemani alacak basa donecek */
        for (int i = 0; i < length; i++) { //0'dan baslayacak length'e kadar gidecek ve herbir
                                     // döngüde array icin tamsayi olan bir eleman girilecek
            System.out.println("Array icin tamsayi olan bir eleman giriniz: ");
            array[i]=scan.nextInt();

        }

    return array;




    }


}
