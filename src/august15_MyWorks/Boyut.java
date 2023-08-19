package august15_MyWorks;
import java.util.Scanner;
public class Boyut {

    public static void main(String[] args) {
        /*
 sistem kullanıcıya kahvenin "Kahveniz hangi boyutta olsun? (Ekstra boy - Büyük boy - orta boy - küçük boy olarak giriniz.)
 sorusunu sorsun.*/

        boyutSorgula();
    }

    public static void boyutSorgula() {
        String kahveBoyutu;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Kahveniz hangi boyutta olsun? (Ekstra boy - Büyük boy - orta boy - küçük boy olarak giriniz.)");
            kahveBoyutu = scan.nextLine();

            if (!kahveBoyutu.equalsIgnoreCase("ekstra boy") &&
                    !kahveBoyutu.equalsIgnoreCase("büyük boy") &&
                    !kahveBoyutu.equalsIgnoreCase("orta boy") &&
                    !kahveBoyutu.equalsIgnoreCase("kücük boy"))
                System.out.println("Hatalı giriş yaptınız....");

        } while (!kahveBoyutu.equalsIgnoreCase("ekstra boy") &&
                !kahveBoyutu.equalsIgnoreCase("büyük boy") &&
                !kahveBoyutu.equalsIgnoreCase("orta boy") &&
                !kahveBoyutu.equalsIgnoreCase("kücük boy"));


       /* Bu method, kullanıcıya kahve boyutunu girmesini isteyecektir. Kullanıcı yanlış bir giriş yaparsa,
       hata mesajı göstererek tekrar girmesini sağlar.

       do-while döngüsü: Bu döngü, kullanıcının doğru bir giriş yapana kadar kahve boyutunu girmesine izin verir.
       Döngü içeriğindeki işlemler en az bir kez çalışacaktır.

        System.out.println(...): Kullanıcıya hangi boyutları girebileceğini açıklayan bir mesaj görüntüler.

        Scanner scan = new Scanner(System.in): Kullanıcıdan giriş almak için Scanner sınıfından bir örnek oluşturur.

        kahveBoyutu = scan.nextLine(): Kullanıcıdan bir satır girdisi alır ve bu girdiyi kahveBoyutu adlı değişkende saklar.

        if koşulu: Kullanıcının girdisi, beklenen boyutlardan biriyle eşleşmiyorsa, hata mesajı görüntüler.

        /*
        Bu kod bloğu, kullanıcının girdiği kahve boyutunu kontrol ederek doğru bir boyut girene kadar
        bir döngü içinde kalmasını sağlıyor. İfade, kullanıcının girdisi "ekstra boy", "büyük boy", "orta boy"
        veya "küçük boy" olmadığı sürece döngünün devam etmesini ifade eder.

Döngü mantığı şu şekildedir:

Kullanıcıya kahve boyutunu girmesi istenir.
Kullanıcının girdisi, "ekstra boy", "büyük boy", "orta boy" veya "küçük boy" olmadığı sürece
(veya bu boyutlarla büyük-küçük harf duyarlılığına bakılmaksızın eşleşmediği sürece) hata mesajı verilir
ve kullanıcıdan tekrar giriş istenir.Eğer kullanıcının girdisi bu boyutlardan biriyle eşleşirse,
yani "ekstra boy", "büyük boy", "orta boy" veya "küçük boy" ise, döngü sona erer ve program kullanıcının
doğru bir kahve boyutu girdiğini kabul eder.

Bu sayede kullanıcıya doğru giriş yapana kadar tekrar tekrar giriş yapma şansı verilir.
Yanlış giriş yaptığında hata mesajı görüntülenir ve kullanıcı yeniden giriş yapmaya zorlanır.


        Bu program kullanıcının belirli boyutları girmesini bekler ve geçerli bir boyut girilene kadar kullanıcıya
        hata mesajlarıyla rehberlik eder.
    */
    }
}
