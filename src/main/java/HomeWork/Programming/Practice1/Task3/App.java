package HomeWork.Programming.Practice1.Task3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lapte on 02.06.2016.
 */
public class App {
    //Метод, считывающий из файла порядковый номер
    public static ArrayList<Integer> getCountFromFile(String addressOfFile) throws IOException {
        ArrayList<Integer> count = new ArrayList<Integer>();
        int i = 0;
        String str = new String(Files.readAllBytes(Paths.get(addressOfFile)));
        String regex = "\\b\\d+</td><td>(?<men>\\w+)\\b\\b</td><td>(?<women>\\w+)\\b</td>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            i++;
            count.add(i);
        }
        return count;
    }


    //Метод, считывающий из файла имя девочки
    public static ArrayList<String> getWomenFromFile(String addressOfFile) throws IOException {
        ArrayList<String> women = new ArrayList<String>();
        String str = new String(Files.readAllBytes(Paths.get(addressOfFile)));
        String regex = "\\b\\d+</td><td>(?<men>\\w+)\\b\\b</td><td>(?<women>\\w+)\\b</td>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            women.add(matcher.group("women"));
        }
        return women;
    }


    //Метод, считывающий из файла имя мальчика
    public static ArrayList<String> getMenFromFile(String addressOfFile) throws IOException {
        ArrayList<String> men = new ArrayList<String>();
        String str = new String(Files.readAllBytes(Paths.get(addressOfFile)));
        String regex = "\\b\\d+</td><td>(?<men>\\w+)\\b\\b</td><td>(?<women>\\w+)\\b</td>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            men.add(matcher.group("men"));
        }
        return men;
    }


    public static void main(String[] args) throws IOException {
        String myAddress = "D:\\Java\\OracleAcademy\\J HomeWork.Programming\\Практика\\Практическое занятие 1\\baby2008.html";

        ArrayList<Integer> myCount;
        ArrayList<String> myWomen;
        ArrayList<String> myMen;

        myCount = getCountFromFile(myAddress);
        myWomen = getWomenFromFile(myAddress);
        myMen = getMenFromFile(myAddress);

        //Создаём объект, в который запишем все данные.
        Task3Table names = new Task3Table(myCount, myWomen, myMen);

        //Вывод содержимого оббъекта names типа Task3Table на экран.
        String TableFormat = "%-10s%-25s%-25s%n";
        System.out.printf(TableFormat, "Номер", "Имя девочки", "Имя мальчика");
        System.out.println("--------------------------------------------------------");
        System.out.println(names);

/*********************************************************************************/

        //Запишем строку в некоторый файл
        String text = "Hello world!"; // строка для записи
        String AddressOFTheNewFile = "D:\\Java\\OracleAcademy\\J HomeWork.Programming\\Практика\\Практическое занятие 1\\newFile.txt";

        try (FileOutputStream fos = new FileOutputStream(AddressOFTheNewFile)) {
            // перевод строки в байты
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }


/*********************************************************************************/


        //Запишем содержимое объекта в файл
        String namesText = names.toString();
        String AddressOFTheNamesFile = "D:\\Java\\OracleAcademy\\J HomeWork.Programming\\Практика\\Практическое занятие 1\\namesFile.txt";

        try (FileOutputStream fos = new FileOutputStream(AddressOFTheNamesFile)) {
            // перевод строки в байты
            byte[] buffer = namesText.getBytes();

            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }












    }
}
