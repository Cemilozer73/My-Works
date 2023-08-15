package august15_MyWorks;

import java.util.ArrayList;
import java.util.List;

public class ArrayListe {
    public static void main(String[] args) {
        /*
        Verilen bir array icinde tekrar eden elementleri bulun
        tekrar edeni silin ve her bir elemani unique yapin bu arrayi döndüren bir method olusturun
        arr={3,1,2,4,1,2,3,4,5,10,2,7}
         */

        int[] arr={3,1,2,4,1,2,3,4,5,10,2,7};
        System.out.println("Tekrarsız array: "+tekrarlariSil(arr));

    }

    public static List<Integer> tekrarlariSil(int[] arr) {
        List<Integer> duzenliarr= new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!(duzenliarr.contains(arr[i]))){
                duzenliarr.add(arr[i]);
            }

        }

        return duzenliarr;
    }
}
