package August08_MyWork;

public class C02_StringBuilder {

    /* Soru: Asagidaki kod blogu calistiginda, konsolda hangi sonuçlar cikar?

    A. s1 = a
    B. s1 = s1
    C. s2 = s2
    D. s2 = s2b
    E. s3 = a
    F. s3 = null
    G. Kod calismaz. */


    public static StringBuilder work(StringBuilder a,
                                               StringBuilder b) {
        a = new StringBuilder("a");
        b.append("b");
        return a;
    }

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("s1");
        StringBuilder s2 = new StringBuilder("s2");
        StringBuilder s3 = work(s1, s2);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
    }
}


