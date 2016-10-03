package HomeWork.Programming.Practice2.JUNIT_Calculator2;

import junit.framework.*;
import org.junit.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lapte on 14.08.2016.
 */
public class ArrayProdTest {
    @BeforeClass
    public static void messageStart(){
        System.out.println("Start of the ArrayProdTest"+"\n");
    }

    @AfterClass
    public static void messageFinish(){
        System.out.println("Finish of the ArrayProdTest");
    }


    @Before
    public void messageBeforeTest(){
        System.out.println("Before testing a method of the ArrayProdTest");
    }

    @After
    public void messageAfterTest(){
        System.out.println("After testing a method of the ArrayProdTest");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }


    @Test
    public void testProd() throws Exception {
        double [] numbersArray = {10,20,30,40,50};
        double actual = ArrayProd.prod(numbersArray);
        double expected = 1;
        for (int i = 0; i < numbersArray.length; i++) {
            expected *= numbersArray[i];
        }
        System.out.println("Testing the static method of the ArrayProdTest");
        System.out.println("expected = " + expected + "\n" + "actual = " + actual);
        junit.framework.Assert.assertEquals("When test failed", expected, actual, 0.001);

    }

    @Test(expected = MyNewException.class)
    public void testProdForNull() throws Exception {
        double [] numbersArray = null;
        ArrayProd.prod(numbersArray);
        System.out.println("Testing the static method of the ArrayProdTest with null argument");
    }


}