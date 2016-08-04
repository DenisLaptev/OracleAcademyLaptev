package Theory.ProgrammingLectures.lecture_6_IO.item_1;

import java.io.*;

/**
 * Created by Kovantonlenko on 11/30/2015.
 */
public class MyReader {
    public static void main(String[] args) {

        File file = new File("srasdfc\\main\\java\\com\\kov\\lecture_6_IO\\item_1\\example.txt");

        try (Reader inputStream = new FileReader(file)) {
            int val;

            while ((val = inputStream.read()) != -1) {
                System.out.println((char)val);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Can not find current file");
        } catch (IOException e) {
            System.out.println("error when processing file");
        }

    }
}
