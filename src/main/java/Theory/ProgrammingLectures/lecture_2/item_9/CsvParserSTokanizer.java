package Theory.ProgrammingLectures.lecture_2.item_9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Created by Kovantonlenko on 09.10.2015.
 */
public class CsvParserSTokanizer {
    public static void main(String[] args) throws IOException {

        BufferedReader br = null;

        try {

            String line;

            br = new BufferedReader(new FileReader("src\\main\\java\\com\\kov\\lectures\\lecture_2\\item_9\\test.csv"));

            while ((line = br.readLine()) != null) {
                System.out.println(line);

                StringTokenizer stringTokenizer = new StringTokenizer(line, "|");

                while (stringTokenizer.hasMoreElements()) {

                    Integer id = Integer.parseInt(stringTokenizer.nextElement().toString());
                    String username = stringTokenizer.nextElement().toString();
                    Integer code = Integer.parseInt(stringTokenizer.nextElement().toString());


                    StringBuilder sb = new StringBuilder();
                    sb.append("\nId : " + id);
                    sb.append("\nUsername : " + username);
                    sb.append("\nCode : " + code);
                    sb.append("\n*******************\n");

                    System.out.println(sb.toString());
                }
            }

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
