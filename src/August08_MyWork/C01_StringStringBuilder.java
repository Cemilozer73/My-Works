package August08_MyWork;

public class C01_StringStringBuilder {

    public static void main(String[] args) {

        String str = "Ali";

        System.out.println(str.toUpperCase());  // ALİ : Methodun buyuk harfe çevrilmesi kalici olmaz.

        System.out.println(str.substring(1,2)); // l : Yine atama yapilmadigi icin degisiklik kalici olmaz.

        System.out.println(str); // Ali :String immutable'dır atama yapilmaz ise ilk halini korur, değişmez.

        str =  "Ali Kemal Can"; // Atama yapmis olduk
        System.out.println(str);

        System.out.println("------------------------------------");
        System.out.println("------------------------------------");

        StringBuilder sb1 = new StringBuilder("Ali"); // Mutable oldugu icin StringBuilder'de yapilan her
                                                     // degisiklik kalici olacaktir.

        System.out.println(sb1.append(" Can")); // Ali Can
        // append StringBuider ifadenin sonuna birsey eklememizi saglıyordu.

        System.out.println(sb1);
        //Mutable oldugu icin StringBuilder'de append methoduyla yapilan degisikligin kalici oldugunu gorduk.


    }
}
