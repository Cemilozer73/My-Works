package August08_MyWork;

public class  C02_StringBuilder {

    /* Soru: Asagidaki kod blogu calistiginda, konsolda hangi sonuçlar cikar? */


    // class adiyla ayni degil, method
    // StringBuilder döndüren work methodu
    // public static yanindaki StringBuilder return type'ı
    // StringBuilder a, StringBuilder b olmak üzere iki tane StringBuilder parametre alıyor
    // return a; olarak bir tane StringBuilder döndürüyor.

    public static StringBuilder work(StringBuilder a  ,StringBuilder b) {// 5. olarak method devrede
        a = new StringBuilder("a");
        b.append("b"); // string builder'in elementlerine bir ekleme yapiyor.
        return a; // a degeriyle birlikte return ediliyor ve s3="a" oluyor, atama yapmis oluyoruz.
    }

    public static void main(String[] args) { // 1. ilk olarak main method calisir.

        StringBuilder s1 = new StringBuilder("s1"); // 2. s1 isminde stringbuilder obje olusturulacak degeri de yine s1

        StringBuilder s2 = new StringBuilder("s2"); // 3. s2 isminde stringbuilder obje olusturulacak degeri de yine s2

        StringBuilder s3 = work(s1, s2); //4.  s3 objesi de bir islem sonucunda olusturuluyor yani work methoduna gidiyor.
                                         //work(s1, s2) karsiligi method'taki work(StringBuilder a  ,StringBuilder b)'nin
                                         // karsiligidir. s1 ve s2 StringBuilderinin degerleri gitmis oldu. "s1" ve "s2"

        System.out.println("s1 = " + s1); // s1 = s1

        System.out.println("s2 = " + s2); // s2 = s2b

        System.out.println("s3 = " + s3); // s3 = a
    }
}


   /*
    A. s1 = a
B. s1 = s1
    C. s2 = s2
D. s2 = s2b
E. s3 = a
    F. s3 = null
    G. Kod calismaz. */
