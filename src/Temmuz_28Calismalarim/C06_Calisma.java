package Temmuz_28Calismalarim;

import java.util.ArrayList;

public class C06_Calisma {
    public static void main(String[] args) {

        int arr[] = new int[5];
        System.out.println(arr); //[I@2752f6e2

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= arr.length ; i++) {

            list.add(i);

        }
        System.out.println(list);

    }
}
