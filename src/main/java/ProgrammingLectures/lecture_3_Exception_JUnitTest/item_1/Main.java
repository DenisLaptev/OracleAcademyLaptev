package ProgrammingLectures.lecture_3_Exception_JUnitTest.item_1;

import sun.misc.REException;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by Kovantonlenko on 11/5/2015.
 */
public class Main {
    public static void main(String[] args) {

        try (MyAutoClose x = new MyAutoClose("x")) {
//            x = new MyAutoClose(""); // ������ ���������� x - final
            System.err.println("body");
//            throw new RuntimeException();
        } catch (RuntimeException e) {
//            throw new NullPointerException();
        }
    }
}

class MyAutoClose implements AutoCloseable {

    private String msg;

    public MyAutoClose(String msg) {
        this.msg = msg;
        System.err.println("new:" + msg);
    }

    public void close() {
        System.err.println("close:" + msg);
    }
}