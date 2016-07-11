package Theory.WorkWithFileSystem;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by lapte on 07.07.2016.
 */

public class FileList {

    public static void main(String[] args) {
        String adress = "C:\\Users\\lapte\\IdeaProjects\\OracleAcademyMavenProject\\src\\main\\java\\Theory\\WorkWithFileSystem";
        File startDir = new File(adress); // стартовый каталог
        magicHere(startDir); // основной метод, вся магия там
    }

    static void magicHere(File startDir) {
        // перебираем в цикле все элементы списка (там файлы и каталоги)
        for (File f : startDir.listFiles()) {
            if (f.isDirectory()) { // есди это каталог, рекурсивно вызываем основной метод
                magicHere(f);
                continue;
            }
            if (f.isFile()) {
                System.out.println(f.getAbsolutePath()); // то, что нам надо по условию
            }
        }
    }
}