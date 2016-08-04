package HomeWork.Fundamentals.Practice2;

import static HomeWork.Fundamentals.Practice2.MyString123.centerSymbolsString;
import static HomeWork.Fundamentals.Practice2.MyString123.concatString;
import static HomeWork.Fundamentals.Practice2.MyString123.replaceString;

/**
 * Created by lapte on 16.05.2016.
 */
public class MyString123Test {
    public static void main(String[] args) {

        System.out.println("~~~~~~~~~Test for 1st task~~~~~~~~~~");
        String s1 = "Candy";
        String s2 = "Shop";
        String result1 = concatString(s1, s2);
        System.out.println("Result for Strings " + s1 + " and " + s2 + ": " + result1);


        System.out.println("~~~~~~~~~Test for 2nd task~~~~~~~~~~");
        String s3 = "Candy";
        String result2 = centerSymbolsString(s3);
        System.out.println("Result for String " + s3 + ": " + result2);


        System.out.println("~~~~~~~~~Test for 3rd task~~~~~~~~~~");
        String s4 = "Candy";
        String result3 = replaceString(s4);
        System.out.println("Result for String " + s4 + ": " + result3);


    }
}
