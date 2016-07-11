package ProgrammingLectures.lecture_1_AdvancedClasses.item1_5;

/**
 * Created by Kovantonlenko on 10/29/2015.
 */
public class Main {
    public static void main(String[] args) {

        StaticExplanation.ref1 = "hello";

        StaticExplanation explanation1 = new StaticExplanation();
        StaticExplanation explanation2 = new StaticExplanation();

        explanation1.ref2 = "explanation1";
        explanation2.ref2 = "explanation2";


        System.out.println(explanation1.ref2);
        System.out.println(explanation2.ref2);
        System.out.println(StaticExplanation.ref1);
        StaticExplanation.ref1 = "hello world";
        System.out.println(StaticExplanation.ref1);
    }
}

class StaticExplanation {

    /*public static StaticExplanation() { // ������ ����������, �����������
        // �� ����� ���� ���������
    }*/

    static String ref1 = "A"; // ���������������� � ������ �������,
    // ����������� ������, � �� �������.

    String ref2 = "B";

    public static void someMethod() { // ����� ���� ������������ �� ��
        //���������������� � ������� �����������.

       /* System.out.println(ref2); // ������ ����������, ������ ���������� ��
        //������� � ���������*/
    }
}

