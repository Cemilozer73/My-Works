package new2_Sayac;

public class C01_JavadaSayac {
    public static void main(String[] args) {
       /*
            Java'da sayaç yöntemi, bir döngü içinde belirli bir değeri belirli aralıklarla artırmak
        veya azaltmak için kullanılan bir yaklaşımdır. Bu yöntem, genellikle tekrar eden  işlemleri
        takip etmek, belirli koşulların gerçekleşmesini saymak veya belirli bir süre boyunca bir iş-
        lemi yürütmek için kullanılır.
        */

        //Basit Örnek Soru:
        // 1'den 10'a kadar olan sayıları ekrana yazdırın.

        // Başlangıç değeri olarak 1'i kullanalım

        int sayac = 1;

        // while döngüsü, sayaç 10'dan küçük veya eşit olduğu sürece çalışır

        while (sayac <= 10) {

            System.out.println("Sayaç Değeri: " + sayac);

            // Sayaç değerini bir artırarak bir sonraki sayıya geçiyoruz

            sayac++;
        }

        System.out.println("Döngü Bitti!");
    }
}
