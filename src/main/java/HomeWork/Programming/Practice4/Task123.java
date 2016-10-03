package HomeWork.Programming.Practice4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lapte on 20.07.2016.
 */
public class Task123 {
    public static void createFile(String fileAddress) {
        // Метод создаёт файл.
        // Определяем файл
        File file = new File(fileAddress);

        try {
            // Проверяем, существует ли файл.
            // Если файл не существует, то создаем его
            if (!file.exists()) {
                file.createNewFile();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void writeTextToFile(String fileAddress, String text) {
        // Метод записывает текст в файл, если такого файла нет,
        // то перед этим создаёт файл.

        // Определяем файл
        File file = new File(fileAddress);

        try {
            //проверяем, что если файл не существует то создаем его
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("New file has been created!");
            }

            //PrintWriter обеспечит возможности записи в файл
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                //Записываем текст в файл
                out.println(text);
            } finally {
                //После чего мы должны закрыть файл
                //Иначе файл не запишется
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void writeRandomNumbersToFile(String fileAddress, int sizeOfList, int maxNumber) {
        // Метод записывает набор случайных чисел в файл,
        // если такого файла нет, то перед этим создаёт файл.

        //Определяем файл
        File file = new File(fileAddress);

        try {
            //проверяем, что если файл не существует то создаем его
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("New file has been created!");
            }

            //PrintWriter обеспечит возможности записи в файл
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                //Записываем в файл
                Random random = new Random();
                for (int i = 0; i < sizeOfList; i++) {
                    out.println(random.nextInt(maxNumber));
                }
            } finally {
                //После чего мы должны закрыть файл
                //Иначе файл не запишется
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static ArrayList<Integer> makeSortedNumbersList(String fileAddress) throws IOException {
        // Создаём объект ArrayList<Integer>, который будет хранить список чисел.
        // Потом мы отсортируем этот список.

        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        File file = new File(fileAddress);
        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                //В цикле построчно считываем файл
                String s;
                while ((s = in.readLine()) != null) {
                    int sNum = Integer.parseInt(s);
                    listOfNumbers.add(sNum);
                }
            } finally {
                //Также не забываем закрыть файл
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Collections.sort(listOfNumbers);
        //Возвращаем полученный текст с файла

        return listOfNumbers;
    }


    public static HashMap<String, Integer> makeHashMapFromFile(String addressOfFile) throws IOException {

        HashMap<String, Integer> table = new HashMap<String, Integer>();
        String str = new String(Files.readAllBytes(Paths.get(addressOfFile)));
        String regex = "(.*)=(.*)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        String key;
        Integer value;

        while (matcher.find()) {
            //if (matcher.find()) {

            key = matcher.group(1);
            value = Integer.parseInt(matcher.group(2));

            table.put(key, value);

        }
        return table;
    }


    public static void printStudentsWithBiggerMarks (HashMap<String, Integer> tableOfStudents, int minMark){
        System.out.println("Students with marks bigger then " + minMark + ":");
        int count = 0;
        for (Map.Entry<String, Integer> stringIntegerEntry : tableOfStudents.entrySet()) {
            if (stringIntegerEntry.getValue() > minMark){
                System.out.println(stringIntegerEntry.getKey() + " => " + stringIntegerEntry.getValue());
                count++;
            }
        }
        if (count ==0){
            System.out.println("no students.");
        }
    }












    public static void main(String[] args) throws IOException {

        // Задания 1,2.

        //String addressOfNewFileFull = "C:\\Users\\lapte\\IdeaProjects\\OracleAcademyMavenProject\\src\\main\\java\\HomeWork.Programming.Practice4\\NewTxtFile1.txt";
        //createFile(addressOfNewFileFull);
        //writeTextToFile(addressOfNewFileFull, "text1");

        // Адрес, где создаём файл.
        String addressOfNewFileRelative = "src\\main\\java\\HomeWork.Programming.Practice4\\NewTxtFile.txt";

        // Создаём файл.
        createFile(addressOfNewFileRelative);

        // Записываем в файл некоторый текст. Он сотрётся, когда мы будем записывать что-то новое в файл.
        writeTextToFile(addressOfNewFileRelative, "text");

        // Записываем в файл список случайных чисел (100 штук) от 0 до 50.
        writeRandomNumbersToFile(addressOfNewFileRelative, 100, 50);

        // Создаём объект ArrayList<Integer>, который будет хранить
        // отсортированный список чисел.
        ArrayList<Integer> sortedListOfNumbers;
        sortedListOfNumbers = makeSortedNumbersList(addressOfNewFileRelative);

        // Выводим содержимое
        // списка ArrayList<Integer> sortedListOfNumbers на экран.
        for (Integer sortedListOfNumber : sortedListOfNumbers) {
            System.out.println(sortedListOfNumber);
        }

        // Задание 3.

        // Создадим HashMap<String, Integer> myTable из содержимого
        // файла students_marks.properties.
        HashMap<String, Integer> myTable = makeHashMapFromFile("students_marks.properties");

        // Распечатаем студентов с оценками >90.
        printStudentsWithBiggerMarks (myTable, 90);
    }
}
