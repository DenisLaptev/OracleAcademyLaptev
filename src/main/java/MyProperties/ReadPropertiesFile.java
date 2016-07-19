package MyProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by lapte on 19.07.2016.
 */
public class ReadPropertiesFile {
    // минусом класса Properties является то, что нельзя задавать кодировку для чтения.
    // и могут возникнуть проблемы с русскими словами.
    // Выход есть. Если хотим сохранить что-то на русском языке, надо
    // это хранить, как юникод-последовательность. Исп. онлайн юникод-конвертер.
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("db.properties"));
        //properties.load(new FileInputStream("C:\\Users\\lapte\\IdeaProjects\\OracleAcademyMavenProject\\db.properties"));

        System.out.println("Login: " + properties.get("login"));
        System.out.println("Password: " + properties.get("password"));
        System.out.println("E-mail: " + properties.get("email"));
        System.out.println("rus_login: " + properties.get("rus_login"));
        System.out.println("rus_login_unicode: " + properties.get("rus_login_unicode"));
    }
}
