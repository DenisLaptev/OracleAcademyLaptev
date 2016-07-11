package Theory.WorkWithFileSystem;

/**
 * Created by lapte on 07.07.2016.
 */

import java.io.File;
import java.nio.file.*;
import java.util.Arrays;

public class DirectoriesAndFiles {

    public static void main(String[] args) {
        //Проверка для файла
        Path path = Paths.get("C:\\Users\\lapte\\IdeaProjects\\OracleAcademyMavenProject\\src\\main\\java\\Theory\\WorkWithFileSystem");

        //Проверка для дериктории
        //Path path = Paths.get("/home/heorhi/workspace/OCPJP/src/test");


        //String adress = "C:\\Users\\lapte\\IdeaProjects\\OracleAcademyMavenProject\\src\\main\\java\\Theory\\WorkWithFileSystem";
        //File f = new File(adress);
        //File[] files = f.listFiles();
        //System.out.println(files);
        //System.out.println(Arrays.toString(files));

        //for (int i = 0; i < files.length; i++) {
        //    System.out.println(files[i]);
        //}
        if (Files.exists(path, LinkOption.NOFOLLOW_LINKS)) {
            System.out.println("The file/directory " + path.getFileName()
                    + " exists");
            if (Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS)) {
                System.out.println(path.getFileName() + " is a directory");
            } else {
                System.out.println(path.getFileName() + " is a file");
            }
        } else {
            System.out.println("The file/directory " + path.getFileName() + " does not exist");
        }
    }
}
