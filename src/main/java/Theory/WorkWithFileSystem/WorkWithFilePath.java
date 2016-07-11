package Theory.WorkWithFileSystem;

/**
 * Created by lapte on 07.07.2016.
 * Описание программ по работе с файловыми путями:
 * http://www.quizful.net/post/java-nio-tutorial
 *
 *
 */


import java.nio.file.*;

public class WorkWithFilePath {

    public static void main(String[] args) {

        // для LINUX: Cоздание объекта Path через вызов статического метода get() класса Paths
        //Path testFilePath = Paths.get("/home/heorhi/testfile.txt");

        //Пример строки создания объекта Path пути для запуска в Windows
        Path testFilePath = Paths.get("C:\\Users\\lapte\\IdeaProjects\\OracleAcademyMavenProject\\src\\main\\java\\Theory\\WorkWithFileSystem\\testfile.txt");
        //Path testFilePath = Paths.get("src\\main\\java\\Theory\\WorkWithFileSystem\\testfile.txt");

        //Вывод инормации о файле
        System.out.println("Printing file information: ");
        System.out.println("\t file name: " + testFilePath.getFileName());
        System.out.println("\t root of the path: " + testFilePath.getRoot());
        System.out.println("\t parent of the target: "
                + testFilePath.getParent());

        //Вывод элементов пути
        System.out.println("Printing elements of the path: ");
        for (Path element : testFilePath) {
            System.out.println("\t path element: " + element);
        }
    }
}
/*

    Пояснения к коду:

        Сначала создаётся объект класса Path, с использованием метода get () класса.
        Данный метод принимает строку, содержащую путь.

        Обратите внимание на использование управляющего
        символа '\' в Paths.get("D:\\test\\testfile.txt") для Windows-систем.
        Без него '\t' будет интерпретироваться как символ табуляции,
        что приведёт к java.nio.file.InvalidPathException при запуске программы,
        т.к. символы табуляции не могут содержаться в путях.
        (На мой взгляд пути Linux-систем более удобны для программистов,
        т.к. используют символ слэша, не требующий экранирования.)

        Затем происходит извлечение имени файла с использованием
        метода getFilename() объекта Path

        Далее используется метод getRoot() для получения корневого
        элемента объекта Path и метод getParent() для получения
        родительской директории целевого файла.

        В конце данного примера происходит обход елементов
        пути с помощью цикла foreach.
        Как альтернативу можно использовать обычный цикл и методы getNameCount()
        (для получения числа элементов в пути) и getName(index)
        (для получения элемента по индексу).

*/
