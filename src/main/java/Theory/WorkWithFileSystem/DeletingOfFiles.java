package Theory.WorkWithFileSystem;

/**
 * Created by lapte on 07.07.2016.
 */

import java.io.IOException;
import java.nio.file.*;

public class DeletingOfFiles {

    public static void main(String[] args) {
        //Path pathSource = Paths.get("Вставьте сюда путь к файлу/директории для удаления");
        Path pathSource = Paths.get("C:\\Users\\lapte\\IdeaProjects\\OracleAcademyMavenProject\\src\\main\\java\\Theory\\WorkWithFileSystem\\TestFolder\\TestCopy.txt");
        try {
            Files.delete(pathSource);
            System.out.println("File deleted successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


/*

Несколько моментов, которые необходимо помнить относительно метода Files.delete():

    В случае удаления каталога, необходимо, чтобы он был пустым,
    иначе будет получено исключение (java.nio.file.DirectoryNotEmptyException)

    Если передать в данный метод символьную ссылку, то будет удалена ссылка,
    а не целевой файл.

    Для данного метода необходимо, чтобы файл существовал,
    иначе будет получено исключение (java.nio.file.NoSuchFileException).
    Если необходимо игнорировать данные случаи,
    то лучше подойдёт метод deleteIfExists(),
    который удаляет файл в случае его существования и
    не бросает подобное исключение при его отсутствии.



 */