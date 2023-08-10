package Temmuz_28Calismalarim;

import java.util.ArrayList;
import java.util.List;

public class C01_Calisma {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(8);
        list.add(9);
        //list.remove(9); IndexOutOfBoundsException: Index 9 out of bounds for length 3
        // remove index le çalıstigi icin calistirildiginde 9. index sinirlarin disinda
        // oldugu icin hata Run Time Error verir.
        System.out.println(list);
    }
}
