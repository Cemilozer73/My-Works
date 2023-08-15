package august07_MyWorks;

public class C04 {
    public static void main(String[] args) {

        int arr[][] = { {1,2,3}, {4}, {5, 6}};
        System.out.println(arr.length); // 3

        for(int[] w : arr){
            System.out.print(w.length + " "); // 3 1 2


        }
    }
}
