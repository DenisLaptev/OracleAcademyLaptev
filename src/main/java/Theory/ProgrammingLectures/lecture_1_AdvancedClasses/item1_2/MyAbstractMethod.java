package Theory.ProgrammingLectures.lecture_1_AdvancedClasses.item1_2;

/**
 * Created by Kovantonlenko on 07.10.2015.
 */
abstract class Parent {
    public String voice;

    int i = 5;

    public Parent(String voice) {
        this.voice = voice;
    }

    public void test() {
        System.out.println("test");
    }

    public abstract void someCry(); // ��� �� ����������� ���������� �������� ����������� ���� �����
}

class LittleChild extends Parent {

    public LittleChild(String voice) {
        super(voice);
    }

    @Override
    public void someCry() {   // ������������ ���������� ������!
        System.out.println("LittleChild's voice ... " + this.voice);
    }
}

class BigChild extends Parent {
    public BigChild(String voice) {
        super(voice);
    }

    @Override
    public void someCry() { // ������������ ���������� ������!
        System.out.println("BigChild's voice ... " + this.voice);
    }

    public void test() {
        System.out.println("child");
    }
}

public class MyAbstractMethod {

    public static void main(String[] args) {

        Parent p1 = new BigChild("BLA-BLA");
        Parent p2 = new LittleChild("AGU-AGU");
        p1.someCry(); // BigChild's voice ... BLA-BLA
        p2.someCry(); // LittleChild's voice ... AGU-AGU
//        p1.test();
//        System.out.println(p1.getClass());

    }
}


