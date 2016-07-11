package Theory.WorkWithFileSystem;

/**
 * Created by lapte on 07.07.2016.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MovingOfFiles {
    /*
    Метод для перемещения файла очень похож на метод для копирования:

Path move(Path source, Path target, CopyOption. . . options)

    Значения передаваемых параметров совпадают по смыслу.
    Пример кода отличается от кода с копированием минимально.

    Если при копировании директории содержащиеся в ней файлы и директории
    не копировались, то при её перемещении, в случае отсутствия ошибок,
    перемещается и всё содержимое.
     */

    public static void main(String[] args) {
        //Path pathSource = Paths.get("Вставьте сюда путь к файлу/директории, который надо переместить");
        Path pathSource = Paths.get("C:\\Users\\lapte\\IdeaProjects\\OracleAcademyMavenProject\\src\\main\\java\\Theory\\WorkWithFileSystem\\TestCopy.txt");

        //Path pathDestination = Paths.get("Вставьте сюда путь для нового местоположения файла/директории");
        Path pathDestination = Paths.get("C:\\Users\\lapte\\IdeaProjects\\OracleAcademyMavenProject\\src\\main\\java\\Theory\\WorkWithFileSystem\\TestFolder\\TestCopy.txt");

        try {
            Files.move(pathSource, pathDestination, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Source file moved successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
