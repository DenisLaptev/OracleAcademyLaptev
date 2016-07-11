package ProgrammingLectures.lecture_6_IO.item_10;



import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kovantonlenko on 12/1/2015.
 */
class JsonObjectStorage {

    static String filePath = "C:\\Users\\lapte\\IdeaProjects\\OracleAcademyMavenProject\\src\\main\\java\\ProgrammingLectures\\lecture_6_IO\\item_10\\jsonObj.json";

    public static void main(String[] args) throws IOException {

        List<Test> list = new ArrayList<>();
        list.add(new Test(100, "testInner", null));

        Test test = new Test(10, "Test", list);

        Gson gson = new Gson();

        // convert java object to JSON format,
        // and returned as JSON formatted string
        String json = gson.toJson(test);


        //write converted json data to a file named "file.json"
        FileWriter writer = new FileWriter(filePath);
        writer.write(json);
        writer.close();


        System.out.println(json);

    }
}
class Parent{
    public String parentName = "parent";
}
class Test extends Parent{
    int age;
    String name;
    List<Test> stringList;

    public Test(int age, String name, List<Test> stringList) {
        this.age = age;
        this.name = name;
        this.stringList = stringList;
    }

    @Override
    public String toString() {
        return "Test{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", stringList=" + stringList +
                '}';
    }
}
