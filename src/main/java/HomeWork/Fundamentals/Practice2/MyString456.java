package HomeWork.Fundamentals.Practice2;

/*
 * 4. Из заданной строки составьте новую, в которой каждый исходный символ
 * представлен двумя, например “Candy” -> “CCaannddyy”.
 *
 * 5. Найдите все вхождения строки "b*b" (* - любой символ) в заданной строке
 * без использования регулярных выражений, например “bob is bab” -> 2 .
 *
 * 6. Создайте подстроку из исходной строки, где в каждом слове,
 * содержащем символ “*” удалены соседние левый и правый символы,
 * например “th*is is sum*mer” -> “ts is suer”.
 *
 */


public class MyString456 {

    public static String doubleSymbol (String s) {
        char [] charArray = new char [s.length()];
        char [] newCharArray = new char [2*s.length()];
        for (int i = 0; i < s.length(); i++) {
            charArray[i] = s.charAt(i);
        }
        for (int i = 0; i < s.length(); i++) {
            newCharArray[2*i] = charArray[i];
            newCharArray[2*i+1] = charArray[i];
        }
        String result = new String (newCharArray);

        return result;
    }



    public static int findSubstring (String s) {
        int result = 0;
        char [] charArray = new char [s.length()];

        for (int i = 0; i < s.length(); i++) {
            charArray[i] = s.charAt(i);
        }
        for (int i = 0; i < s.length()-2; ) {
            if ((charArray[i] == 'b' && charArray[i+2] == 'b')||
                    (charArray[i] == 'b' && charArray[i+2] == 'B')||
                    (charArray[i] == 'B' && charArray[i+2] == 'b')||
                    (charArray[i] == 'B' && charArray[i+2] == 'B')) {
                result++;
                if ((i+3)< s.length()) {
                    i += 3;
                }
                else{
                    i = s.length();
                }
            }
            else {
                i++;
            }
        }
        return result;
    }


    public static String starString (String s) {
        for (int i = 0; i < s.length(); ) {
            if (s.charAt(0) == '*') {
                s = s.substring(2);
            }
            if (s.charAt(s.length() - 2) == '*') {
                s = s.substring(0, s.length() - 3);
            }
            if (s.charAt(s.length() - 1) == '*') {
                s = s.substring(0, s.length() - 2);
            }
            for (int j = 1; j < s.length() - 2; ) {
                if (s.charAt(j) == '*') {
                    s = s.substring(0, j - 1).concat(s.substring(j + 2));
                }
            j++;
            }
            i++;
        }
        String result = s;
        return result;
    }



}
