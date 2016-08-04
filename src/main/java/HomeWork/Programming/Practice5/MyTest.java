package HomeWork.Programming.Practice5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lapte on 30.06.2016.
 */
public class MyTest {
    public static void main(String[] args) throws IOException {
        String myAddress = "C:\\Users\\lapte\\IdeaProjects\\OracleAcademyMavenProject\\src\\main\\resources\\application.properties";
        String str = new String(Files.readAllBytes(Paths.get(myAddress)));
        System.out.println(str);


        //String str = "luckySales.user=testUser";
        String regex = "(.*)=(.*)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(str);


        } else {
            System.out.println("NO MATCH");
        }


        String line = "This order was placed for QT 3 ! OK?";
        String pattern1 = "(.*)(\\d+)(.*)";
        Pattern r = Pattern.compile(pattern1);
        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
            System.out.println("Found value: " + m.group(3));
        } else {
            System.out.println("NO MATCH");
        }

    }
}
