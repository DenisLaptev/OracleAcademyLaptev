package ProgrammingLectures.lecture_3_Exception_JUnitTest.tryCatch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by Kovantonlenko on 5/30/2016.
 */
public class Main {
    public static void main(String[] args) {

//        Exception exception = new Exception();

     /*   try {
            test();
        } catch (FileNotFoundException e) {
            System.out.println("Catch");
        }finally {
            System.out.println("Finally");
        }*/

        test();


    }

    private static void test()  {

    /*
        try {
            InputStream stream = new FileInputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/
        System.out.println("before exception");
         throw new RuntimeException();
    }
}
