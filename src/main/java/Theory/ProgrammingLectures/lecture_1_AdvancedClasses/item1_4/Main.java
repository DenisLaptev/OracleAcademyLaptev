package Theory.ProgrammingLectures.lecture_1_AdvancedClasses.item1_4;

/**
 * Created by Kovantonlenko on 10/29/2015.
 */
public class Main {
    public static void main(String[] args) {
        String s = "hello";
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s.substring(2));
        System.out.println(s);
    }
}

class FinalExplanation {

    // �������������������

    {
        System.out.println("test");
        ref2 = "create";
    }

    //    public final String ref1 ; // ������ ����������, ���������� ������ ����
    public final String ref2; // ������ �������������, ����������
    //������������������� ���� � �����


    public final String ref3 = "A"; // ���������� �� ����� �������� ����
    // �������������������!

    public final void doSomething() { // ����� �� ����� ���� �������������!
    }

}