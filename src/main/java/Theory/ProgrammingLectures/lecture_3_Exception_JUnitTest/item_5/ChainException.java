package Theory.ProgrammingLectures.lecture_3_Exception_JUnitTest.item_5;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Kovantonlenko on 11/6/2015.
 */
public class ChainException {
    public static void main(String[] args) {
        try {
            exChain();
        } catch (FileNotFoundException e) {
            System.out.println("Top level Exception " + e);
            System.out.println("Original exception " + e.getCause());
        }
    }

    private static void exChain() throws FileNotFoundException {
        FileNotFoundException ex = new FileNotFoundException("My File Not Found Exception");
        ex.initCause(new IOException("My IOException"));

        throw ex;
    }
}
