package Fundamentals.Practice2;

import static Fundamentals.Practice2.MyString456.doubleSymbol;
import static Fundamentals.Practice2.MyString456.findSubstring;
import static Fundamentals.Practice2.MyString456.starString;

/**
 * Created by lapte on 16.05.2016.
 */
public class MyString456Test {
    public static void main(String[] args) {

        System.out.println("~~~~~~~~~Test for 4th task~~~~~~~~~~");
        String s4 = "Candy";
        String result4 = doubleSymbol (s4);
        System.out.println("Result for String " + s4 + ": " + result4);


        System.out.println("~~~~~~~~~Test for 5th task~~~~~~~~~~");
        String s51 = "Candy";
        String s52 = "Bobuytbeb o boB";
        String s53 = "Bobub";
        System.out.println("Result for String " + s51 + ": " + findSubstring(s51));
        System.out.println("Result for String " + s52 + ": " + findSubstring(s52));
        System.out.println("Result for String " + s53 + ": " + findSubstring(s53));



        System.out.println("~~~~~~~~~Test for 6th task~~~~~~~~~~");
        String s61 = "**dgsgd*C*an*dy*cjsdoc**";
        String s62 = "*Can*dy*cjsdo";
        String s63 = "q*dgs";
        String s64 = "jsdoc**";
        String result61 = starString(s61);
        String result62 = starString(s62);
        String result63 = starString(s63);
        String result64 = starString(s64);
        System.out.println("Result for String " + s61 + ": " + result61);
        System.out.println("Result for String " + s62 + ": " + result62);
        System.out.println("Result for String " + s63 + ": " + result63);
        System.out.println("Result for String " + s64 + ": " + result64);


    }


}
