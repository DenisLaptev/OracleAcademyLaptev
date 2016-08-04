package Theory.ProgrammingLectures.lecture_3_Exception_JUnitTest.item_4;

import java.io.IOException;

class Main {
    public static void main(String[] args) {
        Parent parent = new Child();
        try {
            parent.test();
           /* try {
                parent.test();
            }catch (RuntimeException re){
                throw new Throwable(re);
            }*/
        } catch (Throwable e) {
            System.out.println(e); // java.lang.RuntimeException: java.io.IOException
            System.out.println(e.getCause()); // java.lang.RuntimeException: java.io.IOException
        }
    }
}

public class Parent {
    public void test() {
        System.out.println("some parent's work");
    }
}


class Child extends Parent {
    @Override
    public void test() throws RuntimeException { //������ ����������, ����� ���� ���������� ������ ����������� ���������� IOException
        System.out.println("some child's work");
        try {
            IOException ioException =  new IOException();
            throw ioException;

        } catch (IOException e) {
            /*some code*/
//            System.out.println(e.getCause());
            throw new RuntimeException(e);
        }
    }
}