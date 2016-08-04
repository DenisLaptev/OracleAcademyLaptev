package HomeWork.Programming.Practice4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

/**
 * Created by lapte on 20.07.2016.
 */
public class PropertiesFile {
    // Класс создаёт файл, содержаший список студентов и их оценки
    // в формате:
    // Ivan Ivanov = 90.
    public static void main(String[] args) {

        Properties properties = new Properties();
        Random random = new Random();

        String strKey;
        int intValue;
        String strValue;
        for (int i = 0; i < 20; i++) {
            strKey = "Student" + i;
            intValue = 80 + random.nextInt(20);
            strValue = Integer.toString(intValue);
            properties.put(strKey, strValue);
        }

        try {
            properties.store(new FileOutputStream("C:\\Users\\lapte\\IdeaProjects\\OracleAcademyMavenProject\\src\\main\\java\\HomeWork.Programming.Practice4\\students_marks.properties"),"The marks of the students");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
