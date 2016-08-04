package Theory.ProgrammingLectures.lecture_6_IO.item_4;

import java.io.*;
import java.util.Arrays;

/**
 * Created by Kovantonlenko on 11/30/2015.
 */
public class ByteReader {
    public static void main(String[] args) {
        File file = new File("C:\\MAIN\\workspase\\untitled\\target\\classes\\com\\kov\\luckySales\\dao\\impl\\UserDaoImpl.txt");
//        File file = new File("src\\main\\java\\com\\kov\\lecture_6_IO\\item_4\\simple.txt");

        byte[] classIdentifier = {(byte) 0xCA, (byte) 0xFE, (byte) 0xBA, (byte) 0xBE}; // .class ������ 4� (0xCA0xFE0xBA0xBE) ����� ������ ���������� ��� ���������� �����.

        try (InputStream inputStream = new FileInputStream(file)) {
            byte buffer[] = new byte[4];

            if (inputStream.read(buffer) != -1) {
                if(Arrays.equals(classIdentifier, buffer)){
                    System.out.println("This file has .class extension");
                }else {
                    System.out.println("This is not a .class file");
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Can not find current file");
        } catch (IOException e) {
            System.out.println("error when processing file");
        }

    }
}
