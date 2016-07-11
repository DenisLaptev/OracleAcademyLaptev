package ProgrammingLectures.lecture_1_AdvancedClasses.item1_3;


/**
 * Created by Kovantonlenko on 07.10.2015.
 */
interface MyInterface {
    String text = "some text"; // ��� ���� �� ��������� ����� ������������ public final

    void doSomeWork(); // ����� �� ��������� ����� ����������� public abstract
}

class A implements MyInterface, Comparable {

    public void doSomeWork() { //����� ������ ���� ����������
        System.out.println("Class A has some work");
//        this.text = "can not change it!";  //���������� �������� ���� text

        MyInterface myInterface = new A();
        Comparable comparable = new A();

        myInterface.doSomeWork();

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}