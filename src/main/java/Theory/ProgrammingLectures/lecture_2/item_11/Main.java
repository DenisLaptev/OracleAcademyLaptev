package Theory.ProgrammingLectures.lecture_2.item_11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Kovantonlenko on 11/2/2015.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(test("trololo.com"));     //true
        System.out.println(test("trololo.ua "));     //false
        System.out.println(test("trololo.ua"));      //true
        System.out.println(test("trololo/ua"));      //false
        System.out.println(test("i love java because it is cool.ru"));      //true
        System.out.println(test("BACON.ru"));        //true
        System.out.println(test("BACON.de"));        //false
    }

    public static boolean test(String testString) {
        Pattern p = Pattern.compile(".+\\.(com|ua|ru)");
        Matcher m = p.matcher(testString);
        return m.matches();
    }
}
