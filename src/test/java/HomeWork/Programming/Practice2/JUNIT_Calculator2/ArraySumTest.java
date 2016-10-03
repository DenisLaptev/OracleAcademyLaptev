package HomeWork.Programming.Practice2.JUNIT_Calculator2;

import junit.framework.Assert;
import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by lapte on 14.08.2016.
 */
public class ArraySumTest {


    @BeforeClass
    public static void messageStart(){
        System.out.println("Start of the ArraySumTest"+"\n");
    }

    @AfterClass
    public static void messageFinish(){
        System.out.println("Finish of the ArraySumTest");
    }


    @Before
    public void messageBeforeTest(){
        System.out.println("Before testing a method of the ArraySumTest");
    }

    @After
    public void messageAfterTest(){
        System.out.println("After testing a method of the ArraySumTest");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }


    @Test
    public void testSum() throws Exception {
        double [] numbersArray = {10,20,30,40,50};
        double actual = ArraySum.sum(numbersArray);
        double expected = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            expected += numbersArray[i];
        }
        System.out.println("Testing the static method");
        System.out.println("expected = " + expected + "\n" + "actual = " + actual);
        Assert.assertEquals("Test for method division()", expected, actual, 0.001);
    }

    @Test(expected = MyNewException.class)
    public void testSumForNull() throws Exception {
        double [] numbersArray = null;
        ArraySum.sum(numbersArray);
        System.out.println("Testing the static method of the ArraySumTest with null argument");
    }

    @Test
    public void testSum1() throws Exception {
        double [] numbersArray = {10,20,30,40,50};
        ArraySum as = new ArraySum(numbersArray);
       double actual = as.sum(numbersArray);
        double expected = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            expected += numbersArray[i];
        }
        System.out.println("Testing the instance method of the ArraySumTest");
        System.out.println("expected = " + expected + "\n" + "actual = " + actual);
        Assert.assertEquals("When test failed", expected, actual, 0.001);

    }
}