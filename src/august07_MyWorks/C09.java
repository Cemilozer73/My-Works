package august07_MyWorks;

public class C09 {
    public static void main(String[] args) {
        //3-Problem: En Küçük ve En Büyük Elemanları Bulan Metot
        // Verilen bir int türünden oluşan bir dizinin en küçük ve
        // en büyük elemanlarını bulan bir metot oluşturun.

        int[] array = { 5, 11, 8, 2, 9, 1 };
        int[] result = findMinMax(array);

        System.out.println("En küçük eleman: " + result[0]);
        System.out.println("En büyük eleman: " + result[1]);
    }

    public static int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Dizi boş veya null olamaz");
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] result = { min, max };
        return result;
    }
}
