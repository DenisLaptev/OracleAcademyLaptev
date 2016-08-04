package Theory.ProgrammingLectures.lecture_6_IO.Item_2;

import java.io.*;

/**
 * Created by Kovantonlenko on 11/30/2015.
 */
public class MyBufferReader {
    public static void main(String[] args) throws IOException {

        String fileForRead = "src\\main\\java\\com\\kov\\lecture_6_IO\\item_2\\readEx.txt";
        String fileForWrite = "src\\main\\java\\com\\kov\\lecture_6_IO\\item_2\\writeEx.txt";

        Reader reader = null;
        PrintWriter writer = null;
        BufferedReader bufferedReader;

        try {
            reader = new FileReader(new File(fileForRead));
            bufferedReader = new BufferedReader(reader);

            writer = new PrintWriter(new File(fileForWrite));

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                writer.println(line);
                writer.flush(); // ��������� ������
            }

        } catch (FileNotFoundException e) {
            System.out.println("Can not find current file");
        } catch (IOException e) {
            System.out.println("error when processing file");
        }finally {
            if(reader != null){
                reader.close();
            }
            if(writer != null){
                writer.close();
            }
        }
    }
}
