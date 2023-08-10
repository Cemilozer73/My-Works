package Temmuz_28Calismalarim;

import java.util.ArrayList;

public class C05_Calisma {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list); // [A, B, C, D]

        for (int i = 0;i<list.size(); i++) {
            System.out.print(list.get(i)+" "); // A B C D

        }
    }
}
