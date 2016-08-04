package Theory.ProgrammingLectures.lecture_3_Exception_JUnitTest.multi_catch;

/**
 * Created by Kovantonlenko on 5/30/2016.
 */
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            throw new NullPointerException();
        } catch (RuntimeException e) {
            System.out.println("catch_1");
          /*  try {
                throw new RuntimeException();
            } catch (RuntimeException e1) {
                System.out.println("inner catch");
            }*/

            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("catch_2");
        }

    }
}
