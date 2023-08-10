package Temmuz_28Calismalarim;

import java.util.ArrayList;

public class C04_Calisma {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list); // [A, B, C, D]

        System.out.println(list.remove(2 )); // C

        System.out.println(list); // [A, B, D]

        System.out.println(list.remove("C")); // false

        System.out.println(list); // [A, B, D]
    }
}
