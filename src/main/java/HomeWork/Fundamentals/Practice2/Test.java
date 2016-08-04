package HomeWork.Fundamentals.Practice2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lapte on 18.05.2016.
 */
public class Test {

    public static void main(String[] args) {
        String str = "Some string";
        String regex = "\\d";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);


        String str1 = "Hello!";
        System.out.println(str1);
        System.out.println(str1.replace('e','i'));
        System.out.println(str1);
    }


}
