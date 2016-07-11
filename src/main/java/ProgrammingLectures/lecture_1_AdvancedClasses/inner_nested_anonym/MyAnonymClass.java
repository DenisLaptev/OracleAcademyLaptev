package ProgrammingLectures.lecture_1_AdvancedClasses.inner_nested_anonym;

/**
 * Created by Kovantonlenko on 2/11/2016.
 */

public class MyAnonymClass implements Test {

    public static void main(String[] args) {

        Test test = new MyAnonymClass();
        test.test();


        Test test1 = new Test() {
            @Override
            public void test() {
                System.out.println("test1");
            }
        };


        Test test2 = new Test() {
            @Override
            public void test() {
                System.out.println("test2");
            }
        };

        System.out.println(test1.getClass());
        System.out.println(test2.getClass());

        test1.test();
        test2.test();
    }


    @Override
    public void test() {
        System.out.println("Hello");
    }
}

interface Test {
    void test();
}

/*
class MyTest implements Test {

    @Override
    public void test() {
        System.out.println("hello myTest");
    }
}*/
