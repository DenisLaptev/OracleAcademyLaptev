/*
package Theory.ProgrammingLectures.lecture_1_AdvancedClasses.item1_7;

*/
/**
 * Created by Kovantonlenko on 10/29/2015.
 *//*

public class Main {
    public static void main(String[] args) {

     */
/*   SomeInt someInt = new Child();
        doSome(someInt);*//*


       */
/* doSome(new SomeInt() {
            @Override
            public int f(int x) {
                return x * x;
            }
        });*//*


        SomeInt func = k -> k * k;
        doSome(func);

        doSome(k -> k * k );

    }

    public static void doSome(SomeInt someInt) {
        System.out.println(someInt.f(3));
    }
}

interface SomeInt {
    int f(int x);
//    int f1(String x, int t);
}

class Child implements SomeInt {

    @Override
    public int f(int x) {
        return x * x;
    }
}*/
