package Theory.ProgrammingLectures.lecture_1_AdvancedClasses.inner_nested_classes.inner;

/**
 * Created by Kovantonlenko on 10/30/2015.
 */
public class OuterClass {

    public int a = 10;
    private int b = 10;
    private final int c = 10;
    private static int d = 10;

    public void outerMethod(){
        InnerClass innerClass = new InnerClass();
        innerClass.innerMethod();
    }

    public void test(){
        System.out.println("test");
    }

       class InnerClass {

//        static int i; // �� �������������, �� ����� ��������� �������

        public void innerMethod() {
            System.out.println(a + b + c + d);
            OuterClass.this.test(); // ��������� � ������ ������������ ������
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.outerMethod();

        System.out.println("-----------------------");

        InnerClass innerClass = outerClass.new InnerClass();
        innerClass.innerMethod();

        System.out.println(outerClass.new InnerClass());
        System.out.println(outerClass);
    }
}

