package august09_MyWorks;

public class C05 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("OCAJP8");
        System.out.println(sb1.subSequence(2, 4)); // AJ
        System.out.println(sb1.deleteCharAt(3));//OCAP8
        sb1.reverse( );
        System.out.println(sb1);//8PACO

    }
}
