package august22_MyWorks;

public class Soru_2 {
    public static void main(String[] args) {

        // Soru: Asagidaki Java program parçacığı çalıştırıldıktan sonra konsolda ekran çıktısı ne olur?

        int [] sayilar = {5, -9, 8, 1, 0, -3};
        int toplam = 0;
        for (int i : sayilar) {
            toplam += i; }
        System.out.println(toplam);
    }
}
