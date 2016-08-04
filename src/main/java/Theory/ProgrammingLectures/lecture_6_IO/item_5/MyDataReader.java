package Theory.ProgrammingLectures.lecture_6_IO.item_5;

import java.io.*;

/**
 * Created by Kovantonlenko on 11/30/2015.
 */
public class MyDataReader {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\MAIN\\workspase\\untitled\\target\\classes\\com\\kov\\luckySales\\dao\\impl\\UserDaoImpl.class");

        int extension = 0xCAFEBABE;

        try (DataInputStream inputStream = new DataInputStream(new FileInputStream(file))) {
            while (true) {
                int specialSymbol = inputStream.readInt();
                if (specialSymbol == extension) {
                    System.out.println("This is a .class extension");
                }
            }

        } catch (EOFException e) {
            System.out.println("End of the file"); // EOF �������, ��� ������ � ����� ���������, � �� -1 ��� �� ������ ��� �����.
        } catch (IOException e) {
            System.out.println("file not found");
        }
    }
}