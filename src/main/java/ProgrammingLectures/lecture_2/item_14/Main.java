package ProgrammingLectures.lecture_2.item_14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Kovantonlenko on 11/2/2015.
 */
public class Main {
    public static void main(String[] args) {

        String line = "This order was placed for QT 3 ! OK?";
        String pattern = "(.*)(\\d)(.*)";

        Pattern r = Pattern.compile(pattern);

        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group());
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
            System.out.println("Found value: " + m.group(3));
        } else {
            System.out.println("NO MATCH");
        }
//        System.out.printf("%1$+020.10f", Math.PI);
    }

}
