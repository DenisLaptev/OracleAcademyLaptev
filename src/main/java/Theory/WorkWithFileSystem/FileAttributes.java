package Theory.WorkWithFileSystem;

/**
 * Created by lapte on 07.07.2016.
 */

import java.io.IOException;
import java.nio.file.*;

public class FileAttributes {

    public static void main(String[] args) {
        //Path path = Paths.get("Вставьте сюда путь к какому-либо файлу");
        Path path = Paths.get("C:\\Users\\lapte\\IdeaProjects\\OracleAcademyMavenProject\\src\\main\\java\\Theory\\WorkWithFileSystem\\Test.txt");
        try {
            Object object = Files.getAttribute(path, "creationTime");
            System.out.println("Creation time: " + object);

            //Здесь указан третий параметр
            object = Files.getAttribute(path, "lastModifiedTime", LinkOption.NOFOLLOW_LINKS);
            System.out.println("Last modified time: " + object);

            object = Files.getAttribute(path, "size");
            System.out.println("Size: " + object);

            object = Files.getAttribute(path, "isDirectory");
            System.out.println("isDirectory: " + object);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
