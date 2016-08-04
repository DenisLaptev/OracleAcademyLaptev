package Practice4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Created by lapte on 20.07.2016.
 */
public class Task4 {

    public static void main(String[] args) throws IOException {
        // Адрес файла, где находится текст.
        String addressOfTheTextFile = "src\\main\\java\\Practice4\\sometext.txt";
        // Мы сохранили в переменную String textFromFile текст из файла.
        String textFromFile = new String(Files.readAllBytes(Paths.get(addressOfTheTextFile)));


        // Разобъем текст на предложения.
        //
        // Определим разделители.
        // Предложения отделяются друг от друга точками,
        // знаками восклицания или вопросительными знаками.
        String delims = "[.!?]\\s+"; // \s  пробельный символ, эквивалентно [\t\n\x0B\f\r]
        // [абв]  любое из значений в списке.
        // выражение+   1 или более раз

        // Сохраним предложения в массив строк.
        String[] sentences = textFromFile.split(delims);


        System.out.println("Исходный текст:");
        System.out.println("\n");
        System.out.println(textFromFile);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Предложения из текста:");
        System.out.println("\n");
        for (String sentence : sentences) {
            System.out.println(sentence);
            System.out.println("~~~~~~~~~~");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        // Разобъём каждое предложение в массиве предложений на слова.
        // Сохраним эти слова в массив слов.
        // Поменяем в массивах слов нулевые и посление элементы.


        // Число предложений.
        int numberOfSentences = sentences.length;
        System.out.println("Число предложений = " + numberOfSentences);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        // Символ разбиения на слова в предложениях
        // \s - пробельный символ, эквивалентно [\t\n\x0B\f\r]
        String delimsForWords = "\\s";


        String[] newSentences = new String[numberOfSentences];
        for (int i = 0; i < numberOfSentences; i++) {
            String tmp;

            String[] words = sentences[i].split(delimsForWords);

            tmp = words[0];
            words[0] = words[words.length - 1];
            words[words.length - 1] = tmp;

            newSentences[i] = words[0] + " ";
            for (int j = 1; j < words.length - 1; j++) {
                newSentences[i] += words[j] + " ";
            }
            newSentences[i] += words[words.length - 1];
        }

        // Распечатаем предложения с переставленными начальным и последним словами.
        // Добавим точки в конец каждого предложения.

        System.out.println("Предложения с переставленными начальным и последним словами:");

        for (int i = 0; i < newSentences.length; i++) {
            System.out.println(newSentences[i] + ".");
            System.out.println("~~~~~~~~~~");
        }

    }
}
