package Theory.MyGson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by lapte on 19.07.2016.
 */
public class MyGson {
    // Формат Json используют, если надо передать объекты между клиентом и сервером.
    // Можно объекты передавать в виде байтов, но удобней в формате
    // Json, в читабельном формате.
    public static void main(String[] args) {

        // Представляем объект в формате Gson (Google Json) и выводим на экран.
        Human human = new Human("Vasja", "Pupkin", 25, 80.5, "scientists");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String humanJson = gson.toJson(human);

        System.out.println(humanJson);



        // Обратная процедура. Вписываем в объект данные формата gson.
        Human vasja = gson.fromJson(humanJson, Human.class);

        System.out.println(vasja);

    }
}
