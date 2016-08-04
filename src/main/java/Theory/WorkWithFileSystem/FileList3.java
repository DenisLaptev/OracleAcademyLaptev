package Theory.WorkWithFileSystem;

/**
 * Created by lapte on 07.07.2016.
 */

import java.io.IOException;
import java.nio.file.attribute.*;
import java.nio.file.*;
import java.util.ArrayList;

public class FileList3 {

    public static void main(String[] args) {
        String adress = "C:\\Users\\lapte\\IdeaProjects\\OracleAcademyMavenProject\\src\\main\\java\\HomeWork.Programming.Practice1";

        try {
            Files.walkFileTree(Paths.get(adress), new SimpleFileVisitor<Path>() {

                public FileVisitResult visitFile(Path path, BasicFileAttributes attribs) {

                    System.out.println(path.toAbsolutePath());
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}
