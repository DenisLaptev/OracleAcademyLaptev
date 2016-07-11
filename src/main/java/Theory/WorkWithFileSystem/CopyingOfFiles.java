package Theory.WorkWithFileSystem;

/**
 * Created by lapte on 07.07.2016.
 */

import java.io.IOException;
import java.nio.file.*;

public class CopyingOfFiles {

    /*
    Теперь рассмотрим коппирование файла/диретории.
    Для этого используем метод Files.copy().
    Сигнатура данного метода:

Path copy(Path source, Path target, CopyOption. . . options)

    Первый параметр — путь к исходному файлу,
    второй — путь к тому файлу, что будет создан в результате копирования
    (включая имя нового файла),
    далее можно задать параметры копирования,а можно и не задать.
     */


    public static void main(String[] args) {
        //Path pathSource = Paths.get("Вставьте сюда путь к файлу/директории для копирования");
        Path pathSource = Paths.get("C:\\Users\\lapte\\IdeaProjects\\OracleAcademyMavenProject\\src\\main\\java\\Theory\\WorkWithFileSystem\\Test.txt");

        //Path pathDestination = Paths.get("Вставьте сюда путь для нового файла/директории ");
        Path pathDestination = Paths.get("C:\\Users\\lapte\\IdeaProjects\\OracleAcademyMavenProject\\src\\main\\java\\Theory\\WorkWithFileSystem\\TestCopy.txt");

        try {

            /*
            После первого запуска всё должно отработать корректно
            для корректных путей. Но если данный код без изменений скомпилировать
            и выполнить повторно, то будет получено исключение
            java.nio.file.FileAlreadyExistsException.
            Оно связано с тем, что целевой файл уже существует.
            Для избежания таких проблем можно указать,
            чтобы в случае его существования он перезаписывался.
            Для этого надо немного изменить одну строку кода:

            Files.copy(pathSource, pathDestination, StandardCopyOption.REPLACE_EXISTING);

            Следует отметить, что при копировании директории не будут копироваться
            содержащиеся в ней файлы и директории.
            Это выглядит глупо — ниже будет показано, как это исправить.
             */



            //Files.copy(pathSource, pathDestination);
            Files.copy(pathSource, pathDestination, StandardCopyOption.REPLACE_EXISTING);

            System.out.println("Source file copied successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
