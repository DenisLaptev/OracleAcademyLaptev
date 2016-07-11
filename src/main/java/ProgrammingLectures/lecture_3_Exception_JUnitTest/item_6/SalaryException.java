package ProgrammingLectures.lecture_3_Exception_JUnitTest.item_6;

/**
 * Created by Kovantonlenko on 11/6/2015.
 */
public class SalaryException extends Exception {

    private Exception hiddenException;

    public SalaryException(String message, Exception hiddenException) {
        super(message);
        this.hiddenException = hiddenException;
    }

    public SalaryException(String message) {
        super(message);
    }

    public Exception getHiddenException() {
        return hiddenException;
    }
}

class Main {
    public static void main(String[] args) {
        try {
            salary(0);
//            salary(1);
        } catch (SalaryException e) {
            System.out.println(e.toString());
            System.out.println(e.getHiddenException());
        }
    }

    public static double salary(int coefficient) throws SalaryException {
        double res;
        try {
            res = 10 - 100 / coefficient;

            if (res < 0) {
                throw new SalaryException("negative salary");
            }
        } catch (ArithmeticException e) {
            throw new SalaryException("div by zero", e);
        }
        return 0;
    }
}