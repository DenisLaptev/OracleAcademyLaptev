package Theory.ProgrammingLectures.lecture_1_AdvancedClasses.static_nested;

/**
 * Created by Kovantonlenko on 5/19/2016.
 */
public class OuterClass {
    public int a = 10;
    private int b = 10;
    private final int c = 10;
    private static int d = 10;
    private static final int e = 10;

    public void outerMethod() {
        InnerClass innerClass = new InnerClass();
        innerClass.innerMethod();
    }

    static class InnerClass {
        static int s;
        int ss;
        final int sss = 100;

        public void innerMethod() { //
        // System.out.println(a); //�� ������������� //
        // System.out.println(b); //�� ������������� //
        // System.out.println(c); //�� �������������
        // System.out.println(d);
        // System.out.println(e);
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.outerMethod();
        System.out.println("----------------------");
        InnerClass innerClass = new InnerClass();
        innerClass.innerMethod();
    }
}

