package august07_MyWorks;

public class C02 {
    public static void main(String[] args) {

        int arr[] = {1, 3, 5};
        int x = 0;
        for(int each : arr) {
            x = x + each*each;
        }
        System.out.print(x);
    }
}
