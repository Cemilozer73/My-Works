package Temmuz_28Calismalarim;

import java.util.ArrayList;
import java.util.List;

public class C03_Calisma {
    public static void main(String[] args) {

         List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        list3.add("Ayhan");
        list3.add(0,"Beyhan");
        List<String> list4 = new ArrayList<>();
        list4.add("Ayhan");
        list4.add("Beyhan");

        System.out.println(list1.equals(list2)); // true
        System.out.println(list1.equals(list3)); // false
        System.out.println(list3.equals(list4)); // false
        System.out.println(list4.equals(list3)); // false

        System.out.println(list3);  // [Beyhan, Ayhan]
        System.out.println(list4);  // [Ayhan, Beyhan]


    }
}
