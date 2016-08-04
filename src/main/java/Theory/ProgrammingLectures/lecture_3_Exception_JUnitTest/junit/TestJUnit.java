package Theory.ProgrammingLectures.lecture_3_Exception_JUnitTest.junit;

/**
 * Created by Kovantonlenko on 5/30/2016.
 */
public class TestJUnit {
    public void test() {
        try {
            Thread.sleep(90);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void throwException() throws Exception {
        throw new Exception();
    }

    public int calculate(int a, int b) {
        return a + b;
    }
}
