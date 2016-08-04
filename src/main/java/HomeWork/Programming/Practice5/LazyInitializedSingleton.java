package HomeWork.Programming.Practice5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lapte on 30.06.2016.
 * <p>
 * Написать синглетон (PropertyHolder) который при инициализации
 * будет читать файл application.properties и сохранять (в себе)
 * значения ключей из этого файла и предоставлять к ним доступ.
 */
public class LazyInitializedSingleton {
    //Синглтон - это любой класс, который может существовать
    //ТОЛЬКО в ОДНОМ экземпляре.

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() throws IOException {
    }

    public static LazyInitializedSingleton getInstance() throws IOException {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

    //Строки выше были необходимы, чтобы сделать данный класс синглтоном.

    //Берём информацию из файла, расположенного по адресу myAddress,
    //используя метод getInformationFromFile.

    //
    // Абсолютный адрес:
    //
    // String myAddress = "C:\\Users\\lapte\\IdeaProjects\\OracleAcademyMavenProject\\src\\main\\resources\\application.properties";
    //
    // Лучше использовать относительный адрес.
    String myAddress = "src\\main\\resources\\application.properties";
    private ArrayList<String> myInformation = getInformationFromFile(myAddress);

    //Данный метод позволяет выдавать информацию во вне из синглтона.
    public ArrayList<String> getMyInformation() {
        return myInformation;
    }

    // Метод, считывает из файла application.properties,
    // в котором содержится :
    // luckySales.user=testUser
    // значение параметра luckySales.user.
    // Вообще метод возвращает ArrayList<String> значений, соответствующих ключам.
    // ключ=значение определяются по правилу:
    // String regex = "(.*)=(.*)";
    public static ArrayList<String> getInformationFromFile(String addressOfFile) throws IOException {

        ArrayList<String> myInformation = new ArrayList<String>();
        String str = new String(Files.readAllBytes(Paths.get(addressOfFile)));
        String regex = "(.*)=(.*)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            //if (matcher.find()) {

                myInformation.add(matcher.group(2));

            //} else {
            //    System.out.println("NO MATCH");
            //}

        }
        return myInformation;

    }


    public static void main(String[] args) throws IOException {

        ArrayList<String> myInformationFromSingleton;

        LazyInitializedSingleton PropertyHolder = new LazyInitializedSingleton();

        // Достаём информацию из синглтона, которая, в свою очередь, там из файла.
        myInformationFromSingleton = PropertyHolder.getMyInformation();

        System.out.println(myInformationFromSingleton);

    }
}
