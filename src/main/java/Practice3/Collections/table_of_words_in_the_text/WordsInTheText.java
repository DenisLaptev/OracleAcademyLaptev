package Practice3.Collections.table_of_words_in_the_text;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * Created by lapte on 16.07.2016.
 */
public class WordsInTheText {


    public static ArrayList<String> getAllWordsFromText(String addressOfTheTextFile) throws IOException {
// Метод возвращает список (ArrayList<String>) слов, из которых состоит текст.
        ArrayList<String> listOfWords = new ArrayList<>();

        String textFromFile = new String(Files.readAllBytes(Paths.get(addressOfTheTextFile)));
        String delims = "[ ,: -./ (\n)+ \r]+";
        String[] words = textFromFile.split(delims);

        System.out.println("Исходный текст:");
        System.out.println("\n");
        System.out.println(textFromFile);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Текст после разбиения:");
        System.out.println("\n");
        for (String word : words) {
            System.out.println(word);
            listOfWords.add(word);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        return listOfWords;
    }


    static HashMap<String, Integer> getTableOfWords(ArrayList<String> allWordsFromText) {
        // Метод из списка слов составляет таблицу, показывающую сколько раз
        // встречается данное слово. При этом таблица не упорядочена.
        HashMap<String, Integer> tableOfWords = new HashMap<>();
        for (String s : allWordsFromText) {
            if (!(tableOfWords.containsKey(s))) {
                tableOfWords.put(s, 1);
            } else {
                tableOfWords.put(s, tableOfWords.get(s) + 1);
            }
        }
        return tableOfWords;
    }


    static TreeMap<String, Integer> sortedTableKeysAscending(HashMap<String, Integer> tableOfWords) {
        // Метод сортирует таблицу по ключам по возрастанию. (слова по алфавиту).
        TreeMap<String, Integer> sortedByKey = new TreeMap<>(tableOfWords);
        return sortedByKey;
    }

    static NavigableMap<String, Integer> sortedTableKeysDescending(HashMap<String, Integer> tableOfWords) {
        // Метод сортирует таблицу по ключам по убыванию.
        // (слова по алфавиту в обратном порядке).
        TreeMap<String, Integer> sortedByKeyAscending = new TreeMap<>(tableOfWords);// Возрастающий порядок
        NavigableMap<String, Integer> sortedByKeyDescending;
        sortedByKeyDescending = sortedByKeyAscending.descendingMap();

        return sortedByKeyDescending;
    }


    static LinkedHashMap<String, Integer> sortedTableValuesAscending(HashMap<String, Integer> tableOfWords) {
        // Метод сортирует таблицу по значениям по возрастанию.
        // (по числу повторений слов).
        // Слова, которые встречаются одинаковое число раз, отсортированы по алфавиту.


        // Now let's sort the HashMap by values
        // there is no direct way to sort HashMap by values but you
        // can do this by writing your own comparator, which takes
        // Map.Entry object and arrange them in order increasing
        // or decreasing by values.

        Comparator<Map.Entry<String, Integer>> valueComparator = new Comparator<Map.Entry<String, Integer>>() {

            /*
            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                Integer v1 = e1.getValue();
                Integer v2 = e2.getValue();
                return v1.compareTo(v2);
            }
            */

            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                int result = 0;
                Integer v1 = e1.getValue();
                Integer v2 = e2.getValue();
                String k1 = e1.getKey();
                String k2 = e2.getKey();
                // Здесь изменён порядок операндов, по сравнению с компаратором в предыдущем методе.
                result = v1.compareTo(v2);
                if (result == 0) {
                    result = k1.compareTo(k2);
                }
                return result;
            }


        };

        // Sort method needs a List, so let's first convert Set to List in Java

        Set<Map.Entry<String, Integer>> entries = tableOfWords.entrySet();


        List<Map.Entry<String, Integer>> listOfEntries = new ArrayList<Map.Entry<String, Integer>>(entries);

        // sorting HashMap by values using comparator
        Collections.sort(listOfEntries, valueComparator);

        LinkedHashMap<String, Integer> sortedByValue = new LinkedHashMap<String, Integer>(listOfEntries.size());

        // copying entries from List to Map
        for (Map.Entry<String, Integer> entry : listOfEntries) {
            sortedByValue.put(entry.getKey(), entry.getValue());
        }
        return sortedByValue;
    }


    static LinkedHashMap<String, Integer> sortedTableValuesDescending(HashMap<String, Integer> tableOfWords) {
        // Метод сортирует таблицу по значениям по убыванию.
        // (по числу повторений слов).
        // Слова, которые встречаются одинаковое число раз, отсортированы по алфавиту.
        // МЕТОД СОВПАДАЕТ С ПРЕДЫДУЩИМ, НО В КОМПАРАТОРЕ МЕНЯЕТСЯ ПОРЯДОК ОПЕРАНДОВ.


        // Now let's sort the HashMap by values
        // there is no direct way to sort HashMap by values but you
        // can do this by writing your own comparator, which takes
        // Map.Entry object and arrange them in order increasing
        // or decreasing by values.

        Comparator<Map.Entry<String, Integer>> valueComparator = new Comparator<Map.Entry<String, Integer>>() {



            /*
            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                Integer v1 = e1.getValue();
                Integer v2 = e2.getValue();
                // Здесь изменён порядок операндов, по сравнению с компаратором в предыдущем методе.
                return v2.compareTo(v1);
            }
            */


            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                int result = 0;
                Integer v1 = e1.getValue();
                Integer v2 = e2.getValue();
                String k1 = e1.getKey();
                String k2 = e2.getKey();
                // Здесь изменён порядок операндов, по сравнению с компаратором в предыдущем методе.
                result = v2.compareTo(v1);
                if (result == 0) {
                    result = k1.compareTo(k2);
                }
                return result;
            }

        };

        // Sort method needs a List, so let's first convert Set to List in Java

        Set<Map.Entry<String, Integer>> entries = tableOfWords.entrySet();


        List<Map.Entry<String, Integer>> listOfEntries = new ArrayList<Map.Entry<String, Integer>>(entries);

        // sorting HashMap by values using comparator
        Collections.sort(listOfEntries, valueComparator);

        LinkedHashMap<String, Integer> sortedByValueDescending = new LinkedHashMap<String, Integer>(listOfEntries.size());

        // copying entries from List to Map
        for (Map.Entry<String, Integer> entry : listOfEntries) {
            sortedByValueDescending.put(entry.getKey(), entry.getValue());
        }
        return sortedByValueDescending;
    }


    static void printTable(Map<String, Integer> table) {
        // Метод распечатывает любую таблицу.
        String TableFormat = "%-35s%-35s%n";
        System.out.printf(TableFormat, "Слово из текста", "Количество повторений");
        System.out.println("--------------------------------------------------------");
        String str = "";
        for (Map.Entry entry : table.entrySet()) {
            str += String.format(TableFormat, entry.getKey(), entry.getValue() + "\n");
        }

        System.out.println(str);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }


    public static void main(String[] args) throws IOException {

        // Адрес файла, гден находится текст.
        String addressOfTheTextFile = "src\\Programming1\\Practice\\Collections\\table_of_words_in_the_text\\english text.txt";


        // Переводим тиекст в список слов.
        ArrayList<String> allWordsFromText;
        allWordsFromText = getAllWordsFromText(addressOfTheTextFile);


        // Делаем из списка слов таблицу, показывающую сколько раз
        // встречается данное слово. При этом таблица не упорядочена.
        HashMap<String, Integer> tableOfWords;
        tableOfWords = getTableOfWords(allWordsFromText);


        //Вывод содержимого tableOfWords на экран.
        System.out.println("HashMap before sorting, random order ");
        printTable(tableOfWords);


        // Сортируем по ключам по возрастанию.
        TreeMap<String, Integer> sortedByKey;
        sortedByKey = sortedTableKeysAscending(tableOfWords);


        //Вывод содержимого sortedByKey на экран.
        System.out.println("HashMap after sorting by keys in ascending order ");
        printTable(sortedByKey);


        // Сортируем по ключам по убыванию.
        NavigableMap<String, Integer> sortedByKeyDescending;
        sortedByKeyDescending = sortedTableKeysDescending(tableOfWords);


        //Вывод содержимого sortedByKey на экран.
        System.out.println("HashMap after sorting by keys in descending order ");
        printTable(sortedByKeyDescending);


        // Сортируем по значениям по возрастанию.
        LinkedHashMap<String, Integer> sortedByValue;
        sortedByValue = sortedTableValuesAscending(tableOfWords);


        //Вывод содержимого sortedByValue на экран.
        System.out.println("LinkedHashMap after sorting by values in ascending order ");
        printTable(sortedByValue);

        // Сортируем по значениям по убыванию.
        LinkedHashMap<String, Integer> sortedByValueDescending;
        sortedByValueDescending = sortedTableValuesDescending(tableOfWords);


        //Вывод содержимого sortedByValueDescending на экран.
        System.out.println("LinkedHashMap after sorting by values in descending order ");
        printTable(sortedByValueDescending);


        System.out.println("Повторный вывод отсортированной таблицы с использованием enum.");

        // Определение типа сортировки таблицы слов с использованием enum.

        SortingOfHashMap sortType = SortingOfHashMap.KEY_ASC;
        switch (sortType) {
            case KEY_ASC: {
                // Сортируем по ключам по возрастанию.
                TreeMap<String, Integer> sortedByKey1;
                sortedByKey1 = sortedTableKeysAscending(tableOfWords);


                //Вывод содержимого sortedByKey1 на экран.
                System.out.println("HashMap after sorting by keys in ascending order ");
                printTable(sortedByKey1);
                break;
            }

            case KEY_DESC: {
                // Сортируем по ключам по убыванию.
                NavigableMap<String, Integer> sortedByKeyDescending1;
                sortedByKeyDescending1 = sortedTableKeysDescending(tableOfWords);


                //Вывод содержимого sortedByKey1 на экран.
                System.out.println("HashMap after sorting by keys in descending order ");
                printTable(sortedByKeyDescending1);
                break;
            }

            case VALUE_ASC: {
                // Сортируем по значениям по возрастанию.
                LinkedHashMap<String, Integer> sortedByValue1;
                sortedByValue1 = sortedTableValuesAscending(tableOfWords);


                //Вывод содержимого sortedByValue1 на экран.
                System.out.println("LinkedHashMap after sorting by values in ascending order ");
                printTable(sortedByValue1);
                break;
            }

            case VALUE_DESC: {
                // Сортируем по значениям по убыванию.
                LinkedHashMap<String, Integer> sortedByValueDescending1;
                sortedByValueDescending1 = sortedTableValuesDescending(tableOfWords);


                //Вывод содержимого sortedByValueDescending1 на экран.
                System.out.println("LinkedHashMap after sorting by values in descending order ");
                printTable(sortedByValueDescending1);
                break;
            }

            default:
                System.out.println("Unknown type of sorting");
                break;
        }
    }
}
