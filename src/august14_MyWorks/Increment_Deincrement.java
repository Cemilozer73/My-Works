package august14_MyWorks;

public class Increment_Deincrement {
    public static void main(String[] args) {
        /*
        Bir sayisal degeri artirmak/azaltmak istedigimizde şu yontemler kullanilir.
        sayi variable' tanimlanmıs olsun.
        sayi++;
         */
        int sayi = 100;
        sayi++;// sayi degeri 1 artirilir.
        System.out.println(sayi);//101
        sayi+=1;// sayi degeri bir artirilir ve yeni deger sayiya atanir
        System.out.println(sayi);//102
        sayi+=98; // sayi degeri esitligin sagindaki deger kadar artirilir ve yeni deger sayiya atanir.
        System.out.println(sayi);//200

        sayi--;//sayi degeri 1 azaltilir.
        System.out.println(sayi); //199
        sayi-=1;//sayi degeri 1 azaltilir.Yeni deger sayiya atanir
        System.out.println(sayi); //198
        sayi-=98;//sayi degeri esitligin sagindaki deger kadar azaltilir ve yeni deger sayiya atanir.
        System.out.println(sayi); //100
    }
}
