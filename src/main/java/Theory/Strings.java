package Theory;

import java.util.StringTokenizer;

/**
 * Created by lapte on 30.05.2016.
 */
public class Strings {
    public static void main(String[] args) {

        // String is the immutable class.
        String str1 = "Hello!";
        System.out.println(str1);
        System.out.println(str1.replace('e', 'i'));
        System.out.println(str1);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        //Разбиение строк.
        String myPhoneNumber = "(+3)8-093-1816482";
        System.out.println(myPhoneNumber);
        String[] byDigit = myPhoneNumber.split("-");
        System.out.println("Operator's code is " + byDigit[1]);
        // Operator's code is 093
        System.out.println("Phone number without code " + byDigit[2]);
        // Phone number without code 1816482
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        //Пример использования метода regionMatches()
        String str = "Hello my world";
        String findMe = "my";
        System.out.println(str.regionMatches(6, findMe, 0, findMe.length()));
        // выведет "true", здесь мы явно определили позицию поиска 6
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        //Класс String Tokenizer
        String str0 = "This string need to split, \n by spaces and commas";
        System.out.println("Initial text:");
        System.out.println(str0);
        StringTokenizer st = new StringTokenizer(str0);
        // по умолчанию происходит разделение по \t\n\r\f
        System.out.println("---- Split by space ------");
        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }
        System.out.println("---- Split by comma ',' ------");
        StringTokenizer st2 = new StringTokenizer(str0, ",");
        while (st2.hasMoreElements()) {
            System.out.println(st2.nextElement());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");






        /*

                                            Создание Таблицы
        Использование String.format.
        В случае, если нет необходимости выводить отформатированную строку,
        а нужно просто ее сохранить для дальнейшего использования
        (например, для записи в лог или базу данных) следует использовать
        метод format из класса String.
        Принципы форматирования в этом случае абсолютно такие же,
        как у описанного выше printf, но этот метод вместо вывода строки
        сохраняет ее как отформатированную строку.
        Пример использования:
        */
        String s = String.format("Курс валют: %-4s%-8.4f %-4s%-8.4f", "USD", 58.4643, "EUR", 63.3695);

        String moneyTableFormat = "%-5s%-11s%-25s%-11s%n";
        System.out.printf(moneyTableFormat, "Код", "За единиц", "Валюты", "Рублей РФ");
        System.out.println("----------------------------------------");
        System.out.printf(moneyTableFormat, "AUD", 1, "Австралийский доллар", 44.9883);
        System.out.printf(moneyTableFormat, "GBP", 1, "Фунт стерлингов", 86.8429);
        System.out.printf(moneyTableFormat, "BYR", 10000, "Белорусский рубль", 39.7716);
        System.out.printf(moneyTableFormat, "DKK", 10, "Датская крона", 84.9192);
        System.out.printf(moneyTableFormat, "USD", 1, "Доллар США", 58.4643);
        System.out.printf(moneyTableFormat, "EUR", 1, "Евро", 63.3695);
        System.out.printf(moneyTableFormat, "KZT", 100, "Казахский тенге", 31.4654);

        /*
        Вывод
        Код     За единиц   Валюты                  Рублей РФ
        -----------------------------------------------------
        AUD     1           Австралийский доллар    44.9883
        GBP     1           Фунт стерлингов         86.8429
        BYR     10000       Белорусский рубль       39.7716
        DKK     10          Датская крона           84.9192
        USD     1           Доллар США              58.4643
        EUR     1           Евро                    63.3695
        KZT     100         Казахский тенге         31.4654
        */

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

    /*
    System.out.printf(String format, Object... args);

    %[флаги][ширина][.точность]спецификатор_типа_данных

    % — специальный символ, обозначающий начало инструкций форматирования.

    [argument_index$] - целое десятичное число, указывающее позицию аргумента
     в списке аргументов. Ссылка на первый аргумент "1$",
     ссылка на второй аргумент "2$" и т.д.
     Не является обязательной частью инструкции.
     Если позиция не задана, то аргументы должны находиться в том же порядке,
     что и ссылки на них в строке форматирования.

    [flags] — специальные символы для форматирования. Например, флаг "+"означает,
    что числовое значение должно включать знак +, флаг "-" означает выравнивание
    результата по левому краю, флаг «,» устанавливает разделитель тысяч у целых чисел.
    Не является обязательной частью инструкции.

    [width] — положительное целое десятичное число, которое определяет минимальное
    количество символов, которые будут выведены.
    Не является обязательной частью инструкции.

    [.precision] — не отрицательное целое десятичное число с точкойперед ним.
    Обычно используется для ограничения количества символов.
    Специфика поведения зависит от вида преобразования.
    Не является обязательной частью инструкции.

    conversion — это символ, указывающий, как аргумент должен быть отформатирован.
    Например d для целых чисел, s для строк, f для чисел с плавающей точкой.
    Является обязательной частью инструкции.



    Пример (вывод на экран числа pi).
    System.out.printf("%1$+020.10f", Math.PI);
    То вывод будет следующий:
    +00000003,1415926536

     f — указывает на то, что выводим число с плавающей точкой.
     .10 — выведенное число будет содержать 10 знаков после запятой.
     20 — всего выведенное число будет иметь ширину в 20 символов
     +0 — недостающие (до 20-ти) символы будут заполнены нулями,
    перед числом будет указан знак (+)
     1$ — данный формат применяется к первому аргументу,
    который находится после строки форматирования.
    В данном примере это было указывать не обязательно.

    */

