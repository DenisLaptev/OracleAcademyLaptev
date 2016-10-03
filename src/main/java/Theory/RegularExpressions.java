package Theory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lapte on 29.05.2016.
 */
public class RegularExpressions {
    public static void main(String[] args) {

        String text0 = "Номер телефона, магазина: 2452342542, почтовый индекс - 12345.";
        String delims = "[ ,: -.]+";
        String[] words = text0.split(delims);
        System.out.println("Исходная стока:");
        System.out.println(text0);
        System.out.println("После разбиения:");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        /*
        String str = "Some string"
        String regex = "\\d";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        */
        String text = "Номер телефона магазина: 2452342542, почтовый индекс:" +
                " 12345. Почтовый индекс института: 23473, секретный шифр: 234657686," +
                " контактный телефон: 1234567890, также мобильный: 0987654321 " +
                "или 1234567890. Звонить до 18:00.";


        String text2 = " Masha Misha\n Katja Kolja\n Dasha Danja";


        parsePostCode(text);

        System.out.println(replacePhones(text));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Исходный набор имён:");
        System.out.println(text2);
        System.out.println("Имена после преобразования:");
        parseName1(text2);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        System.out.println("Исходный набор имён:");
        System.out.println(text2);
        System.out.println("Имена после преобразования:");
        parseName2(text2);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


    }

    public static void parsePostCode(String s) {
// метод находит и печатает почтовые индексы (пятизначные наборы цифр).
        String regex = "\\b\\d{5}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }


    public static String replacePhones(String s) {
// метод находит телефонные номера (10 цифр), меняет формат
// ХХХХХХХХХХ - > (ХХХ) ХХХ-ХХ-ХХ и выводит на экран.
        String regex = "\\b(\\d{3})(\\d{3})(\\d{2})(\\d{2})\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        return matcher.replaceAll("($1) $2-$3-$4");
    }


    public static void parseName1(String s) {
// метод находит в тексте именя женщин и мужчин.
// имена женщин сохраняются в группу 1
// имена мужчин сохраняются в группу 2.

        String regex = "\\b(\\w+)\\b.+\\b(\\w+)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println("Women names: " + matcher.group(1));
            System.out.println("Men names: " + matcher.group(2));
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }


    public static void parseName2(String s) {
// метод находит в тексте именя женщин и мужчин.
// имена женщин сохраняются в группу women
// имена мужчин сохраняются в группу men.

        String regex = "\\b(?<women>\\w+)\\b.+\\b(?<men>\\w+)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println("Women names: " + matcher.group("women"));
            System.out.println("Men names: " + matcher.group("men"));
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }


    //                       Обратные ссылки

    //Круглые скобки помимо логического отделения выражений играют ещё одну роль,
    //а именно создают группы. Они полезны когда Ваше регулярное выражение
    //состоит из нескольких одинаковых частей. Тогда достаточно описать
    //один раз однотипную часть шаблона, а потом ссылаться на неё.
    static {
        Pattern p = Pattern.compile("(ведь).+(якороль).+(\\2)");
        // здесь 2 это ссылка на вторую группу "(якороль)"
        Pattern p1 = Pattern.compile("(ведь).+(якороль).+(якороль)");
        // эквивалентный паттерн
        Matcher m = p.matcher("регулярные выражения это круто регулярные " +
                "выражения это круто регулярные выражения это ведь круто " +
                "якороль ВСЕ отлично)) якороль регулярные выражения это круто");
        if (m.find()) {
            System.out.println(m.group());
            //ведь круто якороль ВСЕ отлично)) якороль
        }

    /*
        На месте первой группы (якороль) могло содержаться более сложное выражение,
        тогда обратная ссылка \\2 значительно сократила бы размер
        регулярного выражения.
        Группы нумеруются слева направо, начиная с 1.
        Каждая открывающая скобка увеличивает номер группы:
        ( ( ) )( ( ) )
        ^ ^    ^ ^
        1 2    3 4
        Нулевая группа совпадает со всей найденной подпоследовательностью.
    */
    }



   static {
       //Исходный текст разбивается на части. До числа, число, после числа.

       String line = "This order was placed for QT 3 ! OK?";
       String pattern = "(.*)(\\d+)(.*)";
       Pattern r = Pattern.compile(pattern);
       Matcher m = r.matcher(line);
       if (m.find()) {
           System.out.println("Found value: " + m.group(0));
           System.out.println("Found value: " + m.group(1));
           System.out.println("Found value: " + m.group(2));
           System.out.println("Found value: " + m.group(3));
       } else {
           System.out.println("NO MATCH");
       }
   }
       /*
       Found value: This order was placed for QT 3 ! OK?
       Found value: This order was placed for QT
       Found value: 3
       Found value: ! OK?
       */


}


