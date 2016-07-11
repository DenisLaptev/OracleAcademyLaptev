package ProgrammingLectures.lecture_2.item_12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Kovantonlenko on 11/2/2015.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(test("612pizza"));   //true
        System.out.println(test("@pizza"));  //false
        System.out.println(test("pizza3"));  //false

        System.out.println(test1("-"));
        System.out.println(test1("?"));
    }

    public static boolean test(String testString) {
        Pattern p = Pattern.compile("[1-9]+[a-z]+");
        Matcher m = p.matcher(testString);
        return m.matches();
    }
    public static boolean test1(String testString) {

        Pattern p = Pattern.compile("^[a-z0-9?_-]{1,3}$");
        Matcher m = p.matcher(testString);
        return m.matches();
    }

}
