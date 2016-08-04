package Theory.ProgrammingLectures.lecture_6_IO.item_3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Kovantonlenko on 11/30/2015.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//       scanerRead();
       scanerReadConsole();
    }

    private static void scanerReadConsole() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){

            System.out.println(sc.next());
        }
    }

    private static void scanerRead() throws FileNotFoundException {

         Set<String> words = new TreeSet<>();
        String fileName = "src\\main\\java\\com\\kov\\lecture_6_IO\\item_3\\tokenizingEx.txt";

        try (Scanner tokenizingScanner = new Scanner(new FileReader(fileName))) {

            tokenizingScanner.useDelimiter("\\W");

            while (tokenizingScanner.hasNext()) {
                String word = tokenizingScanner.next();
                if (!word.equals("")) {
                    words.add(word);
                }
            }
        }

        for (String word : words) {
            System.out.println(word);
        }
    }
}
