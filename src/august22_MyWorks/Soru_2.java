package august22_MyWorks;

public class Soru_2 {
    public static void main(String[] args) {

        // Soru: Asagidaki Java program parçacığı çalıştırıldıktan sonra konsolda ekran çıktısı ne olur?

        int [] arr = {5, -9, 8, 1, 0, -3};
        int toplam = 0;
        for (int i : arr) {
            toplam += i; }
        System.out.println(toplam);
    }
}
