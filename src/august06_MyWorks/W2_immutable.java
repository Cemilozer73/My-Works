package august06_MyWorks;

import java.util.ArrayList;
import java.util.List;

public class W2_immutable {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("one ");
        list.add("two");
        for(String s :list)
            System.out.print(s);
    }
}
