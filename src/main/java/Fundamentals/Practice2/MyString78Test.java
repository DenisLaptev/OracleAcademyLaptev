package Fundamentals.Practice2;

import static Fundamentals.Practice2.MyString78.deleteString;
import static Fundamentals.Practice2.MyString78.wordsCount;

/**
 * Created by lapte on 16.05.2016.
 */
public class MyString78Test {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~Test for 7th task~~~~~~~~~~");
        String s71 = "Candy a tyga hdcus a";
        String s72 = "ShopS bduda bbkca A bcdS";
        int result71 = wordsCount(s71);
        int result72 = wordsCount(s72);
        System.out.println("Result for String: " + s71 + ": " + result71);
        System.out.println("Result for String: " + s72 + ": " + result72);


        System.out.println("~~~~~~~~~Test for 8th task~~~~~~~~~~");
        String s81 = "CandyshopCandyshopCandyCandy ";
        String s82 = "Candy";

        String s83 = "CandyshopCandyshop";
        String s84 = "Candy";

        String result81 = deleteString(s81, s82);
        String result82 = deleteString(s83, s84);
        System.out.println("Result for Strings " + s81 + " and " + s82 + ": " + result81);
        System.out.println("Result for Strings " + s83 + " and " + s84 + ": " + result82);

    }
}
