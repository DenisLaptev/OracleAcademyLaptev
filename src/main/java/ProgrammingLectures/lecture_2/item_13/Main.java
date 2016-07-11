package ProgrammingLectures.lecture_2.item_13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Kovantonlenko on 11/2/2015.
 */
public class Main {
    public static void main(String[] args) {
        String str = "регулярные выражения это круто регулярные выражения это круто регулярные выражения это ведь круто " +
                "якороль ВСЕ отлично)) якороль регулярные выражения это круто ";
//        Pattern p = Pattern.compile("(ведь).+(якороль).+(якороль)"); // эквивалентный паттерн
        Pattern p = Pattern.compile("(ведь).+(якороль).+(\\2)");
        Matcher m = p.matcher(str);
        if (m.find()) {
            System.out.println(m.group());
        }
    }

}
