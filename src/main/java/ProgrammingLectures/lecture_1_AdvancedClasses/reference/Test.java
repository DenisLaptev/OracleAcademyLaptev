package ProgrammingLectures.lecture_1_AdvancedClasses.reference;



/**
 * Created by Kovantonlenko on 2/11/2016.
 */
public class Test {

    public static void main(String[] args) {
        int i = 100;
        int[] arr = {1, 2, 3, 4, 5};
        test(i, arr);
        System.out.println(i);
        System.out.println(arr[1]);
    }

    public static void test(int a, int[] arr1) {
        a = 10;
        arr1[1] = a;
    }
}
