package Temmuz_28Calismalarim;

import java.util.ArrayList;
import java.util.List;

public class C02_Calisma {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Can");
        list.add("Ayse");
        list.add(0, "Havva");
        System.out.println(list);

        list.set(1,"Havva");
        System.out.println(list);



    }
}
