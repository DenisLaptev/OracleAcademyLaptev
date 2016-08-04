package Theory.WorkWithFileSystem;

import java.io.File;
import java.util.ArrayList;


/**
 * Created by lapte on 07.07.2016.
 */
public class FileList5 {
    public static void main(String[] args) {
        String [] [] arrayOfArrays = new String [30] [30];
        ArrayList<String> myFiles;
        String adress = "C:\\Users\\lapte\\IdeaProjects\\OracleAcademyMavenProject\\src\\main\\java\\HomeWork.Programming.Practice1";
        File startDir = new File(adress); // стартовый каталог
        arrayOfArrays = recursionMethod(startDir); // основной метод, вся магия там

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 30; j++) {
                System.out.print(arrayOfArrays[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static String [] [] recursionMethod(File startDir) {
        String [] [] arrayOfArrays = new String [30] [30];
        int i =0;
        int j =0;

        for (File f : startDir.listFiles()) {
            if (f.isDirectory()) { // есди это каталог, рекурсивно вызываем основной метод
                recursionMethod(f);
                j++;
                continue;
            }
            if (f.isFile()) {
                System.out.println(f.getAbsolutePath()); // то, что нам надо по условию
                arrayOfArrays[i][j] = f.getAbsolutePath();
                i++;
            }
        }
        return arrayOfArrays;
    }
}


