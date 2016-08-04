package Practice4;

import java.io.*;

/**
 * Created by lapte on 22.07.2016.
 */
public class Task5 {

    public static String read(String fileName) throws IOException {
// Метод читает текст из файла и выдаёёт текст.
        File file = new File(fileName);

        //Этот спец. объект для построения строки
        StringBuilder sb = new StringBuilder();


        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
            try {
                //В цикле построчно считываем файл
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                //Также не забываем закрыть файл
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

        //Возвращаем полученный текст с файла
        return sb.toString();
    }

    public static void writeNoBuffer(String fileName, String text) {
        //Определяем файл
        File file = new File(fileName);

        try {
            //проверяем, что если файл не существует то создаем его
            if(!file.exists()){
                file.createNewFile();
            }

            //PrintWriter обеспечит возможности записи в файл
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                //Записываем текст у файл
                out.print(text);
            } finally {
                //После чего мы должны закрыть файл
                //Иначе файл не запишется
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }



    public static void writeWithBuffer(String fileAddress, String text) {


        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileAddress)))
        {
            bw.write(text);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }




        public static void writeWithBufferExample(String[] args) {

            try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\SomeDir\\notes4.txt")))
            {
                String text = "Привет мир!";
                bw.write(text);
            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }
        }


    public static void main(String[] args) throws IOException {
        // Адрес файла с которого будем копировать содержимое.
        String addressOfOldFile = "src\\main\\java\\Practice4\\EnglishText.txt";

        // Адрес нового файла для копирования с использованием небуфферизированных потоков..
        String addressOfNotBufferedFile = "src\\main\\java\\Practice4\\FileNotBuffered.txt";

        // Адрес нового файла для копирования с использованием буфферизированных потоков..
        String addressOfBufferedFile = "src\\main\\java\\Practice4\\FileBuffered.txt";

        String textfromFile = read(addressOfOldFile);
        System.out.println(textfromFile);


    }
}
