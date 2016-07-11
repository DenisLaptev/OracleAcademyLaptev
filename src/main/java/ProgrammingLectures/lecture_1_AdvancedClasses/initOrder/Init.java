package ProgrammingLectures.lecture_1_AdvancedClasses.initOrder;

/**
 * Created by Kovantonlenko on 2/11/2016.
 */
public class Init {
    public static void main(String[] args) {
        Parent p = new Child();
    }
}

class Parent {
    static {
        System.out.println("pStatic1");
    }

    private int i = test();

    {
        System.out.println("P block not static");
    }
    private int test() {
        System.out.println("Parent init var");
        return 10;
    }

    static {
        System.out.println("pStatic2");
    }

    /*
        public Parent(int i) {
            System.out.println("Pconstructor");
        }*/

    public Parent() {
        System.out.println("Pconstructor");
    }
}

class Child extends Parent {
    static {
        System.out.println("cStatic1");
    }

    private int i = test();

    private int test() {
        System.out.println("Child init var");
        return 10;
    }

    static {
        System.out.println("cStatic2");
    }

    {
        System.out.println("C block not static");
    }

  /*  public Child(int i, int i1) {
        super(i);
        i = i1;
    }*/

    public Child() {
        System.out.println("Child constructor");
    }

}

