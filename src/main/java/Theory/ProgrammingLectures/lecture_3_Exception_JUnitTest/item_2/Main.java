package Theory.ProgrammingLectures.lecture_3_Exception_JUnitTest.item_2;


import Theory.ProgrammingLectures.lecture_3_Exception_JUnitTest.item_3.Parent;

/**
 * Created by Kovantonlenko on 11/6/2015.
 */
public class Main {
    public static void main(String[] args) throws Exception {
//        exTest1();
//        exTest2();
        exTest3();

        Parent parent;
    }

    public static void exTest1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            throw e;
        }
    }

    public static void exTest2() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("NPE"); // ������������
        } catch (Exception e) {
            System.out.println("Exception"); // �� ������������
        }
    }

    public static void exTest3() {
        try {
            try {
                throw new Exception();
            } catch (Exception e) {
                throw new Exception();
            }
        } catch (Exception e) {

            System.out.println("Outer catch");
            throw new RuntimeException();

        } catch (Throwable th) {
            System.out.println("Throwable");
        }
    }
}
