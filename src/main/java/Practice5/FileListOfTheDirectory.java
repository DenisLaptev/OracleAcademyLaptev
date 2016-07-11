package Practice5;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by lapte on 07.07.2016.
 */
public class FileListOfTheDirectory {
    public static void main(String[] args) {
        ArrayList<String> myFiles = new ArrayList<>();
        String adress = "C:\\Users\\lapte\\IdeaProjects\\OracleAcademyMavenProject\\src\\main\\java\\Practice1";
        //String adress = "С:\\";
        //String adress = "С:\\Users";

        File startDir = new File(adress); // стартовый каталог
        myFiles = recursionMethod(startDir, myFiles); // основной метод, вся магия там

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (String myFile : myFiles) {
            System.out.println(myFile);
        }
    }
    //String [] [] arrayOfArrays = new String [30] [30];
    static ArrayList<String> recursionMethod(File startDir, ArrayList<String> files) {

        // перебираем в цикле все элементы списка (там файлы и каталоги)

        for (File f : startDir.listFiles()) {
            if (f.isDirectory()) { // есди это каталог, рекурсивно вызываем основной метод
                recursionMethod(f,files);
                continue;
            }
            if (f.isFile()) {
                //System.out.println(f.getAbsolutePath()); // то, что нам надо по условию
                files.add(f.getAbsolutePath());
            }
        }
        return files;
    }
}
