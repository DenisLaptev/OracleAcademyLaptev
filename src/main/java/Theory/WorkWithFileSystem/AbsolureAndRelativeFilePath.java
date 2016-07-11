package Theory.WorkWithFileSystem;

/**
 * Created by lapte on 07.07.2016.
 * Описание программ по работе с файловыми путями:
 * http://www.quizful.net/post/java-nio-tutorial
 *
 *
 */

import java.io.IOException;
import java.nio.file.*;

public class AbsolureAndRelativeFilePath {

    public static void main(String[] args) throws IOException {
        //Пример строки пути для запуска в LINUX (но надо указать путь с папками проекта):
        //Path testFilePath = Paths.get("./Test");

        //Пример строки пути для запуска в Windows
        Path testFilePath = Paths.get("src\\main\\java\\Theory\\WorkWithFileSystem\\TestFolder");
//Path testFilePath = Paths.get("src\\main\\java\\Theory\\WorkWithFileSystem\\Test.txt");

        System.out.println("The file name is: " + testFilePath.getFileName());
        System.out.println("It's URI is: " + testFilePath.toUri());
        System.out.println("It's absolute path is: "
                + testFilePath.toAbsolutePath());
        System.out.println("It's normalized path is: "
                + testFilePath.normalize());

        //Получение другого объекта строки по нормализованному относительному пути
        Path testPathNormalized = Paths
                .get(testFilePath.normalize().toString());
        System.out.println("It's normalized absolute path is: "
                + testPathNormalized.toAbsolutePath());
        System.out.println("It's normalized real path is: "
                + testFilePath.toRealPath(LinkOption.NOFOLLOW_LINKS));
    }

}
