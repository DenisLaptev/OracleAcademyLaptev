package Theory.WorkWithFileSystem;

/**
 * Created by lapte on 07.07.2016.
 */

import java.nio.file.*;

public class ReadableWriteableExecutable {

    public static void main(String[] args) {
        //Path path = Paths.get("Вставьте сюда путь к какому-либо файлу");
        Path path = Paths.get("C:\\Users\\lapte\\IdeaProjects\\OracleAcademyMavenProject\\src\\main\\java\\Theory\\WorkWithFileSystem\\Test.txt");
        System.out.printf("Readable: %b, Writable: %b, Executable: %b ",
                Files.isReadable(path), Files.isWritable(path),Files.isExecutable(path));
    }
}
