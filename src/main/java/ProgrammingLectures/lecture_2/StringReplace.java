package ProgrammingLectures.lecture_2;

/**
 * Created by Kovantonlenko on 2/15/2016.
 */
public class StringReplace {
    public static final String TEXT = "РКЕНКаЙланд ПРаЙланд Мне очень нравится ТаЙланд. Таиланд это то место куда бы я поехал. тайланд - мечты сбываются!";

    public static void main(String[] args) {
        String s = TEXT.replaceAll("ТаЙланд|Таиланд|тайланд", "Тайланд");
//        System.out.println(TEXT);
        System.out.println(s);
//        System.out.println(TEXT.replace("ТаЙланд", "Тайланд"));

        System.out.println(TEXT.replaceAll("[а-яА-Я]{1,4}а[ийЙ]ланд","Тайланд"));
    }
}
