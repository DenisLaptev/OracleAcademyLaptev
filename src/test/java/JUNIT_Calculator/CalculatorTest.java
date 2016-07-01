package JUNIT_Calculator;

import Practice2.JUNIT_Calculator.Calculator;
import junit.framework.Assert;
import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by lapte on 22.06.2016.
 */
public class CalculatorTest {

    //Метод, помеченный @Before будет выполняться
    //перед выполнением каждого теста в классе.


    //Метод, помеченный @After запускается
    //после выполнения каждого теста.

    @BeforeClass
    public static void messageStart(){
        System.out.println("Start of the TestClass");
    }

    @AfterClass
    public static void messageFinish(){
        System.out.println("Finish of the TestClass");
    }

    @Before
    public void messageBeforeTest(){
        System.out.println("Before testing a method");
    }

    @After
    public void messageAfterTest(){
        System.out.println("After testing a method");
    }


    /*Если ожидаем, что метод выкинет исключение:
     @Test(expected = UserException.class)

     */


    @Test
    public void testSum(){
        int actual1 = Calculator.sum(2, 3);
        int expected1 = 5;
        Assert.assertEquals("Test for method sum()", expected1, actual1, 0.001);
    }

    @Test
    public void testSqrt(){
        double actual = Calculator.sqrt(4);
        double expected = 2;
        Assert.assertEquals("Test for method sqrt()", expected, actual, 0.001);
    }


    @Test
    public void testDifference() {
        double actual = Calculator.difference(4,9);
        double expected = -5;
        Assert.assertEquals("Test for method difference()", expected, actual, 0.001);

    }

    @Test
    public void testDivision() throws Exception {
        double actual = Calculator.division(8,4);
        double expected = 2;
        Assert.assertEquals("Test for method division()", expected, actual, 0.001);

    }
}