package Theory.ProgrammingLectures.lecture_2.item_10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Kovantonlenko on 11/2/2015.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(test("BACON"));      //true
        System.out.println(test("BACON "));      //true
        System.out.println(test("  BACON"));    //false
        System.out.println(test("BACON  "));    //false
        System.out.println(test("^BACON$"));    //false
        System.out.println(test("bacon"));      //false


    }

    public static boolean test(String testString) {
        Pattern p = Pattern.compile("^BACON$"); // ������ ������ � ����� ������
        Matcher m = p.matcher(testString);
        return m.matches();
    }

}
