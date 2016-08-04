/*
package Theory.ProgrammingLectures.lecture_6_IO.item_9;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

*/
/**
 * Created by Kovantonlenko on 12/1/2015.
 *//*

public class JsonSimpleExample {
    static String filePath = "src\\main\\java\\com\\lap\\lecture_6_IO\\item_9\\jsonEx.json";

    public static void main(String[] args) throws IOException, org.json.simple.parser.ParseException {

//        readJson();
        writeJson();
    }

    public static void writeJson() throws org.json.simple.parser.ParseException, IOException {
        JSONObject obj = new JSONObject();
        obj.put("name", "Karl");
        obj.put("age", 25);

        JSONArray list = new JSONArray();
        list.add("msg 1");
        list.add("msg 2");
        list.add("msg 3");

        obj.put("messages", list);

        FileWriter file = new FileWriter(filePath);
        file.write(obj.toJSONString());
        file.close();

        System.out.print(obj);
    }

    public static void readJson() throws org.json.simple.parser.ParseException, IOException {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader(filePath));

        JSONObject jsonObject = (JSONObject) obj;

        String name = (String) jsonObject.get("name");
        System.out.println(name);

        long age = (Long) jsonObject.get("age");
        System.out.println(age);


        JSONArray msg = (JSONArray) jsonObject.get("messages");
        Iterator<String> iterator = msg.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
*/
