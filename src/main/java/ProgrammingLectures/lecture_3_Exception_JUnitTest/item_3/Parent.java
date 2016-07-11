package ProgrammingLectures.lecture_3_Exception_JUnitTest.item_3;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Kovantonlenko on 11/6/2015.
 */
public class Parent {
    public void test() throws IOException {
        System.out.println("some parent's work");
    }
}


class Child extends Parent {
    @Override
    public void test() throws/* Exception,*/ FileNotFoundException, Error, RuntimeException{ //������ ����������, ����� ���� ���������� ������ ����������� ���������� IOException
        System.out.println("some child's work");
    }

    public static void main(String[] args) throws IOException {
        Parent parent = new Child();
        parent.test();
    }
}