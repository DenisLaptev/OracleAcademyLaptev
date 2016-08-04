package Theory.MyProperties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by lapte on 19.07.2016.
 */
public class CreatePropertiesFile {
    // Класс создаёт .properties-файл ("db.properties").
    public static void main(String[] args) {

        Properties properties = new Properties();

        properties.put("login", "my_login");
        properties.put("rus_login", "Вася");
        properties.put("rus_login_unicode", "\u0412\u0430\u0441\u044f");
        properties.put("password", "my_password");
        properties.put("email", "laptev.denis@mail.ru");

        try {
            properties.store(new FileOutputStream("db.properties"),"comment DataBase");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
