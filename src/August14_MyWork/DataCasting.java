package August14_MyWork;

import java.util.Scanner;

public class DataCasting {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz: ");
        char harf = scan.next().charAt(0);
        System.out.println("Girdiginiz harften sonra gelen harfler sırasıyla: "+((char)(harf+1)));
    }
}
