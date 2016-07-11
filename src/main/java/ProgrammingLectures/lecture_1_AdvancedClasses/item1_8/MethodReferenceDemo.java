/*
package ProgrammingLectures.lecture_1_AdvancedClasses.item1_8;

public class MethodReferenceDemo {

    public static void main(String[] args) {

 */
/*       print("test", new FuncForLambda() {
            @Override
            public int f(int x, String s) {

                return MethodReferenceDemo.cube(3, "anonymous");
            }
        });*//*


        print("test", MethodReferenceDemo::cube);
       */
/* print("test", MethodReferenceDemo::cube2);

        System.out.println("-----------------");

        int cube = MethodReferenceDemo.cube(2, "");
        System.out.println(cube);*//*

    }

    static void print(String str, FuncForLambda func)
    {
        System.out.println(str + " " + func.f(3, "lambda"));
    }

    static int cube(int x, String s) {
        System.out.println(s);
        return x + x;
    }

    static int cube2(int x, String s) {
        System.out.println(s);
        return x * x;
    }
}

interface FuncForLambda {
    int f(int x, String s);
}*/
