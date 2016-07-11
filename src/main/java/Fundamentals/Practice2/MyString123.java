package Fundamentals.Practice2;

/* 1. Заданы две произвольных строки. Из этих строк создать одну объединённую без
 * первых символов в каждой из строк.
 *
 * 2. Задана строка с нечетным количеством символов. Создайте строку, состоящую из
 * 3-х символов, например: “Candy” -> “and”, “solving” -> “lvi”.
 *
 * 3. Задана строка произвольного размера. Создайте из этой строки новую,
 * в которой 2 последних символа исходной строки перенесены в начало.
 *
 */


public class MyString123 {

    public static String concatString (String s1, String s2) {
        String result = s1.substring(1).concat(s2.substring(1));
        return result;
    }




    public static String centerSymbolsString (String s) {
        String result = s;
        if(s.length()%2 != 0) {
            int center = s.length()/2;
            result = s.substring(center-1, center+2);
        }
        return result;
    }




    public static String replaceString (String s) {
        String s1 = s.substring(0,s.length()-2);
        String s2 = s.substring(s.length()-2);
        String result = s2.concat(s1);
        return result;
    }




}
