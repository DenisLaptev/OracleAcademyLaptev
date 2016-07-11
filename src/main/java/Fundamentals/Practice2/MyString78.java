package Fundamentals.Practice2;
/*
 * 7.  В заданной строке подсчитайте количество слов, заканчивающихся на ‘a’ или ‘s’,
 * без учета регистра символов.
 *
 * 8. Заданы две строки. Создайте новую строку, состоящую из первой строки,
 * в которой удалены все вхождения второй строки.
 *
 *
 *
 */


public class MyString78 {
    public static int wordsCount (String s) {
        int result = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if ((s.charAt(i) == 'a' && s.charAt(i + 1) == ' ') ||
                    (s.charAt(i) == 'A' && s.charAt(i + 1) == ' ') ||
                    (s.charAt(i) == 's' && s.charAt(i + 1) == ' ') ||
                    (s.charAt(i) == 'S' && s.charAt(i + 1) == ' ')) {
                result++;
            }
        }
        if ((s.charAt(s.length()-1) == 'a') ||
                (s.charAt(s.length()-1) == 'A' ) ||
                (s.charAt(s.length()-1) == 's' ) ||
                (s.charAt(s.length()-1) == 'S' )) {
            result ++;
        }
        return result;
    }



    public static String deleteString (String bigString, String smalString) {
        /*
        String result = bigString;
        String str = bigString;
        for (int i = 0; i <= bigString.length()-smalString.length(); i++) {
            if (bigString.charAt(i) == smalString.charAt(0)) {
                str = bigString.substring(i,i+smalString.length());
                if(str.equals(smalString)){
                    result = bigString.substring(0,i).concat(bigString.substring(i+smalString.length()));
                    //i+=s2.length();
                }
            }
        }
        return result;

        */
        String newBigString = bigString;
        for (int i = 0; i <= newBigString.length()-smalString.length(); ) {
            if (newBigString.substring(i,i+smalString.length()).equals(smalString)) {
                newBigString = newBigString.substring(0,i).concat(newBigString.substring(i+smalString.length()));
            }
            else {
                i++;
            }
        }
        return newBigString;
    }







}
