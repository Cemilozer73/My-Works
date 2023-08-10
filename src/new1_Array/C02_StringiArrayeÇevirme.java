package new1_Array;

import java.util.Arrays;

public class C02_StringiArrayeÇevirme {
    public static void main(String[] args) {



        String str= "Java cok guzel";

        // str.split(""); böyle yazdiktan sonra
        String[] kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));

        String[] harfler=str.split("");
        System.out.println(Arrays.toString(harfler));
    }
}
