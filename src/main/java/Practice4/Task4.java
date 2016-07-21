package Practice4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by lapte on 20.07.2016.
 */
public class Task4 {

    public static void main(String[] args) throws IOException {
        // Адрес файла, гден находится текст.
        String addressOfTheTextFile = "src\\main\\java\\Practice4\\sometext.txt";

        String textFromFile = new String(Files.readAllBytes(Paths.get(addressOfTheTextFile)));
        String delims = "[.] ";


        String[] words = textFromFile.split(delims);


        System.out.println("Исходный текст:");
        System.out.println("\n");
        System.out.println(textFromFile);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Текст после разбиения:");
        System.out.println("\n");
        for (String word : words) {
            System.out.println(word);
            System.out.println("~~~~~~~~~~");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }
}
