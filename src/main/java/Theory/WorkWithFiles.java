package Theory;

import java.io.*;

/**
 * Created by lapte on 02.06.2016.
 */



/*
Запись файлов и класс FileOutputStream
Класс FileOutputStream предназначен для записи байтов в файл.
Он является производным от класса OutputStream,
поэтому наследует всю его функциональность.
Например, запишем в файл строку:
*/
public class WorkWithFiles {

    public static void main(String[] args) {

        String text = "Hello world!"; // строка для записи
        try (FileOutputStream fos =
                     new FileOutputStream("D:\\Java\\OracleAcademy\\" +
                             "J Programming\\WorkWithFilesExample.txt")) {
            // перевод строки в байты
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
