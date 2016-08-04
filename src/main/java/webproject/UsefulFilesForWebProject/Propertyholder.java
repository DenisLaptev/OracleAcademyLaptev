package webproject.UsefulFilesForWebProject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lapte on 07.07.2016.
 */
public class Propertyholder {

    private static Propertyholder instance = null;

    protected Propertyholder() throws IOException {
    }

    // Lazy Initialization (If required then only)
    public static Propertyholder getInstance() throws IOException {
        if (instance == null) {
            // Thread Safe. Might be costly operation in some case
            synchronized (Propertyholder.class) {
                if (instance == null) {
                    instance = new Propertyholder();
                }
            }
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

        Propertyholder PropertyHolder = new Propertyholder();

        // Достаём информацию из синглтона, которая, в свою очередь, там из файла.
        myInformationFromSingleton = PropertyHolder.getMyInformation();

        System.out.println(myInformationFromSingleton);

    }
}
