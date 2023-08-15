package august15_MyWorks;

public class Arrays_1 {
    public static void main(String[] args) {
/*
Verilen bir array'de  istenilen elemanın olup olmadığını kontrol eden
varsa kaç kere kullanıldığını yazdıran bir method oluşturunuz.
{2,3,4,5,6,7,5,8,3,5,7,5,2,5}
*/

      int [] arr={2,3,4,5,6,7,5,8,3,5,7,5,2,5}; // array listemizi oluşturduk istedigimiz elemani
                                                // bunun icinde arayan varsa kaç kere kullanilmis
                                                // bunu yazdiran bir method olusturacagiz

        istenilenElemaniAra(arr,5); // arr'nin icinde 7'yi arayan bir method basligi.

    }

    private static void istenilenElemaniAra(int[] arr, int istenen) {
        int flag=0;
        // burada bir flag kullanmamiz gerekiyor.
        // Flag'in durumuna göre de aradigimiz sonucu bulup bulmadigimiza bakariz.

        for (int i = 0; i <arr.length ; i++) { // forloop'umuz 0'dan baslayacak arr'nin length'ine kadar gidecek

            if (istenen==arr[i]){ //eger istenen eleman arr'nin i'sine eşitse flag 1 artsın
                flag++; // flag bize kac defa aynı rakam kullanilmis onu da bize getirecek.

            }

        }
            if(flag!=0){// eger flag 0'a esit degilse, yani ardigimiz rakami bulmussa
                System.out.println("Verilen array'de aradiginiz "+istenen+" elemani vardir ve "+flag+" kez kullanilmistir.");
            }else {
                System.out.println("Aradiginiz "+istenen+" elemani arrayde bulunmamaktadir.");
            }


        }
    }

